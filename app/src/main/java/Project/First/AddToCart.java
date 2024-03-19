/*package Project.First;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Project.First.databinding.ActivityAddToCartBinding;

public class AddToCart extends AppCompatActivity {
    RecyclerView recyclerView;
    public Cart cart;
    private ProductAdapter productAdapter;
    private String categoryId;
    private String itemcount;
    private String itemprice;
    TextView price;
    private List<Product> productList;
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
        /*recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setOnClickListener(view ->{

        });
        recyclerView = binding.recyclerView;
        cart = new Cart();
        name = findViewById(R.id.textView2);
        price = findViewById(R.id.textView1);
        productList = new ArrayList<>();
        productAdapter = new ProductAdapter(productList, getApplicationContext());
        recyclerView.setAdapter(productAdapter);
        getProducts();
        //binding.loading.setVisibility(View.VISIBLE);
        /*productAdapter = new ProductAdapter(productList, getApplicationContext());
        recyclerView.setAdapter(productAdapter);
        //recyclerView.setVisibility(View.GONE);
    }
    private void getProducts() {
        //FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        /*DocumentReference productRef = FirebaseFirestore.getInstance().collection("carts").whereEqualTo("deviceId", deviceId);
        productRef.get()
                .addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                    @Override
                    public void onSuccess(DocumentSnapshot documentSnapshot) {
                        if (documentSnapshot.exists()) {
                           /* description.setText(documentSnapshot.getString("Description"));
                            name.setText(documentSnapshot.getString("name"));
                            koj.setText(documentSnapshot.getString("Koj"));
                            ktor.setText(documentSnapshot.getString("Ktor"));
                            erkchap.setText(documentSnapshot.getString("Erkchap"));
                            garantia.setText(documentSnapshot.getString("Garantya"));
                            desc3d.setText(documentSnapshot.getString("3ddesc"));
                            tevkoj.setText(documentSnapshot.getString("Tevkoj"));
                            erkchap1.setText(documentSnapshot.getString("Erkchap1"));
                            erkchap2.setText(documentSnapshot.getString("Erkchap2"));
                            erkchap3.setText(documentSnapshot.getString("Erkchap3"));
                            //binding.loading.setVisibility(View.GONE);
                            name.setText(documentSnapshot.getString("name"));
                            price.setText(documentSnapshot.getString("price"));
                            loading(false);
                        }
                    }
                });
        loading(false);
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            FirebaseFirestore.getInstance().collection("carts").whereEqualTo("deviceId", user.getUid())
                    .get()
                    .addOnSuccessListener(queryDocumentSnapshots -> {
                        productList.clear();
                        for (QueryDocumentSnapshot documentSnapshot : queryDocumentSnapshots) {
                            String documentId = documentSnapshot.getId();

                            FirebaseFirestore.getInstance().collection("carts").document(documentId)
                                    .collection("cartItems")
                                    .get()
                                    .addOnSuccessListener(subCollectionQueryDocumentSnapshots -> {
                                        for (QueryDocumentSnapshot subDocumnetSnapshot : subCollectionQueryDocumentSnapshots) {
                                            String itemId = subDocumnetSnapshot.getString("itemId");
                                            String categoryId = subDocumnetSnapshot.getString("categoryId");
                                            FirebaseFirestore.getInstance().collection("categories").document(categoryId).collection("products").document(itemId)
                                                    .get()
                                                    .addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                                                        @Override
                                                        public void onSuccess(DocumentSnapshot documentSnapshot) {
                                                            Product product = new Product();
                                                            product.name = documentSnapshot.getString("name");
                                                            product.price = documentSnapshot.getString("price");
                                                            product.image = documentSnapshot.getString("image");
                                                            product.productId = documentSnapshot.getId();
                                                            productList.add(product);
                                                        }
                                                    });
//                                            FirebaseFirestore.getInstance().collection("products").document(itemId)
//                                                    .get()
//                                                    .addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
//                                                        @Override
//                                                        public void onSuccess(DocumentSnapshot documentSnapshot) {
//                                                            Product product = new Product();
//                                                            product.name = documentSnapshot.getString("name");
//                                                            product.price = documentSnapshot.getString("price");
//                                                            product.image = documentSnapshot.getString("image");
//                                                            product.productId = documentSnapshot.getId();
//                                                            productList.add(product);
//                                                        }
//                                                    });
                                        }
                                    });
                        }
                        productAdapter.notifyDataSetChanged();
                    });
        }
    }
    /*private void loading(boolean isLoading) {
        if (isLoading) {
            binding.loading.setVisibility(View.VISIBLE);
        } if(isLoading == false) {
            binding.loading.setVisibility(View.GONE);
        }
    }
}*/