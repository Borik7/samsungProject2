package Project.First;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

import Project.First.databinding.ActivityAddToCartBinding;

public class AddToCart extends AppCompatActivity {
    RecyclerView recyclerView;
    public Cart cart;
    private ProductAdapter productAdapter;
    private String deviceId;
    private String categoryId;

    ActivityAddToCartBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddToCartBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = new Intent(this,Divan_1.class);
        intent.putExtra("categoryId", "YCgYT6dREsVY7Hub8SLj");
        intent.putExtra("deviceId", "Xt0aiRyqULXnFBaIPc5NFt1QWWJ3");
        intent.putExtra("productId", "OFipHVkV65Vaw46OWuzr");
        /*recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setOnClickListener(view ->{

        });*/
        cart = new Cart();
        //productAdapter = new ProductAdapter(productList, getApplicationContext());
        recyclerView.setAdapter(productAdapter);
        deviceId = "Xt0aiRyqULXnFBaIPc5NFt1QWWJ3";
        categoryId = "YCgYT6dREsVY7Hub8SLj";
        binding.loading.setVisibility(View.VISIBLE);
        recyclerView.setVisibility(View.GONE);
        getProducts();
    }
    private void getProducts() {
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            FirebaseFirestore.getInstance().collection("carts")
                    .whereEqualTo("deviceId", user.getUid())
                    .limit(1)
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {
                            if (task.isSuccessful()) {
                                // Check if the query result contains any documents
                                if (!task.getResult().isEmpty()) {
                                    // Get the first document from the query result
                                    DocumentSnapshot document = task.getResult().getDocuments().get(0);
                                    // Retrieve the data from the document
                                    cart.deviceId = document.getString("deviceId");

                                    CollectionReference cartItemsRef = document.getReference().collection("cartItems");
                                    cartItemsRef.get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                                        @Override
                                        public void onComplete(@NonNull Task<QuerySnapshot> task) {
                                            if (task.isSuccessful()) {
                                                cart.cartItems = new ArrayList<>();
                                                for (DocumentSnapshot cartItemDoc : task.getResult().getDocuments()) {
                                                    CartItem cartItem = new CartItem();
                                                    cartItem.itemCount = cartItemDoc.getString("itemCount");
                                                    cartItem.itemId = cartItemDoc.getString("itemId");
                                                    cart.cartItems.add(cartItem);
                                                }
                                            }
                                        }
                                    });
                                } else {
                                    Toast.makeText(AddToCart.this, "Error", Toast.LENGTH_SHORT).show();
                                }
                            } else {
                                Toast.makeText(AddToCart.this, "Error", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }


        /*FirebaseFirestore.getInstance().collection("carts")
                .get()
                .addOnSuccessListener(queryDocumentSnapshots -> {
                    productList.clear();
                    for (QueryDocumentSnapshot documentSnapshot : queryDocumentSnapshots) {
                        Product product = new Product();
                        product.image = documentSnapshot.getString("imageUrl");
                        product.name = documentSnapshot.getString("name");
                        product.price = documentSnapshot.getString("price");
                        product.deviceId = documentSnapshot.getString("deviceId");
                        product.productId = documentSnapshot.getId();
                        product.categoryId = categoryId;
                        productList.add(product);
                    }
                    productAdapter.notifyDataSetChanged();
                });
        binding.loading.setVisibility(View.GONE);
        recyclerView.setVisibility(View.VISIBLE);*/
    }
    private void loading(boolean isLoading) {
        if (isLoading) {
            binding.loading.setVisibility(View.VISIBLE);
        } if(isLoading == false) {
            binding.loading.setVisibility(View.GONE);
        }
    }
}