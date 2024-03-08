package Project.First;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import java.util.ArrayList;
import java.util.List;

import Project.First.databinding.ActivityDivan1Binding;
import Project.First.databinding.ActivityMain3Binding;

public class MainActivity3 extends AppCompatActivity {
    ConstraintLayout divan1;
    ConstraintLayout divan2;
    ConstraintLayout divan3;
    ConstraintLayout divan4;
    ConstraintLayout divan5;
    RecyclerView recyclerView;
    private List<Product> productList;
    private ProductAdapter productAdapter;
    private String categoryId;
    ActivityMain3Binding binding;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = new Intent(this,Divan_1.class);
        intent.putExtra("categoryId", "YCgYT6dREsVY7Hub8SLj");
        intent.putExtra("productId", "OFipHVkV65Vaw46OWuzr");
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setOnClickListener(view ->{

        });
//        divan1 = findViewById(R.id.divan1);
//        divan1.setOnClickListener(view -> {
//            Intent intent = new Intent(MainActivity3.this, Divan_1.class);
//            startActivity(intent);
//        });
//        divan2 = findViewById(R.id.divan2);
//        divan2.setOnClickListener(view -> {
//            Intent intent = new Intent(MainActivity3.this, Divan_2.class);
//            startActivity(intent);
//        });
//        divan3 = findViewById(R.id.divan3);
//        divan3.setOnClickListener(view -> {
//            Intent intent = new Intent(MainActivity3.this, Divan_3.class);
//            startActivity(intent);
//        });
//        divan4 = findViewById(R.id.divan4);
//        divan4.setOnClickListener(view -> {
//            Intent intent = new Intent(MainActivity3.this, Divan_4.class);
//            startActivity(intent);
//        });
//        divan5 = findViewById(R.id.divan5);
//        divan5.setOnClickListener(view -> {
//            Intent intent = new Intent(MainActivity3.this, Divan_5.class);
//            startActivity(intent);
//        });

        recyclerView = findViewById(R.id.recyclerView);
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