package com.henryxian.listview3;

import android.app.ListActivity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Context context = getApplicationContext();
		Resources resources = context.getResources();
		
		String[] options = resources.getStringArray(
				R.array.country_name);
		TypedArray icons = resources.obtainTypedArray(R.array.country_icons);
		setListAdapter(new ImageAndTextAdapter(context, R.layout.main_list_item, options, icons));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
