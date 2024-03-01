package Project.First;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class ImageAdapterKaravat4 extends PagerAdapter {
    private Context mContextkaravat4;
    private int[] mImageIdskaravat4 = new int[] {R.drawable.karavat5,R.drawable.karavat4,R.drawable.karavat7};

    ImageAdapterKaravat4(Context context){
        mContextkaravat4 = context;
    }

    @Override
    public int getCount() {
        return mImageIdskaravat4.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContextkaravat4);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mImageIdskaravat4[position]);
        container.addView(imageView, 0);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView) object);
    }
}
