package Project.First;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codebyashish.autoimageslider.ExceptionsClass;
import com.squareup.picasso.Picasso;

import java.util.List;

import Project.First.databinding.ItemContainerProductBinding;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    private final List<Product> products;
    private static Context context;

    public ProductAdapter(List<Product> products, Context context) {
        this.products = products;
        this.context = context;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemContainerProductBinding itemContainerProductBinding = ItemContainerProductBinding.inflate(
                LayoutInflater.from(parent.getContext()),
                parent,
                false
        );
        return new ProductViewHolder(itemContainerProductBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        try {
            holder.setProductData(products.get(position));
        } catch (ExceptionsClass e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int getItemCount() {return products.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {
        ItemContainerProductBinding binding;

        ProductViewHolder(ItemContainerProductBinding itemContainerProductBinding) {
            super(itemContainerProductBinding.getRoot());
            binding = itemContainerProductBinding;
        }
        void setProductData(Product productData) throws ExceptionsClass {
            if (productData.image != null) {
                Picasso.get().load(productData.image).into(binding.imageView1);
            }
            binding.textView1.setText(productData.name);
            binding.textView2.setText(productData.price);
            binding.postConstraint.setOnClickListener(v -> {
                Intent intent = new Intent(context.getApplicationContext(), Divan_1.class);
                intent.putExtra("categoryId", productData.categoryId);
                intent.putExtra("productId", productData.productId);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            });
        }
    }
}
