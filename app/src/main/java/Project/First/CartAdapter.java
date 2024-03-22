package Project.First;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codebyashish.autoimageslider.ExceptionsClass;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.squareup.picasso.Picasso;

import java.util.List;

import Project.First.databinding.ActivityCartAdapterBinding;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartViewHolder> {
    Button plus;
    Button minus;
    TextView count;
    int count1;
    Button remove;
    private final List<CartItem> cartitems;
    private static Context context;
    /*protected void onCreate(Bundle savedInstanceState) {

    }*/

    public CartAdapter(List<CartItem> cartitems, Context context) {
        this.cartitems = cartitems;
        this.context = context;
    }

    @NonNull
    @Override
    public CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ActivityCartAdapterBinding itemContainerCartBinding = ActivityCartAdapterBinding.inflate(
                LayoutInflater.from(parent.getContext()),
                parent,
                false
        );
        return new CartViewHolder(itemContainerCartBinding);
    }

//    @Override
    /*
    public void onBindViewHolder(@NonNull CartAdapter.CartViewHolder holder, int position) {


    }*/

    @Override
    public void onBindViewHolder(@NonNull CartViewHolder holder, int position) {
        try {
            holder.setCartData(cartitems.get(position));
        } catch (ExceptionsClass e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int getItemCount() {
        return cartitems.size();
    }

    class CartViewHolder extends RecyclerView.ViewHolder {

        ActivityCartAdapterBinding binding;

        CartViewHolder(ActivityCartAdapterBinding ActivityCartAdapterBinding) {
            super(ActivityCartAdapterBinding.getRoot());
            binding = ActivityCartAdapterBinding;
        }

        void setCartData(CartItem cartData) throws ExceptionsClass {
            binding.textViewcount.setText(Integer.toString(cartData.itemCount));
            FirebaseFirestore.getInstance().collection("categories").document(cartData.categoryId).collection("products").document(cartData.itemId)
                    .get()
                    .addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                        @Override
                        public void onSuccess(DocumentSnapshot documentSnapshot) {
                           /* plus.findViewById(R.id.imageViewplus);
                            plus.setOnClickListener(view ->{
                                int gin = (int) documentSnapshot.get("price");
                                gin++;
                                FirebaseFirestore.getInstance().collection("carts").whereEqualTo("price",gin);
                            });*/


                            if (documentSnapshot.getString("imageUrl") != null) {
                                Picasso.get().load(documentSnapshot.getString("imageUrl")).into(binding.imageView1);
                            }

                            binding.textView1.setText(documentSnapshot.getString("name"));
                            int price = cartData.price;
                            binding.textView2.setText(Integer.toString(price));
                            binding.imageView1.setOnClickListener(v -> {
                                Intent intent = new Intent(context.getApplicationContext(), Divan_1.class);
                                intent.putExtra("categoryId", cartData.categoryId);
                                intent.putExtra("productId", cartData.itemId);
                                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                context.startActivity(intent);
                            });
                            binding.imageViewplus.setOnClickListener(view ->{
//                                FirebaseFirestore.getInstance().collection("carts").document(cartData.categoryId).collection("carts").document(cartData.cartItemId)
//                                                .collection("cartitems").document("itemCount").
//                                                get()
//                                        .addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
//                                            @Override
//                                            public void onSuccess(DocumentSnapshot documentSnapshot) {
//                                                //int asd = (int) documentSnapshot.get("itemCount");
//                                                binding.textViewcount.setText(cartData.itemCount++);
//                                                //count++;
//                                            }
//                                        });

                                    int count1 = cartData.itemCount++;
                                    FirebaseFirestore.getInstance().collection("carts")
                                            .document(cartData.cartId).collection("cartItems").document(cartData.cartItemId).update("itemCount", count1);
                                binding.textView2.setText(Integer.toString(cartData.price * count1));
                                    binding.textViewcount.setText(Integer.toString(count1));


                                /*cartData.itemCount++;
                                cartData.price = price * cartData.itemCount;
                                binding.textView1.setText(cartData.itemCount);*/
                            });
                            binding.imageViewminus.setOnClickListener(view ->{
//                                FirebaseFirestore.getInstance().collection("carts").document(cartData.categoryId).collection("carts").document(cartData.cartItemId)
//                                                .collection("cartitems").document("itemCount").
//                                                get()
//                                        .addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
//                                            @Override
//                                            public void onSuccess(DocumentSnapshot documentSnapshot) {
//                                                //int asd = (int) documentSnapshot.get("itemCount");
//                                                binding.textViewcount.setText(cartData.itemCount++);
//                                                //count++;
//                                            }
//                                        });
                                if(cartData.itemCount > 0) {
                                    int count1 = cartData.itemCount--;
                                    FirebaseFirestore.getInstance().collection("carts").document(cartData.cartId)
                                            .collection("cartItems").document(cartData.cartItemId).update("itemCount", count1);
                                    binding.textView2.setText(Integer.toString(cartData.price * count1));
                                    binding.textViewcount.setText(Integer.toString(count1));

                                }
                                /*cartData.itemCount++;
                                cartData.price = price * cartData.itemCount;
                                binding.textView1.setText(cartData.itemCount);*/
                            });
                            binding.imageViewdelete.setOnClickListener(view ->{
                                FirebaseFirestore.getInstance().collection("carts").document(cartData.cartId).collection("cartItems")
                                        .document(cartData.cartItemId).delete().addOnSuccessListener(new OnSuccessListener<Void>() {
                                            @Override
                                            public void onSuccess(Void unused) {
                                                //((AddToCart)context).finish();
                                                Intent intent = new Intent(context , MainActivity2.class);
                                                context.startActivity(intent);
                                                Toast.makeText(context, "Deleted", Toast.LENGTH_SHORT).show();
                                            }
                                        });
                            });
                        }
                    });
        }
        /*private void finish1(){
            ((AddToCart)context).finish();
        }*/
    }
}
