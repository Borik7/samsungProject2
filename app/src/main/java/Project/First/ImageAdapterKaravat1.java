package Project.First;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class ImageAdapterKaravat1 extends PagerAdapter {
    private Context mContextkaravat1;
    private int[] mImageIdskaravat1 = new int[] {R.drawable.divan1,R.drawable.divan3,R.drawable.divan4};

    ImageAdapterKaravat1(Context context){
        mContextkaravat1 = context;
    }

    @Override
    public int getCount() {
        return mImageIdskaravat1.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContextkaravat1);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mImageIdskaravat1[position]);
        container.addView(imageView, 0);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView) object);
    }
}
