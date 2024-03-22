/*package Project.First;

import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.codebyashish.autoimageslider.AutoImageSlider;
import com.codebyashish.autoimageslider.Enums.ImageAnimationTypes;
import com.codebyashish.autoimageslider.Enums.ImageScaleType;
import com.codebyashish.autoimageslider.ExceptionsClass;
import com.codebyashish.autoimageslider.Models.ImageSlidesModel;
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

import java.util.ArrayList;
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
    Button erkchap1;
    Button erkchap2;
    Button erkchap3;
    TextView ktor;
    TextView koj;
    TextView tevkoj;
    TextView desc3d;
    String cartId;
    int counter;
    String image;


    private int gin = 180000;
    /*private String android_id = Settings.Secure.getString(getApplicationContext().getContentResolver(),
            Settings.Secure.ANDROID_ID);
    private String android_id;
    ConstraintLayout ktorlayout;
    ScrollView scrollView;
    ConstraintLayout buttonLaoyut;
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
            addToCart(getIntent().getStringExtra("productId"),getIntent().getStringExtra("categoryId"));
        });
        tevkoj = findViewById(R.id.tevguyn);
        description = findViewById(R.id.divanbacatrutyun);
        name = findViewById(R.id.name);
        garantia = findViewById(R.id.divangarantya);
        erkchap = findViewById(R.id.divanchap);
        erkchap1 = findViewById(R.id.divanboy1);
        erkchap2 = findViewById(R.id.divanboy2);
        erkchap3 = findViewById(R.id.divanboy3);
        ktor = findViewById(R.id.guyn);
        koj = findViewById(R.id.divankoj);
        desc3d = findViewById(R.id.desc3d);
        /*ImageAdapter adapter = new ImageAdapter(this);
        viewPager.setAdapter(adapter);

        koj1 = findViewById(R.id.koj_1);
        koj1.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            koj1.animate().scaleXBy(5);
            gin = 180000;
        });
        int blue = getResources().getColor(R.color.blue);
        int gray = getResources().getColor(R.color.gray);
        koj2 = findViewById(R.id.koj_2);
        koj2.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            koj2.animate().rotationYBy(360);
            gin = 180000;
        });

        koj3 = findViewById(R.id.koj_3);
        koj3.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            koj3.animate().rotationYBy(360);
            gin = 180000;
        });
        koj4 = findViewById(R.id.koj_4);
        koj4.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            koj4.animate().rotationYBy(360);
            gin = 180000;
        });
        koj5 = findViewById(R.id.koj_5);
        koj5.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            koj5.animate().rotationYBy(360);
            gin = 183000;
        });

        tevktor1 = findViewById(R.id.tevktor_1);
        tevktor1.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevktor1.animate().scaleXBy(5);
            gin = 180000;
        });

        tevktor2 = findViewById(R.id.tevktor_2);
        tevktor2.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevktor2.animate().rotationYBy(360);
            gin = 180000;
        });

        tevktor3 = findViewById(R.id.tevktor_3);
        tevktor3.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevktor3.animate().rotationYBy(360);
            gin = 180000;
        });
        tevktor4 = findViewById(R.id.tevktor_4);
        tevktor4.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevktor4.animate().rotationYBy(360);
            gin = 180000;
        });
        tevktor5 = findViewById(R.id.tevktor_5);
        tevktor5.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevktor5.animate().rotationYBy(360);
            gin = 183000;
        });

        tevktor6 = findViewById(R.id.tevktor_6);
        tevktor6.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevktor6.animate().rotationYBy(360);
            gin = 183000;
        });

        tevktor7 = findViewById(R.id.tevktor_7);
        tevktor7.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevktor7.animate().rotationYBy(360);
            gin = 188000;
        });
        tevktor8 = findViewById(R.id.tevktor_8);
        tevktor8.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevktor8.animate().rotationYBy(360);
            gin = 188000;
        });
        tevktor9 = findViewById(R.id.tevktor_9);
        tevktor9.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevktor9.animate().rotationYBy(360);
            gin = 188000;
        });
        tevktor10 = findViewById(R.id.tevktor_10);
        tevktor10.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevktor10.animate().rotationYBy(360);
            gin = 188000;
        });
        tevktor11 = findViewById(R.id.tevktor_11);
        tevktor11.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevktor11.animate().rotationYBy(360);
            gin = 188000;
        });

        ktor1 = findViewById(R.id.ktor_1);
        ktor1.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            ktor1.getLayoutParams().width = 150;
            ktor1.getLayoutParams().height = 150;
            gin = 180000;
        });

        ktor2 = findViewById(R.id.ktor_2);
        ktor2.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            ktor2.animate().rotationYBy(360);
            gin = 180000;
        });

        ktor3 = findViewById(R.id.ktor_3);
        ktor3.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            ktor3.animate().rotationYBy(360);
            gin = 180000;
        });
        ktor4 = findViewById(R.id.ktor_4);
        ktor4.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            ktor4.animate().rotationYBy(360);
            gin = 180000;
        });
        ktor5 = findViewById(R.id.ktor_5);
        ktor5.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            ktor5.animate().rotationYBy(360);
            gin = 183000;
        });

        tevkoj1 = findViewById(R.id.tevkoj_1);
        tevkoj1.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevkoj1.animate().rotationYBy(360);
            gin = 180000;
        });

        tevkoj2 = findViewById(R.id.tevkoj_2);
        tevkoj2.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevkoj2.animate().rotationYBy(360);
            gin = 180000;
        });

        tevkoj3 = findViewById(R.id.tevkoj_3);
        tevkoj3.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevkoj3.animate().rotationYBy(360);
            gin = 180000;
        });
        tevkoj4 = findViewById(R.id.tevkoj_4);
        tevkoj4.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevkoj4.animate().rotationYBy(360);
            gin = 180000;
        });
        tevkoj5 = findViewById(R.id.tevkoj_5);
        tevkoj5.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevkoj5.animate().rotationYBy(360);
            gin = 183000;
        });

        ktor6 = findViewById(R.id.ktor_6);
        ktor6.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            ktor6.animate().rotationYBy(360);
            gin = 183000;
        });

        ktor7 = findViewById(R.id.ktor_7);
        ktor7.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            ktor7.animate().rotationYBy(360);
            gin = 188000;
        });
        ktor8 = findViewById(R.id.ktor_8);
        ktor8.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            ktor8.animate().rotationYBy(360);
            gin = 188000;
        });
        ktor9 = findViewById(R.id.ktor_9);
        ktor9.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            ktor9.animate().rotationYBy(360);
            gin = 188000;
        });
        ktor10 = findViewById(R.id.ktor_10);
        ktor10.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            ktor10.animate().rotationYBy(360);
            gin = 188000;
        });
        ktor11 = findViewById(R.id.ktor_11);
        ktor11.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            ktor11.animate().rotationYBy(360);
            gin = 188000;
        });
        ktorlayout = findViewById(R.id.ktorlayout);
        scrollView = findViewById(R.id.scrollView);
        /*ktorlayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // Respond to touch events
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // User touched the screen
                        // Scroll the layout down by a fixed amount (e.g., 100 pixels)
                        scrollView.smoothScrollBy(0, 1000);
                        break;
                    // Handle other touch events if needed
                }
                return true; // Consume the touch event
            }
        });
        buttonLaoyut = findViewById(R.id.buttonlayout);
        /*buttonLaoyut.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // Respond to touch events
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // User touched the screen
                        // Scroll the layout down by a fixed amount (e.g., 100 pixels)
                        scrollView.smoothScrollBy(0, 1500);
                        break;
                    // Handle other touch events if needed
                }
                return true; // Consume the touch event
            }
        });
        //loading(true);
        final Button button1 = (Button) findViewById(R.id.divanboy1);
        final Button button2 = (Button) findViewById(R.id.divanboy2);
        final Button button3 = (Button) findViewById(R.id.divanboy3);
        //button1.setText(FirebaseFirestore.getInstance().collection("Divan").document("Erkchap1"));
        button1.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (counter == 0) {
                    scrollView.smoothScrollBy(0, 1500);
                    counter = 1;
                }
                if (gin == 180000 || gin == 1830000 || gin == 188000) {
                    gin -= 5000;
                }

                if (event.getAction() == MotionEvent.ACTION_UP) {
                    button1.setBackgroundColor(blue);
                    button2.setBackgroundColor(gray);
                    button3.setBackgroundColor(gray);
                    button1.setTextColor(gray);
                    button2.setTextColor(blue);
                    button3.setTextColor(blue);
                }
                return false;
            }

        });

        button2.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (counter == 0) {
                    scrollView.smoothScrollBy(0, 1500);
                    counter = 1;
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    button2.setBackgroundColor(blue);
                    button3.setBackgroundColor(gray);
                    button1.setBackgroundColor(gray);
                    button2.setTextColor(gray);
                    button3.setTextColor(blue);
                    button1.setTextColor(blue);
                }
                return false;
            }

        });

        button3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (counter == 0) {
                    scrollView.smoothScrollBy(0, 1500);
                    counter = 1;
                }
                if (gin == 180000 || gin == 1830000 || gin == 188000) {
                    gin += 5000;
                }


                if (event.getAction() == MotionEvent.ACTION_UP) {
                    button3.setBackgroundColor(blue);
                    button2.setBackgroundColor(gray);
                    button1.setBackgroundColor(gray);
                    button3.setTextColor(gray);
                    button2.setTextColor(blue);
                    button1.setTextColor(blue);
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
                            erkchap1.setText(documentSnapshot.getString("Erkchap1"));
                            erkchap2.setText(documentSnapshot.getString("Erkchap2"));
                            erkchap3.setText(documentSnapshot.getString("Erkchap3"));
                            AutoImageSlider autoImageSlider = findViewById(R.id.autoImageSliderDivan);
                            ArrayList<ImageSlidesModel> autoImageList = new ArrayList<>();
                            try {
                                autoImageList.add(new ImageSlidesModel(documentSnapshot.getString("imageUrl"), ImageScaleType.CENTER_CROP));
                            } catch (ExceptionsClass e) {
                                throw new RuntimeException(e);
                            }
                            try {
                                autoImageList.add(new ImageSlidesModel(documentSnapshot.getString("imageUrl"), ImageScaleType.FIT));
                            } catch (ExceptionsClass e) {
                                throw new RuntimeException(e);
                            }
                            autoImageSlider.setSlideAnimation(ImageAnimationTypes.DEPTH_SLIDE);
                            autoImageSlider.setImageList(autoImageList);
                            //binding.loading.setVisibility(View.GONE);
                            //loading(false);
                        }
                    }
                });
       // loading(false);
    }

    private void addToCart(String productId, String categoryId) {
        HashMap<String, Object> cart = new HashMap<>();
        HashMap<String, Object> cartItem = new HashMap<>();
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            //cartId = FirebaseFirestore.getInstance().collection("carts").whereEqualTo("deviceId", user.getUid()).toString();
            FirebaseFirestore.getInstance().collection("carts").whereEqualTo("itemId", productId)
                    .get()
                    .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {

                        @Override
                        public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                            if (queryDocumentSnapshots.isEmpty()) {
                                /*FirebaseFirestore.getInstance().collection("carts").whereEqualTo("itemId", productId);
                                Toast.makeText(Divan_1.this, "Can't add", Toast.LENGTH_SHORT).show();

                                    FirebaseFirestore.getInstance().collection("carts").whereEqualTo("deviceId", user.getUid())
                                            .get()
                                            .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                                                @Override
                                                public void onComplete(@NonNull Task<QuerySnapshot> task) {
                                                    if (task.isSuccessful()) {
                                                        if (!task.getResult().isEmpty()) {

                                                            for (QueryDocumentSnapshot document : task.getResult()) {
                                                                DocumentReference docRef = document.getReference().collection("cartItems").document();
                                                                Map<String, Object> newData = new HashMap<>();
                                                                newData.put("itemCount", 5);
                                                                newData.put("price", gin);
                                                                newData.put("itemId", productId);
                                                                newData.put("categoryId", categoryId);
                                                                docRef.set(newData);
                                                                Toast.makeText(Divan_1.this, "Added Second", Toast.LENGTH_SHORT).show();
                                                            }
                                   /* if (user.getUid().equals(cartId)) {
                                        HashMap<String, Object> newcart = new HashMap<>();
                                        FirebaseFirestore.getInstance().collection("cartItems").
                                    }
                                                        } else {
                                                            cart.put("deviceId", user.getUid());
                                                            cartItem.put("itemCount", 5);
                                                            cartItem.put("name", name);
                                                            cartItem.put("itemId", productId);
                                                            cartItem.put("price", gin);
                                                            cartItem.put("categoryId", categoryId);

                                                            FirebaseFirestore.getInstance().collection("carts")
                                                                    .add(cart)
                                                                    .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                                                                        @Override
                                                                        public void onSuccess(DocumentReference documentReference) {
                                                                            String cartId = documentReference.getId();
                                                                            FirebaseFirestore.getInstance().collection("carts").document(cartId).collection("cartItems").add(cartItem);
                                                                            Toast.makeText(Divan_1.this, "Added", Toast.LENGTH_SHORT).show();
                                                                        }
                                                                    });
                                                        }
                                                    }
                                                }

                                            });
                                }

                             else {
                                FirebaseFirestore.getInstance().collection("carts").whereEqualTo("deviceId", user.getUid())
                                        .get()
                                        .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                                            @Override
                                            public void onComplete(@NonNull Task<QuerySnapshot> task) {
                                                if (task.isSuccessful()) {
                                                    if (!task.getResult().isEmpty()) {

                                                        for (QueryDocumentSnapshot document : task.getResult()) {
                                                            DocumentReference docRef = document.getReference().collection("cartItems").document();
                                                            Map<String, Object> newData = new HashMap<>();
                                                            newData.put("itemCount", 5);
                                                            newData.put("price", gin);
                                                            newData.put("itemId", productId);
                                                            newData.put("categoryId", categoryId);
                                                            docRef.set(newData);
                                                            Toast.makeText(Divan_1.this, "Added Second", Toast.LENGTH_SHORT).show();
                                                        }
                                   /* if (user.getUid().equals(cartId)) {
                                        HashMap<String, Object> newcart = new HashMap<>();
                                        FirebaseFirestore.getInstance().collection("cartItems").
                                    }
                                                    } else {
                                                        cart.put("deviceId", user.getUid());
                                                        cartItem.put("itemCount", 5);
                                                        cartItem.put("name", name);
                                                        cartItem.put("itemId", productId);
                                                        cartItem.put("price", gin);
                                                        cartItem.put("categoryId", categoryId);

                                                        FirebaseFirestore.getInstance().collection("carts")
                                                                .add(cart)
                                                                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                                                                    @Override
                                                                    public void onSuccess(DocumentReference documentReference) {
                                                                        String cartId = documentReference.getId();
                                                                        FirebaseFirestore.getInstance().collection("carts").document(cartId).collection("cartItems").add(cartItem);
                                                                        Toast.makeText(Divan_1.this, "Added", Toast.LENGTH_SHORT).show();
                                                                    }
                                                                });
                                                    }
                                                }
                                            }

                                        });
                            }
                        }

                        ;
                    });
        }

        /* else {
            Toast.makeText(Divan_1.this,"User is not logged in",Toast.LENGTH_SHORT).show();
        }


 /*   private void loading(boolean isLoading) {
        if (isLoading) {
            binding.loading.setVisibility(View.VISIBLE);
            binding.scrollView.setVisibility(View.GONE);
        }
        if(!isLoading) {
            binding.loading.setVisibility(View.GONE);
            binding.scrollView.setVisibility(View.VISIBLE);
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
    }
    }}
        package Project.First;

        import android.annotation.SuppressLint;
        import android.content.pm.PackageManager;
        import android.os.Bundle;
        import android.view.MotionEvent;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageView;
        import android.widget.ScrollView;
        import android.widget.TextView;
        import android.widget.Toast;

        import androidx.annotation.NonNull;
        import androidx.appcompat.app.AppCompatActivity;
        import androidx.constraintlayout.widget.ConstraintLayout;
        import androidx.core.app.ActivityCompat;
        import androidx.recyclerview.widget.RecyclerView;
        import androidx.viewpager.widget.ViewPager;

        import com.codebyashish.autoimageslider.AutoImageSlider;
        import com.codebyashish.autoimageslider.Enums.ImageAnimationTypes;
        import com.codebyashish.autoimageslider.Enums.ImageScaleType;
        import com.codebyashish.autoimageslider.ExceptionsClass;
        import com.codebyashish.autoimageslider.Models.ImageSlidesModel;
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

        import java.util.ArrayList;
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
    Button erkchap1;
    Button erkchap2;
    Button erkchap3;
    TextView ktor;
    TextView koj;
    TextView tevkoj;
    TextView desc3d;
    String cartId;
    int counter;
    String image;


    private int gin = 180000;
    /*private String android_id = Settings.Secure.getString(getApplicationContext().getContentResolver(),
            Settings.Secure.ANDROID_ID);
    private String android_id;
    ConstraintLayout ktorlayout;
    ScrollView scrollView;
    ConstraintLayout buttonLaoyut;
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
            addToCart(getIntent().getStringExtra("productId"),getIntent().getStringExtra("categoryId"));
        });
        tevkoj = findViewById(R.id.tevguyn);
        description = findViewById(R.id.divanbacatrutyun);
        name = findViewById(R.id.name);
        garantia = findViewById(R.id.divangarantya);
        erkchap = findViewById(R.id.divanchap);
        erkchap1 = findViewById(R.id.divanboy1);
        erkchap2 = findViewById(R.id.divanboy2);
        erkchap3 = findViewById(R.id.divanboy3);
        ktor = findViewById(R.id.guyn);
        koj = findViewById(R.id.divankoj);
        desc3d = findViewById(R.id.desc3d);
        /*ImageAdapter adapter = new ImageAdapter(this);
        viewPager.setAdapter(adapter);

        koj1 = findViewById(R.id.koj_1);
        koj1.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            koj1.animate().scaleXBy(5);
            gin = 180000;
        });
        int blue = getResources().getColor(R.color.blue);
        int gray = getResources().getColor(R.color.gray);
        koj2 = findViewById(R.id.koj_2);
        koj2.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            koj2.animate().rotationYBy(360);
            gin = 180000;
        });

        koj3 = findViewById(R.id.koj_3);
        koj3.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            koj3.animate().rotationYBy(360);
            gin = 180000;
        });
        koj4 = findViewById(R.id.koj_4);
        koj4.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            koj4.animate().rotationYBy(360);
            gin = 180000;
        });
        koj5 = findViewById(R.id.koj_5);
        koj5.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            koj5.animate().rotationYBy(360);
            gin = 183000;
        });

        tevktor1 = findViewById(R.id.tevktor_1);
        tevktor1.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevktor1.animate().scaleXBy(5);
            gin = 180000;
        });

        tevktor2 = findViewById(R.id.tevktor_2);
        tevktor2.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevktor2.animate().rotationYBy(360);
            gin = 180000;
        });

        tevktor3 = findViewById(R.id.tevktor_3);
        tevktor3.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevktor3.animate().rotationYBy(360);
            gin = 180000;
        });
        tevktor4 = findViewById(R.id.tevktor_4);
        tevktor4.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevktor4.animate().rotationYBy(360);
            gin = 180000;
        });
        tevktor5 = findViewById(R.id.tevktor_5);
        tevktor5.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevktor5.animate().rotationYBy(360);
            gin = 183000;
        });

        tevktor6 = findViewById(R.id.tevktor_6);
        tevktor6.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevktor6.animate().rotationYBy(360);
            gin = 183000;
        });

        tevktor7 = findViewById(R.id.tevktor_7);
        tevktor7.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevktor7.animate().rotationYBy(360);
            gin = 188000;
        });
        tevktor8 = findViewById(R.id.tevktor_8);
        tevktor8.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevktor8.animate().rotationYBy(360);
            gin = 188000;
        });
        tevktor9 = findViewById(R.id.tevktor_9);
        tevktor9.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevktor9.animate().rotationYBy(360);
            gin = 188000;
        });
        tevktor10 = findViewById(R.id.tevktor_10);
        tevktor10.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevktor10.animate().rotationYBy(360);
            gin = 188000;
        });
        tevktor11 = findViewById(R.id.tevktor_11);
        tevktor11.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevktor11.animate().rotationYBy(360);
            gin = 188000;
        });

        ktor1 = findViewById(R.id.ktor_1);
        ktor1.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            ktor1.setImageResource(R.drawable.aaa);
            gin = 180000;
        });

        ktor2 = findViewById(R.id.ktor_2);
        ktor2.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            ktor2.animate().rotationYBy(360);
            gin = 180000;
        });

        ktor3 = findViewById(R.id.ktor_3);
        ktor3.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            ktor3.animate().rotationYBy(360);
            gin = 180000;
        });
        ktor4 = findViewById(R.id.ktor_4);
        ktor4.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            ktor4.animate().rotationYBy(360);
            gin = 180000;
        });
        ktor5 = findViewById(R.id.ktor_5);
        ktor5.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            ktor5.animate().rotationYBy(360);
            gin = 183000;
        });

        tevkoj1 = findViewById(R.id.tevkoj_1);
        tevkoj1.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevkoj1.animate().rotationYBy(360);
            gin = 180000;
        });

        tevkoj2 = findViewById(R.id.tevkoj_2);
        tevkoj2.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevkoj2.animate().rotationYBy(360);
            gin = 180000;
        });

        tevkoj3 = findViewById(R.id.tevkoj_3);
        tevkoj3.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevkoj3.animate().rotationYBy(360);
            gin = 180000;
        });
        tevkoj4 = findViewById(R.id.tevkoj_4);
        tevkoj4.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevkoj4.animate().rotationYBy(360);
            gin = 180000;
        });
        tevkoj5 = findViewById(R.id.tevkoj_5);
        tevkoj5.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevkoj5.animate().rotationYBy(360);
            gin = 183000;
        });

        ktor6 = findViewById(R.id.ktor_6);
        ktor6.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            ktor6.animate().rotationYBy(360);
            gin = 183000;
        });

        ktor7 = findViewById(R.id.ktor_7);
        ktor7.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            ktor7.animate().rotationYBy(360);
            gin = 188000;
        });
        ktor8 = findViewById(R.id.ktor_8);
        ktor8.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            ktor8.animate().rotationYBy(360);
            gin = 188000;
        });
        ktor9 = findViewById(R.id.ktor_9);
        ktor9.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            ktor9.animate().rotationYBy(360);
            gin = 188000;
        });
        ktor10 = findViewById(R.id.ktor_10);
        ktor10.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            ktor10.animate().rotationYBy(360);
            gin = 188000;
        });
        ktor11 = findViewById(R.id.ktor_11);
        ktor11.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            ktor11.animate().rotationYBy(360);
            gin = 188000;
        });
        ktorlayout = findViewById(R.id.ktorlayout);
        scrollView = findViewById(R.id.scrollView);
        /*ktorlayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // Respond to touch events
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // User touched the screen
                        // Scroll the layout down by a fixed amount (e.g., 100 pixels)
                        scrollView.smoothScrollBy(0, 1000);
                        break;
                    // Handle other touch events if needed
                }
                return true; // Consume the touch event
            }
        });
        buttonLaoyut = findViewById(R.id.buttonlayout);
        /*buttonLaoyut.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // Respond to touch events
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // User touched the screen
                        // Scroll the layout down by a fixed amount (e.g., 100 pixels)
                        scrollView.smoothScrollBy(0, 1500);
                        break;
                    // Handle other touch events if needed
                }
                return true; // Consume the touch event
            }
        });
        loading(true);
        final Button button1 = (Button) findViewById(R.id.divanboy1);
        final Button button2 = (Button) findViewById(R.id.divanboy2);
        final Button button3 = (Button) findViewById(R.id.divanboy3);
        //button1.setText(FirebaseFirestore.getInstance().collection("Divan").document("Erkchap1"));
        button1.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (counter == 0) {
                    scrollView.smoothScrollBy(0, 1500);
                    counter = 1;
                }
                if (gin == 180000 || gin == 1830000 || gin == 188000) {
                    gin -= 5000;
                }

                if (event.getAction() == MotionEvent.ACTION_UP) {
                    button1.setBackgroundColor(blue);
                    button2.setBackgroundColor(gray);
                    button3.setBackgroundColor(gray);
                    button1.setTextColor(gray);
                    button2.setTextColor(blue);
                    button3.setTextColor(blue);
                }
                return false;
            }

        });

        button2.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (counter == 0) {
                    scrollView.smoothScrollBy(0, 1500);
                    counter = 1;
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    button2.setBackgroundColor(blue);
                    button3.setBackgroundColor(gray);
                    button1.setBackgroundColor(gray);
                    button2.setTextColor(gray);
                    button3.setTextColor(blue);
                    button1.setTextColor(blue);
                }
                return false;
            }

        });

        button3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (counter == 0) {
                    scrollView.smoothScrollBy(0, 1500);
                    counter = 1;
                }
                if (gin == 180000 || gin == 1830000 || gin == 188000) {
                    gin += 5000;
                }


                if (event.getAction() == MotionEvent.ACTION_UP) {
                    button3.setBackgroundColor(blue);
                    button2.setBackgroundColor(gray);
                    button1.setBackgroundColor(gray);
                    button3.setTextColor(gray);
                    button2.setTextColor(blue);
                    button1.setTextColor(blue);
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
                            erkchap1.setText(documentSnapshot.getString("Erkchap1"));
                            erkchap2.setText(documentSnapshot.getString("Erkchap2"));
                            erkchap3.setText(documentSnapshot.getString("Erkchap3"));
                            AutoImageSlider autoImageSlider = findViewById(R.id.autoImageSliderDivan);
                            ArrayList<ImageSlidesModel> autoImageList = new ArrayList<>();
                            try {
                                autoImageList.add(new ImageSlidesModel(documentSnapshot.getString("imageUrl"), ImageScaleType.CENTER_CROP));
                            } catch (ExceptionsClass e) {
                                throw new RuntimeException(e);
                            }
                            try {
                                autoImageList.add(new ImageSlidesModel(documentSnapshot.getString("imageUrl"), ImageScaleType.FIT));
                            } catch (ExceptionsClass e) {
                                throw new RuntimeException(e);
                            }
                            autoImageSlider.setSlideAnimation(ImageAnimationTypes.DEPTH_SLIDE);
                            autoImageSlider.setImageList(autoImageList);
                            //binding.loading.setVisibility(View.GONE);
                            loading(false);
                        }
                    }
                });
        loading(false);
    }

    private void addToCart(String productId, String categoryId) {
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
                                        newData.put("price", 50000);
                                        newData.put("itemId", productId);
                                        newData.put("categoryId", categoryId);
                                        docRef.set(newData);
                                        Toast.makeText(Divan_1.this,"Added Second",Toast.LENGTH_SHORT).show();
                                    }
                                   /* if (user.getUid().equals(cartId)) {
                                        HashMap<String, Object> newcart = new HashMap<>();
                                        FirebaseFirestore.getInstance().collection("cartItems").
                                    }
                                }else {
                                    cart.put("deviceId", user.getUid());
                                    cartItem.put("itemCount", 5);
                                    cartItem.put("itemId", productId);
                                    cartItem.put("categoryId", categoryId);
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
            binding.scrollView.setVisibility(View.GONE);
        }
        if(!isLoading) {
            binding.loading.setVisibility(View.GONE);
            binding.scrollView.setVisibility(View.VISIBLE);
        }
    }
    public static String getIMEI(Context context) {

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
    }
}
}*/
package Project.First;

