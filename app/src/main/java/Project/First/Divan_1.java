package Project.First;

import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Project.First.databinding.ActivityDivan1Binding;

public class Divan_1 extends AppCompatActivity {
    RecyclerView recyclerView;
    private List<Product> productList;
    private ProductAdapter productAdapter;

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
    String cartId;
    private int gin = 180000;
    /*private String android_id = Settings.Secure.getString(getApplicationContext().getContentResolver(),
            Settings.Secure.ANDROID_ID);*/
    private String android_id;
    ActivityDivan1Binding binding;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDivan1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //android_id = getIMEI(getApplicationContext());
        if(ActivityCompat.checkSelfPermission(this.getApplicationContext(), "android.permission.READ_PRIVILEGED_PHONE_STATE") != PackageManager.PERMISSION_GRANTED)        {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.READ_PRIVILEGED_PHONE_STATE"},123);

        }

        //android_id = telephonyManager.getImei();

        ViewPager viewPager = findViewById(R.id.viewPager);
        getProducts(getIntent().getStringExtra("categoryId"), getIntent().getStringExtra("productId"));
        binding.addToCart.setOnClickListener(view ->{
            addToCart(getIntent().getStringExtra("productId"));
        });
        tevkoj = findViewById(R.id.tevguyn);
        description = findViewById(R.id.divanbacatrutyun);
        name = findViewById(R.id.name);
        garantia = findViewById(R.id.divangarantya);
        erkchap = findViewById(R.id.divanchap);
        ktor = findViewById(R.id.guyn);
        koj = findViewById(R.id.divankoj);
        desc3d = findViewById(R.id.desc3d);
        ImageAdapter adapter = new ImageAdapter(this);
        viewPager.setAdapter(adapter);

