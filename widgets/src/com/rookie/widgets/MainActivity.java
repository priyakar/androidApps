package com.rookie.widgets;

import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ToggleButton;

public class MainActivity extends Activity implements OnClickListener {
	ToggleButton apMode, wifi, arScreen;
	WifiManager wifiChange;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initialize();
		WifiManager wifiChange = (WifiManager) this.getSystemService(Context.WIFI_SERVICE);
	    ToggleButton wifi = (ToggleButton) findViewById(R.id.tbwifi);
	    wifi.setChecked(wifiChange.isWifiEnabled()); 
	
	}

	private void initialize() {
		// TODO Auto-generated method stub
		// apMode = (ToggleButton) findViewById(R.id.tbair);
		 wifi = (ToggleButton) findViewById(R.id.tbwifi);
		 arScreen = (ToggleButton) findViewById(R.id.tbscreen);
		// apMode.setOnClickListener(this);
		 wifi.setOnClickListener(this);
		 arScreen.setOnClickListener(this);
	}	
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		 if (wifi.isChecked()){
			 wifiChange = (WifiManager) this.getSystemService(Context.WIFI_SERVICE);
			 wifiChange.setWifiEnabled(true);
		 }
		 else {
			 wifiChange = (WifiManager) this.getSystemService(Context.WIFI_SERVICE);
			 wifiChange.setWifiEnabled(false);
		 }
		
		 arScreen.setOnClickListener(new OnClickListener() {

			    
				@Override
			    public void onClick(View v) {
			        startActivity(new Intent(getApplicationContext(), MainActivity.class));
			        android.provider.Settings.System.putInt(getContentResolver(),
			                android.provider.Settings.System.USER_ROTATION,0);
			    }
			});
			arScreen.setOnClickListener(new OnClickListener() {

			   
				@Override
			    public void onClick(View v) {
			        startActivity(new Intent(getApplicationContext(), MainActivity.class));
			        android.provider.Settings.System.putInt(getContentResolver(),
			                android.provider.Settings.System.USER_ROTATION,90);
			    }
			});
	
	}
}

