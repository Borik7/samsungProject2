package Project.First;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.utils.widget.ImageFilterButton;

import android.view.SurfaceView;
import android.widget.Button;
import android.content.Intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    
    private ImageFilterButton button;
    private int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.group_2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onPopular();
            }
        });
    }

    public void onPopular(){
        Intent intent = new Intent(this, LoginActivity.class);
        intent.putExtra("categoryId", "YCgYT6dREsVY7Hub8SLj");
        intent.putExtra("productId", "OFipHVkV65Vaw46OWuzr");
        startActivity(intent);
    }
}
