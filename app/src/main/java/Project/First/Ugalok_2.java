package Project.First;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Ugalok_2 extends AppCompatActivity {
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

    private int gin = 90000;
    private int gin1 = 0;
    private int gin2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ugalok2);
        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapterUgalok2 adapterugol2 = new ImageAdapterUgalok2(this);
        viewPager.setAdapter(adapterugol2);

        tevktor1 = findViewById(R.id.tevktor_1);
        tevktor1.setOnClickListener(view -> {
            tevktor1.animate().rotationYBy(360);
            if (gin2 == 0){
                gin2 = 1;
                gin += 0;
            }
        });

        tevktor2 = findViewById(R.id.tevktor_2);
        tevktor2.setOnClickListener(view -> {
            tevktor2.animate().rotationYBy(360);
            if (gin2 == 0){
                gin += 0;
                gin2 = 1;
            }else {
                gin = 90000;
                gin2 = 1;
            }
        });

        tevktor3 = findViewById(R.id.tevktor_3);
        tevktor3.setOnClickListener(view -> {
            tevktor3.animate().rotationYBy(360);
            if (gin2 == 0){
                gin += 0;
                gin2 = 1;
            }else {
                gin = 90000;
                gin2 = 1;
            }
        });
        tevktor4 = findViewById(R.id.tevktor_4);
        tevktor4.setOnClickListener(view -> {
            tevktor4.animate().rotationYBy(360);
            if (gin2 == 0){
                gin += 0;
                gin2 = 1;
            }else {
                gin = 90000;
                gin2 = 1;
            }
        });
        tevktor5 = findViewById(R.id.tevktor_5);
        tevktor5.setOnClickListener(view -> {
            tevktor5.animate().rotationYBy(360);
            if (gin2 == 0){
                gin += 3000;
                gin2 = 2;
            }else {
                gin = 93000;
                gin2 = 2;
            }
        });

        tevktor6 = findViewById(R.id.tevktor_6);
        tevktor6.setOnClickListener(view -> {
            tevktor6.animate().rotationYBy(360);
            if (gin2 == 0){
                gin += 7000;
                gin2 = 3;
            }else {
                gin = 97000;
                gin2 = 3;
            }
        });

        tevktor7 = findViewById(R.id.tevktor_7);
        tevktor7.setOnClickListener(view -> {
            tevktor7.animate().rotationYBy(360);
            if (gin2 == 0){
                gin += 7000;
                gin2 = 3;
            }else {
                gin = 97000;
                gin2 = 3;
            }
        });
        tevktor8 = findViewById(R.id.tevktor_8);
        tevktor8.setOnClickListener(view -> {
            tevktor8.animate().rotationYBy(360);
            if (gin2 == 0){
                gin += 7000;
                gin2 = 3;
            }else {
                gin = 97000;
                gin2 = 3;
            }
        });
        tevktor9 = findViewById(R.id.tevktor_9);
        tevktor9.setOnClickListener(view -> {
            tevktor9.animate().rotationYBy(360);
            if (gin2 == 0){
                gin += 7000;
                gin2 = 3;
            }else {
                gin = 97000;
                gin2 = 3;
            }
        });
        tevktor10 = findViewById(R.id.tevktor_10);
        tevktor10.setOnClickListener(view -> {
            tevktor10.animate().rotationYBy(360);
            if (gin2 == 0){
                gin += 7000;
                gin2 = 3;
            }else {
                gin = 97000;
                gin2 = 3;
            }
        });
        tevktor11 = findViewById(R.id.tevktor_11);
        tevktor11.setOnClickListener(view -> {
            tevktor11.animate().rotationYBy(360);
            if (gin2 == 0){
                gin += 7000;
                gin2 = 3;
            }else {
                gin = 97000;
                gin2 = 3;
            }
        });
        tevkoj1 = findViewById(R.id.tevkoj_1);
        tevkoj1.setOnClickListener(view -> {
            tevkoj1.animate().rotationYBy(360);
            if (gin2 == 0){
                gin += 0;
                gin2 = 1;
            }else {
                gin = 90000;
                gin2 = 1;
            }
        });

        tevkoj2 = findViewById(R.id.tevkoj_2);
        tevkoj2.setOnClickListener(view -> {
            tevkoj2.animate().rotationYBy(360);
            if (gin2 == 0){
                gin += 0;
                gin2 = 1;
            }else {
                gin = 90000;
                gin2 = 1;
            }
        });

        tevkoj3 = findViewById(R.id.tevkoj_3);
        tevkoj3.setOnClickListener(view -> {
            tevkoj3.animate().rotationYBy(360);
            if (gin2 == 0){
                gin += 0;
                gin2 = 1;
            }else {
                gin = 90000;
                gin2 = 1;
            }
        });
        tevkoj4 = findViewById(R.id.tevkoj_4);
        tevkoj4.setOnClickListener(view -> {
            tevkoj4.animate().rotationYBy(360);
            if (gin2 == 0){
                gin += 0;
                gin2 = 1;
            }else {
                gin = 90000;
                gin2 = 1;
            }
        });
        tevkoj5 = findViewById(R.id.tevkoj_5);
        tevkoj5.setOnClickListener(view -> {
            tevkoj5.animate().rotationYBy(360);
            if (gin2 == 0){
                gin += 0;
                gin2 = 1;
            }else {
                gin = 90000;
                gin2 = 1;
            }
        });
        koj1 = findViewById(R.id.koj_1);
        koj1.setOnClickListener(view -> {
            koj1.animate().rotationYBy(360);
            if (gin2 == 0){
                gin += 0;
                gin2 = 1;
            }else {
                gin = 90000;
                gin2 = 1;
            }
        });

        koj2 = findViewById(R.id.koj_2);
        koj2.setOnClickListener(view -> {
            koj2.animate().rotationYBy(360);
            if (gin2 == 0){
                gin += 0;
                gin2 = 1;
            }else {
                gin = 90000;
                gin2 = 1;
            }
        });

        koj3 = findViewById(R.id.koj_3);
        koj3.setOnClickListener(view -> {
            koj3.animate().rotationYBy(360);
            if (gin2 == 0){
                gin += 0;
                gin2 = 1;
            }else {
                gin = 90000;
                gin2 = 1;
            }
        });
        koj4 = findViewById(R.id.koj_4);
        koj4.setOnClickListener(view -> {
            koj4.animate().rotationYBy(360);
            if (gin2 == 0){
                gin += 0;
                gin2 = 1;
            }else {
                gin = 90000;
                gin2 = 1;
            }
        });
        koj5 = findViewById(R.id.koj_5);
        koj5.setOnClickListener(view -> {
            koj5.animate().rotationYBy(360);
            if (gin2 == 0){
                gin += 0;
                gin2 = 1;
            }else {
                gin = 90000;
                gin2 = 1;
            }
        });

        ktor1 = findViewById(R.id.ktor_1);
        ktor1.setOnClickListener(view -> {
            ktor1.animate().rotationYBy(360);
            if (gin2 == 0){
                gin += 0;
                gin2 = 1;
            }else {
                gin = 90000;
                gin2 = 1;
            }
        });

        ktor2 = findViewById(R.id.ktor_2);
        ktor2.setOnClickListener(view -> {
            ktor2.animate().rotationYBy(360);
            if (gin2 == 0){
                gin += 0;
                gin2 = 1;
            }else {
                gin = 90000;
                gin2 = 1;
            }
        });

        ktor3 = findViewById(R.id.ktor_3);
        ktor3.setOnClickListener(view -> {
            ktor3.animate().rotationYBy(360);
            if (gin2 == 0){
                gin += 0;
                gin2 = 1;
            }else {
                gin = 90000;
                gin2 = 1;
            }
        });
        ktor4 = findViewById(R.id.ktor_4);
        ktor4.setOnClickListener(view -> {
            ktor4.animate().rotationYBy(360);
            if (gin2 == 0){
                gin += 0;
                gin2 = 1;
            }else {
                gin = 90000;
                gin2 = 1;
            }
        });
        ktor5 = findViewById(R.id.ktor_5);
        ktor5.setOnClickListener(view -> {
            ktor5.animate().rotationYBy(360);
            if (gin2 == 0){
                gin += 0;
                gin2 = 1;
            }else {
                gin = 90000;
                gin2 = 1;
            }
        });
        ktor6 = findViewById(R.id.ktor_6);
        ktor6.setOnClickListener(view -> {
            ktor6.animate().rotationYBy(360);
            if (gin2 == 0){
                gin += 7000;
                gin2 = 3;
            }else {
                gin = 97000;
                gin2 = 3;
            }
        });

        ktor7 = findViewById(R.id.ktor_7);
        ktor7.setOnClickListener(view -> {
            ktor7.animate().rotationYBy(360);
            if (gin2 == 0){
                gin += 7000;
                gin2 = 3;
            }else {
                gin = 97000;
                gin2 = 3;
            }
        });
        ktor8 = findViewById(R.id.ktor_8);
        ktor8.setOnClickListener(view -> {
            ktor8.animate().rotationYBy(360);
            if (gin2 == 0){
                gin += 7000;
                gin2 = 3;
            }else {
                gin = 97000;
                gin2 = 3;
            }
        });
        ktor9 = findViewById(R.id.ktor_9);
        ktor9.setOnClickListener(view -> {
            ktor9.animate().rotationYBy(360);
            if (gin2 == 0){
                gin += 7000;
                gin2 = 3;
            }else {
                gin = 97000;
                gin2 = 3;
            }
        });
        ktor10 = findViewById(R.id.ktor_10);
        ktor10.setOnClickListener(view -> {
            ktor10.animate().rotationYBy(360);
            if (gin2 == 0){
                gin += 7000;
                gin2 = 3;
            }else {
                gin = 97000;
                gin2 = 3;
            }
        });
        ktor11 = findViewById(R.id.ktor_11);
        ktor11.setOnClickListener(view -> {
            ktor11.animate().rotationYBy(360);
            if (gin2 == 0){
                gin += 7000;
                gin2 = 3;
            }else {
                gin = 97000;
                gin2 = 3;
            }
        });

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

}