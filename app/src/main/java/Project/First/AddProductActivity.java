package Project.First;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.HashMap;
import java.util.Locale;

import Project.First.databinding.ActivityDivan1Binding;

public class AddProductActivity extends AppCompatActivity {
    private static final int PICK_IMAGE_REQUEST = 1;
    private Uri imageUri;
    EditText nameEditText;
    EditText priceEditText;
    EditText descriptoinEditText;
    EditText erkchaperEditText;
    EditText ktorEditText;
    EditText kojEditText;
    EditText categoryEditText;
    EditText tevkoj;
    EditText desc3d;
    Button saveBtn;
    Button imageButton;
    StorageReference storageReference;
    EditText editText;
    EditText garantya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);
        FirebaseStorage storage = FirebaseStorage.getInstance();
        editText = findViewById(R.id.edittext);
        desc3d = findViewById(R.id.desc3d);
        tevkoj = findViewById(R.id.tevkoj);
        garantya = findViewById(R.id.garantya);
        storageReference = storage.getReference();
        nameEditText = findViewById(R.id.name);
        priceEditText = findViewById(R.id.price);
        descriptoinEditText = findViewById(R.id.description);
        erkchaperEditText = findViewById(R.id.erkchap);
        kojEditText = findViewById(R.id.kojer);
        ktorEditText = findViewById(R.id.ktorner);
        categoryEditText = findViewById(R.id.category);
        imageButton = findViewById(R.id.uploadImage);
        imageButton.setOnClickListener(v -> {
            chooseImage();
        });
    }
    private void chooseImage() {
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent, PICK_IMAGE_REQUEST);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null && data.getData() != null) {
            imageUri = data.getData();
            uploadImage();
        }
    }
    private void uploadImage() {
        if (imageUri != null) {
            // Get a reference to the location where the image will be saved in Firebase Storage
            StorageReference imageRef = storageReference.child("product_images/" + System.currentTimeMillis() + ".jpg");

            // Upload the image to Firebase Storage
            imageRef.putFile(imageUri)
                    .addOnSuccessListener(taskSnapshot -> {
                        // Image uploaded successfully, get the download URL
                        imageRef.getDownloadUrl()
                                .addOnSuccessListener(uri -> {
                                    // Image download URL obtained, now add product to Firestore
                                    addProduct(uri.toString());
                                })
                                .addOnFailureListener(e -> {
                                    // Failed to get image download URL
                                    Toast.makeText(AddProductActivity.this, "Failed to get image URL: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                                });
                    })
                    .addOnFailureListener(e -> {
                        // Failed to upload image
                        Toast.makeText(AddProductActivity.this, "Failed to upload image: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                    });
        }
    }
    
   private void addProduct(String imageUrl)
    {
        String name = nameEditText.getText().toString();
        String garant = garantya.getText().toString();
        String tev = tevkoj.getText().toString();
        String d3 = desc3d.getText().toString();
        String price = priceEditText.getText().toString();
        String desc = descriptoinEditText.getText().toString();
        String erk = erkchaperEditText.getText().toString();
        String koj = kojEditText.getText().toString();
        String ktor = ktorEditText.getText().toString();
        String category = categoryEditText.getText().toString();
        HashMap<String, Object> product = new HashMap<>();
        product.put("name", name);
        product.put("Garantya", garant);
        product.put("3ddesc", d3);
        product.put("Tevkoj", tev);
        product.put("price", price);
        product.put("Description", desc);
        product.put("Erkchap", erk);
        product.put("Koj", koj);
        product.put("Ktor", ktor);
        product.put("imageUrl", imageUrl);
        if (category.equals("Divan")) {
            FirebaseFirestore.getInstance().collection("categories").whereEqualTo("name", category)
                    .get()
                    .addOnCompleteListener(task -> {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot parentDocument : task.getResult()) {
                                CollectionReference ref = parentDocument.getReference().collection("products");
                                ref.add(product)
                                        .addOnSuccessListener(documentReference -> {
                                            Toast.makeText(AddProductActivity.this, "Product added successfully", Toast.LENGTH_SHORT).show();
                                            finish();
                                        });
                            }
                        }
                    });
        }
    }
}