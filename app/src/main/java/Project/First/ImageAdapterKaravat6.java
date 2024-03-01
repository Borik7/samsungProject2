package Project.First;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class ImageAdapterKaravat6 extends PagerAdapter {
    private Context mContextkaravat6;
    private int[] mImageIdskaravat6 = new int[] {R.drawable.karavat2,R.drawable.karavat7,R.drawable.karavat5};

    ImageAdapterKaravat6(Context context){
        mContextkaravat6 = context;
    }

    @Override
    public int getCount() {
        return mImageIdskaravat6.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContextkaravat6);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mImageIdskaravat6[position]);
        container.addView(imageView, 0);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView) object);
    }
}
