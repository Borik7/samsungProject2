package Project.First;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class ImageAdapterKaravat3 extends PagerAdapter {
    private Context mContextkaravat3;
    private int[] mImageIdskaravat3 = new int[] {R.drawable.karavat2,R.drawable.karavat5,R.drawable.karavat3};

    ImageAdapterKaravat3(Context context){
        mContextkaravat3 = context;
    }

    @Override
    public int getCount() {
        return mImageIdskaravat3.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContextkaravat3);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mImageIdskaravat3[position]);
        container.addView(imageView, 0);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView) object);
    }
}
