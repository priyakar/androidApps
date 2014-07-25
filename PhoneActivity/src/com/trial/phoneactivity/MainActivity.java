package com.trial.phoneactivity;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.os.Build;
import java.util.regex.*;

public class MainActivity extends Activity {
	Button calNum = (Button) findViewById(R.id.bCall);
	EditText editNum = (EditText) findViewById(R.id.etNum);
	
	@Override
	protected void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.activity_main);
	
calNum.setOnClickListener (new Button.OnClickListener(){

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent CallIntent = new Intent(Intent.ACTION_CALL, Uri.parse("Phone"+ editNum.getText()));
		CallIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		startActivity(CallIntent);
	}
	
});
}
}