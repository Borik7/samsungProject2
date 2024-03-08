package Project.First;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import java.util.ArrayList;
import java.util.List;

import Project.First.databinding.ActivityAddToCartBinding;
import Project.First.databinding.ActivityMain3Binding;

public class AddToCart extends AppCompatActivity {
    RecyclerView recyclerView;
    private List<Product> productList;
    private ProductAdapter productAdapter;
    private String categoryId;
    ActivityAddToCartBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddToCartBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = new Intent(this,Divan_1.class);
        intent.putExtra("categoryId", "YCgYT6dREsVY7Hub8SLj");
        intent.putExtra("productId", "OFipHVkV65Vaw46OWuzr");
        /*recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setOnClickListener(view ->{

        });*/
        productList = new ArrayList<>();
        productAdapter = new ProductAdapter(productList, getApplicationContext());
        recyclerView.setAdapter(productAdapter);
        categoryId = "YCgYT6dREsVY7Hub8SLj";
        binding.loading.setVisibility(View.VISIBLE);
        recyclerView.setVisibility(View.GONE);
        getProducts();
    }
    private void getProducts() {
        FirebaseFirestore.getInstance().collection("categories").document(categoryId).collection("products")
                .get()
                .addOnSuccessListener(queryDocumentSnapshots -> {
                    productList.clear();
                    for (QueryDocumentSnapshot documentSnapshot : queryDocumentSnapshots) {
                        Product product = new Product();
                        product.image = documentSnapshot.getString("imageUrl");
                        product.name = documentSnapshot.getString("name");
                        product.price = documentSnapshot.getString("price");
                        product.productId = documentSnapshot.getId();
                        product.categoryId = categoryId;
                        productList.add(product);
                    }
                    productAdapter.notifyDataSetChanged();
                });
        binding.loading.setVisibility(View.GONE);
        recyclerView.setVisibility(View.VISIBLE);
    }
    private void loading(boolean isLoading) {
        if (isLoading) {
            binding.loading.setVisibility(View.VISIBLE);
        } if(isLoading == false) {
            binding.loading.setVisibility(View.GONE);
        }
    }
}