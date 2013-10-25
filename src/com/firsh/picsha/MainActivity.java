package com.firsh.picsha;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	ImageButton button_take, button_send;
	private static int RESULT_LOAD_IMAGE = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		setContentView(R.layout.activity_main);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE,R.layout.titlebar);
		
		

		button_take = (ImageButton) findViewById(R.id.take_button);
		button_send = (ImageButton) findViewById(R.id.send_button);

		button_take.setOnClickListener(this);
		button_send.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.take_button:
			//showPopupMenu(v);
		case R.id.send_button:
			;
		}
	}

//	public void showPopupMenu(View v) {
//		PopupMenu popup_menu = new PopupMenu(MainActivity.this, v);
//		popup_menu.getMenuInflater().inflate(R.menu.popup_menu, popup_menu.getMenu());
//		popup_menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
//
//			@Override
//			public boolean onMenuItemClick(MenuItem item) {
//				// Toast.makeText(MainActivity.this,
//				// item.toString(),Toast.LENGTH_LONG).show();
//				switch (item.getItemId()) {
//				case 1:
//					;
//				case 2:
//					selectExist(item);
//				}
//				return true;
//			}
//		});
//		popup_menu.show();
//
//	}
//
//	public void selectExist(MenuItem item) {
//		Intent i = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
//		startActivityForResult(i, RESULT_LOAD_IMAGE);
//
//	}

//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.main, menu);
//		return true;
//	}

}
