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


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.divanner);
        }else{
            setContentView(R.layout.divan_land);
        }
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
        productAdapter = new ProductAdapter(productList);
        recyclerView.setAdapter(productAdapter);
        categoryId = "YCgYT6dREsVY7Hub8SLj";
        getProducts();
        recyclerView.setVisibility(View.VISIBLE);
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
                        productList.add(product);
                    }
                    productAdapter.notifyDataSetChanged();
                });
    }
}