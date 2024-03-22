package Project.First;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import java.util.ArrayList;
import java.util.List;

import Project.First.databinding.ActivityMain5Binding;

public class MainActivity5 extends AppCompatActivity {

    ConstraintLayout ugalok1;
    ConstraintLayout ugalok2;
    ConstraintLayout ugalok3;
    ConstraintLayout ugalok4;
    RecyclerView recyclerView;
    private List<Product> productList;
    private ProductAdapter productAdapter;
    String categoryId;
    ActivityMain5Binding binding;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain5Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = new Intent(this,Divan_1.class);
        intent.putExtra("categoryId", "YCgYT6dREsVY7Hub8SLj");
        intent.putExtra("productId", "OFipHVkV65Vaw46OWuzr");
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setOnClickListener(view ->{
        });
        /*ugalok1 = findViewById(R.id.ugalok1222);
        ugalok1.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity4.this, Ugalok_1.class);
            startActivity(intent);
        });
        ugalok2 = findViewById(R.id.ugalok2);
        ugalok2.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity4.this, Ugalok_2.class);
            startActivity(intent);
        });
        ugalok3 = findViewById(R.id.ugalok3);
        ugalok3.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity4.this, Ugalok_3.class);
            startActivity(intent);
        });
        ugalok4 = findViewById(R.id.ugalok4);
        ugalok4.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity4.this, Ugalok_4.class);
            startActivity(intent);
        });*/
        recyclerView = findViewById(R.id.recyclerView);
        productList = new ArrayList<>();
        productAdapter = new ProductAdapter(productList, getApplicationContext());
        recyclerView.setAdapter(productAdapter);
        categoryId = "4ZC4YxXPPwIDMFnA1hVY";
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