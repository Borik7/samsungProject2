package Project.First;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.utils.widget.ImageFilterButton;

import com.google.firebase.auth.FirebaseAuth;
public class MainActivity extends AppCompatActivity {
    String user = FirebaseAuth.getInstance().getCurrentUser().getEmail();
    /*ListUsersPage listUsersPage = FirebaseAuth.getInstance().listUsers(1000);
    for (UserRecord userRecord : listUsersPage.iterateAll()) {
        String email = userRecord.getEmail();
        // Do something with the email (e.g., add it to a list)
    }*/
    
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
