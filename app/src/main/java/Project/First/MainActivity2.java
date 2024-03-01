package Project.First;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.codebyashish.autoimageslider.AutoImageSlider;
import com.codebyashish.autoimageslider.Enums.ImageScaleType;
import com.codebyashish.autoimageslider.ExceptionsClass;
import com.codebyashish.autoimageslider.Models.ImageSlidesModel;

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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.popular);
        }
        else{
            setContentView(R.layout.layout_land);
        }

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
        textViewonZalUgalok = findViewById(R.id.zalugalokner);
        textViewonZalUgalok.setOnClickListener(view -> {
            onPopular();
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
            onUgol1();
        });
        divanugol2 = findViewById(R.id.zalimageView11);
        divanugol2.setOnClickListener(view ->{
            onDivanUgol2();
        });
        divanugol4 = findViewById(R.id.zalimageView22);
        divanugol4.setOnClickListener(view ->{
            onDivanUgol4();
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
        divan4 = findViewById(R.id.divanimageView11);
        divan4.setOnClickListener(view ->{

        });
        divan1 = findViewById(R.id.divanimageView22);
        divan1.setOnClickListener(view ->{

        });
        AutoImageSlider autoImageSlider = findViewById(R.id.autoImageSliderpop);
        ArrayList<ImageSlidesModel> autoImageList = new ArrayList<>();
        try {
            autoImageList.add(new ImageSlidesModel(R.drawable.dian, ImageScaleType.CENTER_CROP));
        } catch (ExceptionsClass e) {
            throw new RuntimeException(e);
        }
        try {
            autoImageList.add(new ImageSlidesModel(R.drawable.dian, ImageScaleType.CENTER_CROP));
        } catch (ExceptionsClass e) {
            throw new RuntimeException(e);
        }
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
    public void onDivanUgol2(){
        Intent intent = new Intent(this, Divan_2.class);
        startActivity(intent);
    }
    public void onDivanUgol4(){
        Intent intent = new Intent(this, Divan_4.class);
        startActivity(intent);
    }
    public void onDivan1(){
        Intent intent = new Intent(this,Divan_1.class);
        startActivity(intent);
    }
    public void onDivan5(){
        Intent intent = new Intent(this,Divan_5.class);
        startActivity(intent);
    }
    public void onDivan3(){
        Intent intent = new Intent(this,Divan_3.class);
        startActivity(intent);
    }
}