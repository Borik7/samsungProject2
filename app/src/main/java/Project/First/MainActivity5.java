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


public class MainActivity5 extends AppCompatActivity {
    ConstraintLayout karavat1;
    ConstraintLayout karavat2;
    ConstraintLayout karavat3;
    ConstraintLayout karavat4;
    ConstraintLayout karavat5;

    ConstraintLayout karavat6;
    ConstraintLayout karavat8;

    RecyclerView recyclerView;
    private List<Product> productList;
    private ProductAdapter productAdapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        /*karavat1 = findViewById(R.id.karavat1);
        karavat1.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity5.this, Karavat_1.class);
            startActivity(intent);
        });
        karavat2 = findViewById(R.id.karavat2);
        karavat2.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity5.this, Karavat_2.class);
            startActivity(intent);
        });
        karavat3 = findViewById(R.id.karavat3);
        karavat3.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity5.this, Karavat_3.class);
            startActivity(intent);
        });
        karavat4 = findViewById(R.id.karavat4);
        karavat4.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity5.this, Karavat_4.class);
            startActivity(intent);
        });
        karavat5 = findViewById(R.id.karavat5);
        karavat5.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity5.this, Karavat_5.class);
            startActivity(intent);
        });
        karavat5 = findViewById(R.id.karavat5);
        karavat5.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity5.this, Karavat_6.class);
            startActivity(intent);
        });
        karavat6 = findViewById(R.id.karavat6);
        karavat6.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity5.this, Karavat_7.class);
            startActivity(intent);
        });
        karavat8 = findViewById(R.id.karavat6);
        karavat8.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity5.this, Karavat_8.class);
            startActivity(intent);
        });*/
        recyclerView = findViewById(R.id.recyclerView);
        productList = new ArrayList<>();
        productAdapter = new ProductAdapter(productList, getApplicationContext());
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