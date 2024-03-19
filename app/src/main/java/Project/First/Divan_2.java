/*package Project.First;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import Project.First.databinding.ActivityDivan1Binding;
import Project.First.databinding.ActivityDivan2Binding;

public class Divan_2 extends AppCompatActivity {

    ImageView ktor1;
    ImageView ktor2;
    ImageView ktor3;
    ImageView ktor4;
    ImageView ktor5;

    ImageView koj1;
    ImageView koj2;
    ImageView koj3;
    ImageView koj4;
    ImageView koj5;
    ImageView ktor6;
    ImageView ktor7;
    ImageView ktor8;
    ImageView ktor9;
    ImageView ktor10;
    ImageView ktor11;
    ImageView tevktor1;
    ImageView tevktor2;
    ImageView tevktor3;
    ImageView tevktor4;
    ImageView tevktor5;
    ImageView tevktor6;
    ImageView tevktor7;
    ImageView tevktor8;
    ImageView tevktor9;
    ImageView tevktor10;
    ImageView tevktor11;
    ImageView tevkoj1;
    ImageView tevkoj2;
    ImageView tevkoj3;
    ImageView tevkoj4;
    ImageView tevkoj5;
    TextView description;
    TextView name;
    TextView garantia;
    TextView erkchap;
    TextView ktor;
    TextView koj;
    TextView tevkoj;
    TextView desc3d;
    private int gin = 180000;
    ActivityDivan2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDivan2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getProducts(getIntent().getStringExtra("categoryId"), getIntent().getStringExtra("productId"));
        description = findViewById(R.id.divanbacatrutyun);
        name = findViewById(R.id.name);
        garantia = findViewById(R.id.divangarantya);
        erkchap = findViewById(R.id.divanchap);
        ktor = findViewById(R.id.guyn);
        koj = findViewById(R.id.divankoj);
        desc3d = findViewById(R.id.desc3d);
        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapter1 adapter1 = new ImageAdapter1(this);
        viewPager.setAdapter(adapter1);

        koj1 = findViewById(R.id.koj_1);
        koj1.setOnClickListener(view -> {
            koj1.animate().rotationYBy(360);
            gin = 180000;
        });

        koj2 = findViewById(R.id.koj_2);
        koj2.setOnClickListener(view -> {
            koj2.animate().rotationYBy(360);
            gin = 180000;
        });

        koj3 = findViewById(R.id.koj_3);
        koj3.setOnClickListener(view -> {
            koj3.animate().rotationYBy(360);
            gin = 180000;
        });
        koj4 = findViewById(R.id.koj_4);
        koj4.setOnClickListener(view -> {
            koj4.animate().rotationYBy(360);
            gin = 180000;
        });
        koj5 = findViewById(R.id.koj_5);
        koj5.setOnClickListener(view -> {
            koj5.animate().rotationYBy(360);
            gin = 183000;
        });

        ktor1 = findViewById(R.id.ktor_1);
        ktor1.setOnClickListener(view -> {
            ktor1.animate().rotationYBy(360);
            gin = 180000;
        });

        ktor2 = findViewById(R.id.ktor_2);
        ktor2.setOnClickListener(view -> {
            ktor2.animate().rotationYBy(360);
            gin = 180000;
        });

        ktor3 = findViewById(R.id.ktor_3);
        ktor3.setOnClickListener(view -> {
            ktor3.animate().rotationYBy(360);
            gin = 180000;
        });
        ktor4 = findViewById(R.id.ktor_4);
        ktor4.setOnClickListener(view -> {
            ktor4.animate().rotationYBy(360);
            gin = 180000;
        });
        ktor5 = findViewById(R.id.ktor_5);
        ktor5.setOnClickListener(view -> {
            ktor5.animate().rotationYBy(360);
            gin = 183000;
        });
        ktor6 = findViewById(R.id.ktor_6);
        ktor6.setOnClickListener(view -> {
            ktor6.animate().rotationYBy(360);
            gin = 183000;
        });

        ktor7 = findViewById(R.id.ktor_7);
        ktor7.setOnClickListener(view -> {
            ktor7.animate().rotationYBy(360);
            gin = 188000;
        });
        ktor8 = findViewById(R.id.ktor_8);
        ktor8.setOnClickListener(view -> {
            ktor8.animate().rotationYBy(360);
            gin = 188000;
        });
        ktor9 = findViewById(R.id.ktor_9);
        ktor9.setOnClickListener(view -> {
            ktor9.animate().rotationYBy(360);
            gin = 188000;
        });
        ktor10 = findViewById(R.id.ktor_10);
        ktor10.setOnClickListener(view -> {
            ktor10.animate().rotationYBy(360);
            gin = 188000;
        });
        ktor11 = findViewById(R.id.ktor_11);
        ktor11.setOnClickListener(view -> {
            ktor11.animate().rotationYBy(360);
            gin = 188000;
        });
        loading(true);
        final Button button1 = (Button) findViewById(R.id.divanboy1);
        final Button button2 = (Button) findViewById(R.id.divanboy2);
        final Button button3 = (Button) findViewById(R.id.divanboy3);
        button1.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (gin == 180000 || gin == 1830000 || gin == 188000){
                    gin -= 5000;
                }

                if(event.getAction() == MotionEvent.ACTION_UP) {
                    button1.setBackgroundColor(Color.RED);
                    button2.setBackgroundColor(Color.GRAY);
                    button3.setBackgroundColor(Color.GRAY);
                }
                return false;
            }

        });

        button2.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent event) {

                if(event.getAction() == MotionEvent.ACTION_UP) {
                    button2.setBackgroundColor(Color.RED);
                    button3.setBackgroundColor(Color.GRAY);
                    button1.setBackgroundColor(Color.GRAY);
                }
                return false;
            }

        });

        button3.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent event) {

                if (gin == 180000 || gin == 1830000 || gin == 188000){
                    gin += 5000;
                }

                if(event.getAction() == MotionEvent.ACTION_UP) {
                    button3.setBackgroundColor(Color.RED);
                    button2.setBackgroundColor(Color.GRAY);
                    button1.setBackgroundColor(Color.GRAY);
                }
                return false;
            }

        });

    }
    private void getProducts(String categoryId, String productId) {
        DocumentReference productRef = FirebaseFirestore.getInstance().collection("categories").document(categoryId).collection("products").document(productId);
        productRef.get()
                .addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                    @Override
                    public void onSuccess(DocumentSnapshot documentSnapshot) {
                        if (documentSnapshot.exists()) {
                            description.setText(documentSnapshot.getString("Description"));
                            name.setText(documentSnapshot.getString("name"));
                            koj.setText(documentSnapshot.getString("Koj"));
                            ktor.setText(documentSnapshot.getString("Ktor"));
                            erkchap.setText(documentSnapshot.getString("Erkchap"));
                            garantia.setText(documentSnapshot.getString("Garantya"));
                            desc3d.setText(documentSnapshot.getString("3ddesc"));
                            binding.loading. setVisibility(View.GONE);
                        }
                    }
                });
    }
    private void loading(boolean isLoading) {
        if (isLoading) {
            binding.loading.setVisibility(View.VISIBLE);
        } if(isLoading == false) {
            binding.loading.setVisibility(View.GONE);
        }
    }
}*/