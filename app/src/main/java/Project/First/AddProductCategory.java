package Project.First;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;

import Project.First.databinding.ActivityAddProductCategoryBinding;

public class AddProductCategory extends AppCompatActivity {
    ActivityAddProductCategoryBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddProductCategoryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.saveBtn.setOnClickListener(v -> {
            add();
        });
    }
    private void add() {
        HashMap<String, Object> category = new HashMap<>();
        category.put("name", binding.name.getText().toString());
        FirebaseFirestore.getInstance().collection("categories")
                .add(category)
                .addOnSuccessListener(documentReference -> {
                    Toast.makeText(getApplicationContext(), "Category is added", Toast.LENGTH_SHORT).show();
                });
    }
}