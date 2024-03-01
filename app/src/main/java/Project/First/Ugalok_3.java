package Project.First;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Ugalok_3 extends AppCompatActivity {
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

    private int gin = 180000;

    private int gin1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ugalok3);
        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapterUgalok3 adapterugol3 = new ImageAdapterUgalok3(this);
        viewPager.setAdapter(adapterugol3);
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

        final Button button1 = (Button) findViewById(R.id.divanboy1);
        final Button button2 = (Button) findViewById(R.id.divanboy2);
        final Button button3 = (Button) findViewById(R.id.divanboy3);
        button1.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent event) {
                if (gin1 == 2) {
                    gin -= 5000;
                    gin1 = 1;
                }else {
                    gin -= 5000;
                    gin1 = 1;
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
                if (gin1 == 1){
                    gin += 10000;
                    gin1 = 2;
                }else {
                    gin += 5000;
                    gin1 = 2;
                }
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
                if (gin1 == 1){
                    gin += 15000;
                    gin1 = 3;
                }else if (gin1 == 2) {
                    gin += 5000;
                    gin1 = 3;
                }else {
                    gin += 10000;
                    gin1 = 3;
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

}