package Project.First;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import java.util.ArrayList;
import java.util.List;

import Project.First.databinding.ActivityAddToCartBinding;

public class AddToCart extends AppCompatActivity {
    RecyclerView recyclerView;
    public Cart cart;
    private CartAdapter cartAdapter;
    private String categoryId;
    private String itemcount;
    private String itemprice;
    TextView price;
    private List<CartItem> cartItemList;
    TextView name;

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
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setOnClickListener(view ->{

        });
        recyclerView = binding.recyclerView;
        cart = new Cart();
        name = findViewById(R.id.textView2);
        price = findViewById(R.id.textView1);
        cartItemList = new ArrayList<>();
        cartAdapter = new CartAdapter(cartItemList, getApplicationContext());
        recyclerView.setAdapter(cartAdapter);
        getProducts();
        //binding.loading.setVisibility(View.VISIBLE);
        cartAdapter = new CartAdapter(cartItemList, getApplicationContext());
        recyclerView.setAdapter(cartAdapter);
        loading(true);

    }
    private void getProducts() {
        //FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
//        DocumentReference productRef = FirebaseFirestore.getInstance().collection("carts").whereEqualTo("deviceId", deviceId);
//        productRef.get()
//                .addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
//                    @Override
//                    public void onSuccess(DocumentSnapshot documentSnapshot) {
//                        if (documentSnapshot.exists()) {
//                           description.setText(documentSnapshot.getString("Description"));
//                            name.setText(documentSnapshot.getString("name"));
//                            koj.setText(documentSnapshot.getString("Koj"));
//                            ktor.setText(documentSnapshot.getString("Ktor"));
//                            erkchap.setText(documentSnapshot.getString("Erkchap"));
//                            garantia.setText(documentSnapshot.getString("Garantya"));
//                            desc3d.setText(documentSnapshot.getString("3ddesc"));
//                            tevkoj.setText(documentSnapshot.getString("Tevkoj"));
//                            erkchap1.setText(documentSnapshot.getString("Erkchap1"));
//                            erkchap2.setText(documentSnapshot.getString("Erkchap2"));
//                            erkchap3.setText(documentSnapshot.getString("Erkchap3"));
//                            //binding.loading.setVisibility(View.GONE);
//                            name.setText(documentSnapshot.getString("name"));
//                            price.setText(documentSnapshot.getString("price"));
//                            loading(false);
//                        }
//                    }
//                });
//        loading(false);
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            FirebaseFirestore db = FirebaseFirestore.getInstance();
            String userId = user.getUid(); // Assuming user is already defined

// Query for carts with the specified device ID
            db.collection("carts")
                    .whereEqualTo("deviceId", userId)
                    .get()
                    .addOnSuccessListener(queryDocumentSnapshots -> {
                        for (QueryDocumentSnapshot documentSnapshot : queryDocumentSnapshots) {
                            // Get the cart ID
                            String cartId = documentSnapshot.getId();

                            // Query for cart items within the cart
                            db.collection("carts").document(cartId).collection("cartItems")
                                    .get()
                                    .addOnSuccessListener(queryDocumentSnapshots1 -> {
                                        if (!queryDocumentSnapshots1.isEmpty()) {
                                            for (QueryDocumentSnapshot documentSnapshot1 : queryDocumentSnapshots1) {
                                                // Create a CartItem object and add it to the list
                                                CartItem cartItem = new CartItem();
                                                cartItem.itemCount =  documentSnapshot1.get("itemCount", Integer.class);
                                                cartItem.itemId = documentSnapshot1.getString("itemId");
                                                cartItem.categoryId = documentSnapshot1.getString("categoryId");
                                                cartItem.price = documentSnapshot1.get("price", Integer.class);
                                                cartItem.cartId = cartId;
                                                cartItem.cartItemId = documentSnapshot1.getId();
                                                cartItemList.add(cartItem);
                                            }
                                            // Notify the adapter after adding all cart items for the current cart
                                            cartAdapter.notifyDataSetChanged();
                                            loading(false);
                                        } else {
                                            Toast.makeText(this, "Document snapshot is empty", Toast.LENGTH_LONG).show();
                                            loading(false);
                                        }
                                    });
                        }
                    })
                    .addOnFailureListener(e -> {
                        // Handle errors
                        Log.e("TAG", "Error getting carts: " + e.getMessage());
                    });
            loading(false);

        }
        loading(false);
    }
    private void loading(boolean isLoading) {
        if (isLoading == true) {
            binding.loading.setVisibility(View.VISIBLE);
        } if(isLoading == false) {
            binding.loading.setVisibility(View.GONE);
        }
    }
}