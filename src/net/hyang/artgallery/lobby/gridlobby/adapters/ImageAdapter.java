package net.hyang.artgallery.lobby.gridlobby.adapters;

import java.util.ArrayList;
import java.util.List;

import net.hyang.artgallery.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
	private Context context;
	private List<Integer> images;
	
	public ImageAdapter(Context context) {
		this.context = context;
		this.images = new ArrayList<Integer>();
		images.add(R.drawable.sample_0);
		images.add(R.drawable.sample_1);
		images.add(R.drawable.sample_2);
		images.add(R.drawable.sample_3);
		images.add(R.drawable.sample_4);
		images.add(R.drawable.sample_5);
		images.add(R.drawable.sample_6);
		images.add(R.drawable.sample_7);
		images.add(R.drawable.sample_3);
	}

	@Override
	public int getCount() {
		return images.size();
	}

	@Override
	public Object getItem(int position) {
		return null;
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView imageView;
		if (convertView == null) {
			imageView = new ImageView(context);
//			imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
//            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(images.get(position));
        return imageView;
	}

}