        koj1 = findViewById(R.id.koj_1);
        koj1.setOnClickListener(view -> {
            koj1.animate().scaleXBy(5);
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

        tevktor1 = findViewById(R.id.tevktor_1);
        tevktor1.setOnClickListener(view -> {
            tevktor1.animate().rotationYBy(360);
            gin = 180000;
        });

        tevktor2 = findViewById(R.id.tevktor_2);
        tevktor2.setOnClickListener(view -> {
            tevktor2.animate().rotationYBy(360);
            gin = 180000;
        });

        tevktor3 = findViewById(R.id.tevktor_3);
        tevktor3.setOnClickListener(view -> {
            tevktor3.animate().rotationYBy(360);
            gin = 180000;
        });
        tevktor4 = findViewById(R.id.tevktor_4);
        tevktor4.setOnClickListener(view -> {
            tevktor4.animate().rotationYBy(360);
            gin = 180000;
        });
        tevktor5 = findViewById(R.id.tevktor_5);
        tevktor5.setOnClickListener(view -> {
            tevktor5.animate().rotationYBy(360);
            gin = 183000;
        });

        tevktor6 = findViewById(R.id.tevktor_6);
        tevktor6.setOnClickListener(view -> {
            tevktor6.animate().rotationYBy(360);
            gin = 183000;
        });

        tevktor7 = findViewById(R.id.tevktor_7);
        tevktor7.setOnClickListener(view -> {
            tevktor7.animate().rotationYBy(360);
            gin = 188000;
        });
        tevktor8 = findViewById(R.id.tevktor_8);
        tevktor8.setOnClickListener(view -> {
            tevktor8.animate().rotationYBy(360);
            gin = 188000;
        });
        tevktor9 = findViewById(R.id.tevktor_9);
        tevktor9.setOnClickListener(view -> {
            tevktor9.animate().rotationYBy(360);
            gin = 188000;
        });
        tevktor10 = findViewById(R.id.tevktor_10);
        tevktor10.setOnClickListener(view -> {
            tevktor10.animate().rotationYBy(360);
            gin = 188000;
        });
        tevktor11 = findViewById(R.id.tevktor_11);
        tevktor11.setOnClickListener(view -> {
            tevktor11.animate().rotationYBy(360);
            gin = 188000;
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

        tevkoj1 = findViewById(R.id.tevkoj_1);
        tevkoj1.setOnClickListener(view -> {
            tevkoj1.animate().rotationYBy(360);
            gin = 180000;
        });

        tevkoj2 = findViewById(R.id.tevkoj_2);
        tevkoj2.setOnClickListener(view -> {
            tevkoj2.animate().rotationYBy(360);
            gin = 180000;
        });

        tevkoj3 = findViewById(R.id.tevkoj_3);
        tevkoj3.setOnClickListener(view -> {
            tevkoj3.animate().rotationYBy(360);
            gin = 180000;
        });
        tevkoj4 = findViewById(R.id.tevkoj_4);
        tevkoj4.setOnClickListener(view -> {
            tevkoj4.animate().rotationYBy(360);
            gin = 180000;
        });
        tevkoj5 = findViewById(R.id.tevkoj_5);
        tevkoj5.setOnClickListener(view -> {
            tevkoj5.animate().rotationYBy(360);
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
                if (gin == 180000 || gin == 1830000 || gin == 188000) {
                    gin -= 5000;
                }

                if (event.getAction() == MotionEvent.ACTION_UP) {
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

                if (event.getAction() == MotionEvent.ACTION_UP) {
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

                if (gin == 180000 || gin == 1830000 || gin == 188000) {
                    gin += 5000;
                }


                if (event.getAction() == MotionEvent.ACTION_UP) {
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
                            tevkoj.setText(documentSnapshot.getString("Tevkoj"));
                            binding.loading.setVisibility(View.GONE);
                        }
                    }
                });
        loading(false);
    }

    private void addToCart(String productId) {
        HashMap<String, Object> cart = new HashMap<>();
        HashMap<String, Object> cartItem = new HashMap<>();
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            //cartId = FirebaseFirestore.getInstance().collection("carts").whereEqualTo("deviceId", user.getUid()).toString();
            FirebaseFirestore.getInstance().collection("carts").whereEqualTo("deviceId", user.getUid())
                    .get()
                    .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<QuerySnapshot> task) {
                            if (task.isSuccessful()){
                                if(!task.getResult().isEmpty()){
                                    for (QueryDocumentSnapshot document : task.getResult()) {
                                        DocumentReference docRef = document.getReference().collection("cartItems").document();
                                        Map<String, Object> newData = new HashMap<>();
                                        newData.put("itemCount", 5);
                                        newData.put("itemId", productId);
                                        docRef.set(newData);
                                        Toast.makeText(Divan_1.this,"Added Second",Toast.LENGTH_SHORT).show();
                                    }
                                   /* if (user.getUid().equals(cartId)) {
                                        HashMap<String, Object> newcart = new HashMap<>();
                                        FirebaseFirestore.getInstance().collection("cartItems").
                                    }*/
                                }else {
                                    cart.put("deviceId", user.getUid());
                                    cartItem.put("itemCount", 5);
                                    cartItem.put("itemId", productId);
                                    cart.put("cartItems", cartItem);

                                    FirebaseFirestore.getInstance().collection("carts")
                                            .add(cart)
                                            .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                                                @Override
                                                public void onSuccess(DocumentReference documentReference) {
                                                    Toast.makeText(Divan_1.this,"Added",Toast.LENGTH_SHORT).show();
                                                }
                                            });
                                }
                            }

                        }
                    });
        } else {
            Toast.makeText(Divan_1.this,"User is not logged in",Toast.LENGTH_SHORT).show();
        }
    }

    private void loading(boolean isLoading) {
        if (isLoading) {
            binding.loading.setVisibility(View.VISIBLE);
        }
        if (isLoading == false) {
            binding.loading.setVisibility(View.GONE);
        }
    }
    /*public static String getIMEI(Context context) {

        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        if (telephonyManager != null) {
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                String androidId = telephonyManager.getImei();
                return telephonyManager.getImei();
            } else {
                // For older devices (pre-Oreo), use getDeviceId()
                return telephonyManager.getDeviceId();
            }
        }
        return null; // Handle null case appropriately in your code
    }*/
}