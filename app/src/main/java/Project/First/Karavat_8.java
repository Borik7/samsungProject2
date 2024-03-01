package Project.First;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Karavat_8 extends AppCompatActivity {
    ImageView tevktor1;
    ImageView tevktor2;
    ImageView tevktor3;
    ImageView tevktor4;
    ImageView tevktor5;

    ImageView tevkoj1;
    ImageView tevkoj2;
    ImageView tevkoj3;
    ImageView tevkoj4;
    ImageView tevkoj5;
    ImageView tevktor6;
    ImageView tevktor7;
    ImageView tevktor8;
    ImageView tevktor9;
    ImageView tevktor10;
    ImageView tevktor11;
    private int gin = 180000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karavat1);
        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapterKaravat1 adapterkaravat1 = new ImageAdapterKaravat1(this);
        viewPager.setAdapter(adapterkaravat1);
        tevktor1 = findViewById(R.id.tevktor_1);
        tevktor1.setOnClickListener(view -> {
            tevktor1.animate().rotationYBy(360);
            gin = 90000;
        });

        tevktor2 = findViewById(R.id.tevktor_2);
        tevktor2.setOnClickListener(view -> {
            tevktor2.animate().rotationYBy(360);
            gin = 90000;
        });

        tevktor3 = findViewById(R.id.tevktor_3);
        tevktor3.setOnClickListener(view -> {
            tevktor3.animate().rotationYBy(360);
            gin = 90000;
        });
        tevktor4 = findViewById(R.id.tevktor_4);
        tevktor4.setOnClickListener(view -> {
            tevktor4.animate().rotationYBy(360);
            gin = 90000;
        });
        tevktor5 = findViewById(R.id.tevktor_5);
        tevktor5.setOnClickListener(view -> {
            tevktor5.animate().rotationYBy(360);
            gin = 93000;
        });

        tevktor6 = findViewById(R.id.tevktor_6);
        tevktor6.setOnClickListener(view -> {
            tevktor6.animate().rotationYBy(360);
            gin = 93000;
        });

        tevktor7 = findViewById(R.id.tevktor_7);
        tevktor7.setOnClickListener(view -> {
            tevktor7.animate().rotationYBy(360);
            gin = 97000;
        });
        tevktor8 = findViewById(R.id.tevktor_8);
        tevktor8.setOnClickListener(view -> {
            tevktor8.animate().rotationYBy(360);
            gin = 97000;
        });
        tevktor9 = findViewById(R.id.tevktor_9);
        tevktor9.setOnClickListener(view -> {
            tevktor9.animate().rotationYBy(360);
            gin = 97000;
        });
        tevktor10 = findViewById(R.id.tevktor_10);
        tevktor10.setOnClickListener(view -> {
            tevktor10.animate().rotationYBy(360);
            gin = 97000;
        });
        tevktor11 = findViewById(R.id.tevktor_11);
        tevktor11.setOnClickListener(view -> {
            tevktor11.animate().rotationYBy(360);
            gin = 97000;
        });
        tevkoj1 = findViewById(R.id.tevkoj_1);
        tevkoj1.setOnClickListener(view -> {
            tevkoj1.animate().rotationYBy(360);
            gin = 90000;
        });

        tevkoj2 = findViewById(R.id.tevkoj_2);
        tevkoj2.setOnClickListener(view -> {
            tevkoj2.animate().rotationYBy(360);
            gin = 90000;
        });

        tevkoj3 = findViewById(R.id.tevkoj_3);
        tevkoj3.setOnClickListener(view -> {
            tevkoj3.animate().rotationYBy(360);
            gin = 93000;
        });
        tevkoj4 = findViewById(R.id.tevkoj_4);
        tevkoj4.setOnClickListener(view -> {
            tevkoj4.animate().rotationYBy(360);
            gin = 97000;
        });
        tevkoj5 = findViewById(R.id.tevkoj_5);
        tevkoj5.setOnClickListener(view -> {
            tevkoj5.animate().rotationYBy(360);
            gin = 97000;
        });

        final Button buttonkaravat1 = (Button) findViewById(R.id.divanboy1);
        final Button buttonkaravat2 = (Button) findViewById(R.id.divanboy2);
        final Button buttonkaravat3 = (Button) findViewById(R.id.divanboy3);
        buttonkaravat1.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent event) {

                if(event.getAction() == MotionEvent.ACTION_UP) {
                    buttonkaravat1.setBackgroundColor(Color.RED);
                    buttonkaravat2.setBackgroundColor(Color.GRAY);
                    buttonkaravat3.setBackgroundColor(Color.GRAY);
                }
                return false;
            }

        });

        buttonkaravat2.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent event) {

                if(event.getAction() == MotionEvent.ACTION_UP) {
                    buttonkaravat2.setBackgroundColor(Color.RED);
                    buttonkaravat3.setBackgroundColor(Color.GRAY);
                    buttonkaravat1.setBackgroundColor(Color.GRAY);
                }
                return false;
            }

        });

        buttonkaravat3.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent event) {

                if(event.getAction() == MotionEvent.ACTION_UP) {
                    buttonkaravat3.setBackgroundColor(Color.RED);
                    buttonkaravat2.setBackgroundColor(Color.GRAY);
                    buttonkaravat1.setBackgroundColor(Color.GRAY);
                }
                return false;
            }

        });

    }
}