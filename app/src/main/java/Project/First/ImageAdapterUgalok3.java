package Project.First;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class ImageAdapterUgalok3 extends PagerAdapter {
    private Context mContextugol3;
    private int[] mImageIdsugol3 = new int[] {R.drawable.divan1,R.drawable.divan3,R.drawable.divan4};

    ImageAdapterUgalok3(Context context){
        mContextugol3 = context;
    }

    @Override
    public int getCount() {
        return mImageIdsugol3.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContextugol3);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mImageIdsugol3[position]);
        container.addView(imageView, 0);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView) object);
    }
}
