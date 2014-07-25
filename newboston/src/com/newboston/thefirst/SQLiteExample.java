package com.newboston.thefirst;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class SQLiteExample extends Activity implements OnClickListener{

	Button sqlUpdate, sqlView;
	EditText sqlName, sqlFriend;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sqliteexample);
		sqlUpdate = (Button) findViewById(R.id.bsqlUpdate);
		sqlView = (Button) findViewById(R.id.bsqlview);
		sqlName = (EditText) findViewById (R.id.etsqlName);
		sqlFriend = (EditText) findViewById(R.id.etsqlfrnd);
		
		sqlUpdate.setOnClickListener(this);
		sqlName.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
	switch (v.getId()){
	case R.id.bsqlUpdate:
		String name = sqlName.getText().toString();
		String frnd = sqlFriend.getText().toString();
		
		Friendliness entry = new Friendliness (SQLiteExample.this);
		entry.open();
		entry.createEntry(name, frnd);
		entry.Close();
		break;
	case R.id.bsqlview:
		
		break;
	}
	}
}
