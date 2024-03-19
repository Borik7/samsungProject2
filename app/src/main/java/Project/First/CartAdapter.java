package Project.First;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codebyashish.autoimageslider.ExceptionsClass;
import com.squareup.picasso.Picasso;

import java.util.List;

import Project.First.databinding.ActivityCartAdapterBinding;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartViewHolder> {

    private final List<CartItem> cartitems;
    private static Context context;

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
    public int getItemCount() {return cartitems.size();
    }

    class CartViewHolder extends RecyclerView.ViewHolder {
        ActivityCartAdapterBinding binding;

        CartViewHolder(ActivityCartAdapterBinding ActivityCartAdapterBinding) {
            super(ActivityCartAdapterBinding.getRoot());
            binding = ActivityCartAdapterBinding;
        }
        void setCartData(CartItem cartData) throws ExceptionsClass {
            if (cartData.image != null) {
                Picasso.get().load(cartData.image).into(binding.imageView1);
            }
            binding.textView1.setText(cartData.name);
            binding.textView2.setText(cartData.price);
            binding.cartConstrait.setOnClickListener(v -> {
                Intent intent = new Intent(context.getApplicationContext(), Divan_1.class);
                intent.putExtra("categoryId", cartData.categoryId);
                intent.putExtra("productId", cartData.itemId);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            });
        }
    }
}