import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.codebyashish.autoimageslider.AutoImageSlider;
import com.codebyashish.autoimageslider.Enums.ImageAnimationTypes;
import com.codebyashish.autoimageslider.Enums.ImageScaleType;
import com.codebyashish.autoimageslider.ExceptionsClass;
import com.codebyashish.autoimageslider.Models.ImageSlidesModel;
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

import java.util.ArrayList;
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
    Button erkchap1;
    Button erkchap2;
    Button erkchap3;
    TextView ktor;
    TextView koj;
    TextView tevkoj;
    TextView desc3d;
    String cartId;
    int counter;
    String image;


    private int gin = 180000;
    /*private String android_id = Settings.Secure.getString(getApplicationContext().getContentResolver(),
            Settings.Secure.ANDROID_ID);*/
    private String android_id;
    ConstraintLayout ktorlayout;
    ScrollView scrollView;
    ConstraintLayout buttonLaoyut;
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
            addToCart(getIntent().getStringExtra("productId"),getIntent().getStringExtra("categoryId"));
        });
        tevkoj = findViewById(R.id.tevguyn);
        description = findViewById(R.id.divanbacatrutyun);
        name = findViewById(R.id.name);
        garantia = findViewById(R.id.divangarantya);
        erkchap = findViewById(R.id.divanchap);
        erkchap1 = findViewById(R.id.divanboy1);
        erkchap2 = findViewById(R.id.divanboy2);
        erkchap3 = findViewById(R.id.divanboy3);
        ktor = findViewById(R.id.guyn);
        koj = findViewById(R.id.divankoj);
        desc3d = findViewById(R.id.desc3d);
        /*ImageAdapter adapter = new ImageAdapter(this);
        viewPager.setAdapter(adapter);*/

        koj1 = findViewById(R.id.koj_1);
        koj1.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            koj1.animate().scaleXBy(5);
            gin = 180000;
        });
        int blue = getResources().getColor(R.color.blue);
        int gray = getResources().getColor(R.color.gray);
        koj2 = findViewById(R.id.koj_2);
        koj2.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            koj2.animate().rotationYBy(360);
            gin = 180000;
        });

        koj3 = findViewById(R.id.koj_3);
        koj3.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            koj3.animate().rotationYBy(360);
            gin = 180000;
        });
        koj4 = findViewById(R.id.koj_4);
        koj4.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            koj4.animate().rotationYBy(360);
            gin = 180000;
        });
        koj5 = findViewById(R.id.koj_5);
        koj5.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            koj5.animate().rotationYBy(360);
            gin = 183000;
        });

        tevktor1 = findViewById(R.id.tevktor_1);
        tevktor1.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevktor1.animate().scaleXBy(5);
            gin = 180000;
        });

        tevktor2 = findViewById(R.id.tevktor_2);
        tevktor2.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevktor2.animate().rotationYBy(360);
            gin = 180000;
        });

        tevktor3 = findViewById(R.id.tevktor_3);
        tevktor3.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevktor3.animate().rotationYBy(360);
            gin = 180000;
        });
        tevktor4 = findViewById(R.id.tevktor_4);
        tevktor4.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevktor4.animate().rotationYBy(360);
            gin = 180000;
        });
        tevktor5 = findViewById(R.id.tevktor_5);
        tevktor5.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevktor5.animate().rotationYBy(360);
            gin = 183000;
        });

        tevktor6 = findViewById(R.id.tevktor_6);
        tevktor6.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevktor6.animate().rotationYBy(360);
            gin = 183000;
        });

        tevktor7 = findViewById(R.id.tevktor_7);
        tevktor7.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevktor7.animate().rotationYBy(360);
            gin = 188000;
        });
        tevktor8 = findViewById(R.id.tevktor_8);
        tevktor8.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevktor8.animate().rotationYBy(360);
            gin = 188000;
        });
        tevktor9 = findViewById(R.id.tevktor_9);
        tevktor9.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevktor9.animate().rotationYBy(360);
            gin = 188000;
        });
        tevktor10 = findViewById(R.id.tevktor_10);
        tevktor10.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevktor10.animate().rotationYBy(360);
            gin = 188000;
        });
        tevktor11 = findViewById(R.id.tevktor_11);
        tevktor11.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevktor11.animate().rotationYBy(360);
            gin = 188000;
        });

        ktor1 = findViewById(R.id.ktor_1);
        ktor1.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            ktor1.setImageResource(R.drawable.aaa);
            gin = 180000;
        });

        ktor2 = findViewById(R.id.ktor_2);
        ktor2.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            ktor2.animate().rotationYBy(360);
            gin = 180000;
        });

        ktor3 = findViewById(R.id.ktor_3);
        ktor3.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            ktor3.animate().rotationYBy(360);
            gin = 180000;
        });
        ktor4 = findViewById(R.id.ktor_4);
        ktor4.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            ktor4.animate().rotationYBy(360);
            gin = 180000;
        });
        ktor5 = findViewById(R.id.ktor_5);
        ktor5.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            ktor5.animate().rotationYBy(360);
            gin = 183000;
        });

        tevkoj1 = findViewById(R.id.tevkoj_1);
        tevkoj1.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevkoj1.animate().rotationYBy(360);
            gin = 180000;
        });

        tevkoj2 = findViewById(R.id.tevkoj_2);
        tevkoj2.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevkoj2.animate().rotationYBy(360);
            gin = 180000;
        });

        tevkoj3 = findViewById(R.id.tevkoj_3);
        tevkoj3.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevkoj3.animate().rotationYBy(360);
            gin = 180000;
        });
        tevkoj4 = findViewById(R.id.tevkoj_4);
        tevkoj4.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevkoj4.animate().rotationYBy(360);
            gin = 180000;
        });
        tevkoj5 = findViewById(R.id.tevkoj_5);
        tevkoj5.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            tevkoj5.animate().rotationYBy(360);
            gin = 183000;
        });

        ktor6 = findViewById(R.id.ktor_6);
        ktor6.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            ktor6.animate().rotationYBy(360);
            gin = 183000;
        });

        ktor7 = findViewById(R.id.ktor_7);
        ktor7.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            ktor7.animate().rotationYBy(360);
            gin = 188000;
        });
        ktor8 = findViewById(R.id.ktor_8);
        ktor8.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            ktor8.animate().rotationYBy(360);
            gin = 188000;
        });
        ktor9 = findViewById(R.id.ktor_9);
        ktor9.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            ktor9.animate().rotationYBy(360);
            gin = 188000;
        });
        ktor10 = findViewById(R.id.ktor_10);
        ktor10.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            ktor10.animate().rotationYBy(360);
            gin = 188000;
        });
        ktor11 = findViewById(R.id.ktor_11);
        ktor11.setOnClickListener(view -> {
            if (counter == 0) {
                scrollView.smoothScrollBy(0, 1000);
                counter = 1;
            }
            ktor11.animate().rotationYBy(360);
            gin = 188000;
        });
        ktorlayout = findViewById(R.id.ktorlayout);
        scrollView = findViewById(R.id.scrollView);
        /*ktorlayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // Respond to touch events
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // User touched the screen
                        // Scroll the layout down by a fixed amount (e.g., 100 pixels)
                        scrollView.smoothScrollBy(0, 1000);
                        break;
                    // Handle other touch events if needed
                }
                return true; // Consume the touch event
            }
        });*/
        buttonLaoyut = findViewById(R.id.buttonlayout);
        /*buttonLaoyut.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // Respond to touch events
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // User touched the screen
                        // Scroll the layout down by a fixed amount (e.g., 100 pixels)
                        scrollView.smoothScrollBy(0, 1500);
                        break;
                    // Handle other touch events if needed
                }
                return true; // Consume the touch event
            }
        });*/
        loading(true);
        final Button button1 = (Button) findViewById(R.id.divanboy1);
        final Button button2 = (Button) findViewById(R.id.divanboy2);
        final Button button3 = (Button) findViewById(R.id.divanboy3);
        //button1.setText(FirebaseFirestore.getInstance().collection("Divan").document("Erkchap1"));
        button1.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (counter == 0) {
                    scrollView.smoothScrollBy(0, 1500);
                    counter = 1;
                }
                if (gin == 180000 || gin == 1830000 || gin == 188000) {
                    gin -= 5000;
                }

                if (event.getAction() == MotionEvent.ACTION_UP) {
                    button1.setBackgroundColor(blue);
                    button2.setBackgroundColor(gray);
                    button3.setBackgroundColor(gray);
                    button1.setTextColor(gray);
                    button2.setTextColor(blue);
                    button3.setTextColor(blue);
                }
                return false;
            }

        });

        button2.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (counter == 0) {
                    scrollView.smoothScrollBy(0, 1500);
                    counter = 1;
                }
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    button2.setBackgroundColor(blue);
                    button3.setBackgroundColor(gray);
                    button1.setBackgroundColor(gray);
                    button2.setTextColor(gray);
                    button3.setTextColor(blue);
                    button1.setTextColor(blue);
                }
                return false;
            }

        });

        button3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (counter == 0) {
                    scrollView.smoothScrollBy(0, 1500);
                    counter = 1;
                }
                if (gin == 180000 || gin == 1830000 || gin == 188000) {
                    gin += 5000;
                }


                if (event.getAction() == MotionEvent.ACTION_UP) {
                    button3.setBackgroundColor(blue);
                    button2.setBackgroundColor(gray);
                    button1.setBackgroundColor(gray);
                    button3.setTextColor(gray);
                    button2.setTextColor(blue);
                    button1.setTextColor(blue);
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
                            erkchap1.setText(documentSnapshot.getString("Erkchap1"));
                            erkchap2.setText(documentSnapshot.getString("Erkchap2"));
                            erkchap3.setText(documentSnapshot.getString("Erkchap3"));
                            AutoImageSlider autoImageSlider = findViewById(R.id.autoImageSliderDivan);
                            ArrayList<ImageSlidesModel> autoImageList = new ArrayList<>();
                            try {
                                autoImageList.add(new ImageSlidesModel(documentSnapshot.getString("imageUrl"), ImageScaleType.CENTER_CROP));
                            } catch (ExceptionsClass e) {
                                throw new RuntimeException(e);
                            }
                            try {
                                autoImageList.add(new ImageSlidesModel(documentSnapshot.getString("imageUrl"), ImageScaleType.FIT));
                            } catch (ExceptionsClass e) {
                                throw new RuntimeException(e);
                            }
                            autoImageSlider.setSlideAnimation(ImageAnimationTypes.DEPTH_SLIDE);
                            autoImageSlider.setImageList(autoImageList);
                            //binding.loading.setVisibility(View.GONE);
                            loading(false);
                        }
                    }
                });
        loading(false);
    }

    /*private void addToCart(String productId, String categoryId) {
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
                                        newData.put("itemCount", 1);
                                        newData.put("price", gin);
                                        newData.put("itemId", productId);
                                        newData.put("categoryId", categoryId);
                                        docRef.set(newData);
                                        Toast.makeText(Divan_1.this,"Added Second",Toast.LENGTH_SHORT).show();
                                    }
                                   /* if (user.getUid().equals(cartId)) {
                                        HashMap<String, Object> newcart = new HashMap<>();
                                        FirebaseFirestore.getInstance().collection("cartItems").
                                    }
                                }else {
                                    cart.put("deviceId", user.getUid());
                                    cartItem.put("itemCount", 5);
                                    cartItem.put("itemId", productId);
                                    cartItem.put("categoryId", categoryId);
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
        }*/
        private void addToCart(String productId, String categoryId) {
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
                                            newData.put("itemCount", 1);
                                            newData.put("price", gin);
                                            newData.put("itemId", productId);
                                            newData.put("categoryId", categoryId);
                                            docRef.set(newData);
                                            Toast.makeText(Divan_1.this,"Added Second",Toast.LENGTH_SHORT).show();
                                        }
                                   /* if (user.getUid().equals(cartId)) {
                                        HashMap<String, Object> newcart = new HashMap<>();
                                        FirebaseFirestore.getInstance().collection("cartItems").
                                    }*/
                                }else {
                                    cart.put("deviceId", user.getUid());
                                    cartItem.put("itemCount", 1);
                                    cartItem.put("price", gin);
                                    cartItem.put("itemId", productId);
                                    cartItem.put("categoryId", categoryId);

                                    FirebaseFirestore.getInstance().collection("carts")
                                            .add(cart)
                                            .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                                                @Override
                                                public void onSuccess(DocumentReference documentReference) {
                                                    documentReference.collection("cartItems").add(cartItem).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                                                        @Override
                                                        public void onSuccess(DocumentReference documentReference) {
                                                            Toast.makeText(Divan_1.this,"Added",Toast.LENGTH_SHORT).show();
                                                        }
                                                    });
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
            binding.scrollView.setVisibility(View.GONE);
        }
        if(!isLoading) {
            binding.loading.setVisibility(View.GONE);
            binding.scrollView.setVisibility(View.VISIBLE);
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