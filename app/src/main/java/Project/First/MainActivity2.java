package Project.First;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.codebyashish.autoimageslider.AutoImageSlider;
import com.codebyashish.autoimageslider.Enums.ImageAnimationTypes;
import com.codebyashish.autoimageslider.Enums.ImageScaleType;
import com.codebyashish.autoimageslider.ExceptionsClass;
import com.codebyashish.autoimageslider.Models.ImageSlidesModel;
import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    TextView textViewonUgalok;

    TextView textViewonZalUgalok;
    TextView textViewonKaravat;

    TextView textViewonKaravat2;
    ImageView ugol1;
    ImageView ugol4;
    ImageView ugol3;
    ImageView divanugol1;
    ImageView divanugol2;
    ImageView divanugol4;
    ImageView karavat5;
    ImageView karavat4;
    ImageView karavat8;
    ImageView karavat21;
    ImageView karavat27;
    ImageView karavat23;
    ImageView divan1;
    ImageView divan4;
    ImageView divan3;
    //TextView addToCart;
    TextView zaltextview;
    EditText search;
    ImageView cart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.popular);
        }
        else{
            setContentView(R.layout.layout_land);
        }
        String user = FirebaseAuth.getInstance().getCurrentUser().getEmail();
        textViewonZalUgalok = findViewById(R.id.zalugalokner);
        zaltextview = findViewById(R.id.zaltextView);
        if(user.equals("aram.g.79@mail.ru")) {
            textViewonZalUgalok.setText("Put new items");
            textViewonZalUgalok.setOnClickListener((v)-> startActivity(new Intent(MainActivity2.this, AddProductActivity.class)));
            zaltextview.setText("Create new category");
            zaltextview.setOnClickListener((v)-> startActivity(new Intent(MainActivity2.this, AddProductCategory.class)));
        }else {
            textViewonZalUgalok = findViewById(R.id.zalugalokner);
            textViewonZalUgalok.setOnClickListener(view -> {
                onPopular();
            });
        }
       /* search.findViewById(R.id.editTextsearch);
        search.clearFocus();
        search.setOnEditorActionListener((v, actionId, event) -> {
            if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                String searchData = search.getText().toString();
                // Perform your search logic here (e.g., filter data)
                // You can call a method to handle the search results
                handleSearchResults(searchData);
                return true; // Indicates that the action was handled
            }
            return false; // Action not handled
        });*/
        textViewonUgalok = findViewById(R.id.ugalokner);
        textViewonUgalok.setOnClickListener(view -> {
            onUglaok();
        });
        textViewonUgalok = findViewById(R.id.ugalokner);
        textViewonUgalok.setOnClickListener(view -> {
            onUglaok();
        });
        textViewonKaravat2 = findViewById(R.id.karavatt2);
        textViewonKaravat2.setOnClickListener(view -> {
            onKaravat();
        });
        textViewonKaravat = findViewById(R.id.karavat);
        textViewonKaravat.setOnClickListener(view -> {
            onKaravat();
        });

        ugol1 = findViewById(R.id.imageView);
        ugol1.setOnClickListener(view ->{
            onUgol1();
        });
        ugol4 = findViewById(R.id.imageView11);
        ugol4.setOnClickListener(view ->{
            onUgol1();
        });
        ugol3 = findViewById(R.id.imageView22);
        ugol3.setOnClickListener(view ->{
            onUgol1();
        });
        divanugol1 = findViewById(R.id.zalimageView);
        divanugol1.setOnClickListener(view ->{
            onDivan1();
        });
        divanugol2 = findViewById(R.id.zalimageView11);
        divanugol2.setOnClickListener(view ->{
            onDivan2();
        });
        divanugol4 = findViewById(R.id.zalimageView22);
        divanugol4.setOnClickListener(view ->{
            onDivan4();
        });
        karavat4 = findViewById(R.id.karavatimageView);
        karavat4.setOnClickListener(view ->{
            onKaravat4();
        });

        karavat5 = findViewById(R.id.karavatimageView11);
        karavat5.setOnClickListener(view ->{
            onKaravat5();
        });
        karavat8 = findViewById(R.id.karavatimageView22);
        karavat8.setOnClickListener(view ->{
            onKaravat8();
        });
        karavat21 = findViewById(R.id.karavat2imageView);
        karavat21.setOnClickListener(view ->{
            onKaravat21();
        });
        karavat23 = findViewById(R.id.karavat2imageView11);
        karavat23.setOnClickListener(view ->{
            onKaravat23();
        });
        karavat27 = findViewById(R.id.karavat2imageView22);
        karavat27.setOnClickListener(view ->{
            onKaravat27();
        });
        divan3 = findViewById(R.id.divanimageView);
        divan3.setOnClickListener(view ->{

        });
       /* divan4 = findViewById(R.id.divanimageView11);
        divan4.setOnClickListener(view ->{
            onDivan3();
        });*/
        divan1 = findViewById(R.id.divanimageView22);
        divan1.setOnClickListener(view ->{

        });
        AutoImageSlider autoImageSlider = findViewById(R.id.autoImageSliderpop);
        ArrayList<ImageSlidesModel> autoImageList = new ArrayList<>();
        try {
            autoImageList.add(new ImageSlidesModel(R.drawable.homeejpg, ImageScaleType.CENTER_CROP));
        } catch (ExceptionsClass e) {
            throw new RuntimeException(e);
        }
        try {
            autoImageList.add(new ImageSlidesModel(R.drawable.divanugol, ImageScaleType.FIT));
        } catch (ExceptionsClass e) {
            throw new RuntimeException(e);
        }
        autoImageSlider.setSlideAnimation(ImageAnimationTypes.DEPTH_SLIDE);
        autoImageSlider.setImageList(autoImageList);

        //ImageAdapterForPopular adapterpop = new ImageAdapterForPopular(this);
        //viewPager.setAdapter(adapterpop);
        /*Button button = (Button) findViewById(R.id.zalmebel);
        Button button1 = (Button) findViewById(R.id.kuxnimebel);
        Button button2 = (Button) findViewById(R.id.karavat);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onKaravat();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onUglaok();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onPopular();
            }
        });*/
        //cart.findViewById(R.id.addToCart1);
        /*cart.setOnClickListener(view ->{
            Intent intent = new Intent(this, MainActivity3.class);
            startActivity(intent);
  +      });*/

    }

    public void onPopular(){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    public void onUglaok(){
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
    public void onKaravat(){
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }
    public void onUgol1(){
        Intent intent = new Intent(this, Ugalok_1.class);
        startActivity(intent);
    }
    public void onUgol4(){
        Intent intent = new Intent(this, Ugalok_4.class);
        startActivity(intent);
    }
    public void onUgol3(){
        Intent intent = new Intent(this, Ugalok_3.class);
        startActivity(intent);
    }
    public void onKaravat5(){
        Intent intent = new Intent(this, Karavat_5.class);
        startActivity(intent);
    }
    public void onKaravat8(){
        Intent intent = new Intent(this, Karavat_7.class);
        startActivity(intent);
    }
    public void onKaravat4(){
        Intent intent = new Intent(this, Karavat_4.class);
        startActivity(intent);
    }
    public void onKaravat23(){
        Intent intent = new Intent(this, Karavat_2.class);
        startActivity(intent);
    }
    public void onKaravat27(){
        Intent intent = new Intent(this, Karavat_6.class);
        startActivity(intent);
    }
    public void onKaravat21(){
        Intent intent = new Intent(this, Karavat_1.class);
        startActivity(intent);
    }
    public void onDivanUgol1(){
        Intent intent = new Intent(this, Ugalok_1.class);
        startActivity(intent);
    }
    /*public void onDivanUgol2(){
        Intent intent = new Intent(this, Divan_2.class);
        startActivity(intent);
    }*/
    public void onDivanUgol4(){
        Intent intent = new Intent(this, Divan_4.class);
        startActivity(intent);
    }
    public void onDivan1(){
        Intent intent = new Intent(this,Divan_1.class);
        intent.putExtra("categoryId", "YCgYT6dREsVY7Hub8SLj");
        intent.putExtra("productId", "OFipHVkV65Vaw46OWuzr");
        startActivity(intent);
    }
    public void onDivan5(){
        Intent intent = new Intent(this,Divan_5.class);
        startActivity(intent);
    }
    public void onDivan3(){

    }
    public void onDivan2(){
        /*Intent intent = new Intent(this,Divan_2.class);
        intent.putExtra("categoryId", "YCgYT6dREsVY7Hub8SLj");
        intent.putExtra("productId", "a0oitHyqy6aESjdJFLDQ");
        startActivity(intent);*/
    }
    public void onDivan4(){
        Intent intent = new Intent(this,Divan_4.class);
        intent.putExtra("categoryId", "YCgYT6dREsVY7Hub8SLj");
        intent.putExtra("productId", "a0oitHyqy6aESjdJFLDQ");
        startActivity(intent);
    }
    /*public void onCart(){
        Intent intent = new Intent(this,AddToCart.class);
        startActivity(intent);
    }*/
  /* private void searchList(String text) {
        List<Product> dataSearchList = new ArrayList<>();
        for (Product productData : ) {
            if (productData.name.toLowerCase().contains(text.toLowerCase())) {
            dataSearchList.add(productData);
            }
        }
        if (!dataSearchList.isEmpty()) {
            ProductAdapter.setSearchList(dataSearchList);    } else {
            Toast.makeText(this, "Not Found", Toast.LENGTH_SHORT).show();    }
    }*/
    /*private void handleSearchResults(String query) {
        // Implement your search logic here
        // For example, filter data based on the query
        // Update your UI or perform other actions
        List<Item> filteredList = new ArrayList();
        for ()
    }*/
}