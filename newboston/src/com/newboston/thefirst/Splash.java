package com.newboston.thefirst;



	import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

	public class Splash extends Activity {
		MediaPlayer mySong;
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setContentView(R.layout.splash);
			 mySong= MediaPlayer.create(Splash.this, R.raw.androidmus);
			mySong.start();
			Thread timer= new Thread(){
				public void run(){
					try{
						sleep(5000);
						Intent change = new Intent("com.newboston.thefirst.MENU");
						startActivity(change);
						
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}
				
			};
			
			timer.start();
		}

		@Override
		protected void onPause() {
			// TODO Auto-generated method stub
			super.onPause();
			mySong.release();
			finish();
		}
		

	}
	

