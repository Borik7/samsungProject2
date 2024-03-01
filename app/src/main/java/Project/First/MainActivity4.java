package Project.First;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import java.util.ArrayList;
import java.util.List;

public class MainActivity4 extends AppCompatActivity {

    ConstraintLayout ugalok1;
    ConstraintLayout ugalok2;
    ConstraintLayout ugalok3;
    ConstraintLayout ugalok4;
    RecyclerView recyclerView;
    private List<Product> productList;
    private ProductAdapter productAdapter;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ugalokner);
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
        productAdapter = new ProductAdapter(productList);
        recyclerView.setAdapter(productAdapter);
        getProducts();
        recyclerView.setVisibility(View.VISIBLE);
    }
    private void getProducts() {
        FirebaseFirestore.getInstance().collection("products")
                .get()
                .addOnSuccessListener(queryDocumentSnapshots -> {
                    productList.clear();
                    for (QueryDocumentSnapshot documentSnapshot : queryDocumentSnapshots) {
                        Product product = new Product();
                        product.image = documentSnapshot.getString("image");
                        product.name = documentSnapshot.getString("name");
                        product.price = documentSnapshot.getString("price");
                        productList.add(product);
                    }
                    productAdapter.notifyDataSetChanged();
                });
    }
}