package net.hyang.artgallery.lobby.gridlobby;

import net.hyang.artgallery.MainActivity;
import net.hyang.artgallery.lobby.gridlobby.adapters.ImageAdapter;
import net.hyang.artgallery.lobby.interfaces.Lobby;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;

public class GridLobby implements Lobby {
	private MainActivity mainActivity;
	private GridView gridView;
	
	public GridLobby(MainActivity mainActivity, GridView gridView) {
		this.mainActivity = mainActivity;
		this.gridView = gridView;
	}

	@Override
	public void present() {
		gridView.setAdapter(new ImageAdapter(mainActivity));
		
		gridView.setOnItemClickListener(new OnItemClickListener() {
			final MainActivity mainActivity = GridLobby.this.mainActivity;
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				Toast.makeText(mainActivity, "" + position, Toast.LENGTH_SHORT).show();
			}
		});
	}

}
