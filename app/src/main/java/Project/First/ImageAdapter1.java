package Project.First;

/*public class ImageAdapter1 extends PagerAdapter {

    private Context mContext1;
    String categoryId = "YCgYT6dREsVY7Hub8SLj";
    String image1 = String.valueOf(FirebaseFirestore.getInstance().collection("categories").document(categoryId).collection("products").document("image"));
    private int[] mImageIds1 = new int[] {Integer.parseInt(image1),R.drawable.divan6,R.drawable.divan5};

    ImageAdapter1(Context context){
        mContext1 = context;
    }

    @Override
    public int getCount() {
        return mImageIds1.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContext1);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mImageIds1[position]);
        container.addView(imageView, 0);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView) object);
    }
}
*/