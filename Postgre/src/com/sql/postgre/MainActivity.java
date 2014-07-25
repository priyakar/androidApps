package com.sql.postgre;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import java.sql.*;


public class MainActivity extends Activity {
		
//	private static final String dbname = "postgres";
	public static final String USER = "postgres";
	public static final String PASSWORD = "androidapp";
	TextView text;
	String url = "jdbc:postgresql://localhost/postgres";
		@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		text = (TextView) findViewById(R.id.tvConnect);
					
		try {
			  Class.forName("org.postgresql.Driver");
			 
		} catch (ClassNotFoundException e) {
			  // TODO Auto-generated catch block
			  e.printStackTrace();
			  text.setText("failed b4 drivermangr");
			}
			
		  Connection conn;
		try {
			//conn = DriverManager.getConnection(url);
		
		  conn =  DriverManager.getConnection(url,USER,PASSWORD);
		  if (conn== null){
			  text.setText("Failed!");
		  } else {
		  text.setText("Connected");
		  }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			Log.e("Tag", "Description", e); 
			text.setText("Failed!");
		}
		 		
		}

	}


