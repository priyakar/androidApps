package com.img.imagedwnloader;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	static Button dwnload;
	static EditText link;
	static TextView textv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		dwnload = (Button) findViewById (R.id.bstrtD);
		link = (EditText) findViewById (R.id.etlink);
		textv = (TextView) findViewById (R.id.tvUpdate);
		dwnload.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				new Thread (new Runnable(){

					@Override
					public void run() {
						// TODO Auto-generated method stub
						try{
							URL url = new URL (link.getText().toString());
							textv.setText(link.getText());
							HttpURLConnection urlconnect = (HttpURLConnection) url.openConnection();
							urlconnect.setRequestMethod("GET");
							urlconnect.setDoOutput(true);
							urlconnect.connect();
							File storedwn = Environment.getExternalStorageDirectory();
							File file = new File (storedwn, "downloadFile.jpg");
							
							} catch (Exception e){
								textv.setText("Failed!");
							}
						//downloadVid();
					}

					private void downloadVid() {
						// TODO Auto-generated method stub
						try{
						URL url = new URL (link.getText().toString());
						textv.setText(link.getText());
						HttpURLConnection urlconnect = (HttpURLConnection) url.openConnection();
						urlconnect.setRequestMethod("GET");
						urlconnect.setDoOutput(true);
						urlconnect.connect();
						File storedwn = Environment.getExternalStorageDirectory();
						File file = new File (storedwn, "downloadFile.avi");
						
						} catch (Exception e){
							textv.setText("Failed!");
						}
					}
					
				}).start();;
			}
			
		});
	}

	
}
