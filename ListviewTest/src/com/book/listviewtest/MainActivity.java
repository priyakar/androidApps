package com.book.listviewtest;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.internal.view.menu.MenuView.ItemView;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;


public class MainActivity extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		}

	public boolean onCreateOptionsMenu(Menu menu){
		super.onCreateOptionsMenu(menu);
		menu.add(0, 0, 0, "AutoComplete");
		menu.add(0, 1, 1, "Button");
		menu.add(0, 2, 2, "Checkbox");
		menu.add(0, 3, 3, "EditText");
		menu.add(0, 4, 4, "RadioGroup");
		menu.add(0, 5, 5, "Spinner");
		return true;
	}
	public boolean onOptionsItemSelected(MenuItem item){
		switch(item.getItemId()){
		case 0:
			showAutoComplete();
			return true;
		case 1:
			showButtontest();
			return true;
		}
		return true;
	}

	private void showButtontest() {
		// TODO Auto-generated method stub
		Intent showB = new Intent (this, ButtonTest.class);
		startActivity(showB);
	}

	private void showAutoComplete() {
		// TODO Auto-generated method stub
		Intent showAuto = new Intent (this, AutoComplete.class);
		startActivity(showAuto);
	}
}
