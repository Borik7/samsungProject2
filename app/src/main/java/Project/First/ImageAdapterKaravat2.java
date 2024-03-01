package Project.First;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class ImageAdapterKaravat2 extends PagerAdapter {
    private Context mContextkaravat2;
    private int[] mImageIdskaravat2 = new int[] {R.drawable.karavat3,R.drawable.karaavt8,R.drawable.karavat7};

    ImageAdapterKaravat2(Context context){
        mContextkaravat2 = context;
    }

    @Override
    public int getCount() {
        return mImageIdskaravat2.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContextkaravat2);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mImageIdskaravat2[position]);
        container.addView(imageView, 0);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView) object);
    }
}
