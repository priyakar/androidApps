package com.book.listviewtest;

//import com.newboston.thefirst.Menu;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class AutoComplete extends Activity {
		
	public void onCreate (Bundle onSavedInstantState){
		super.onCreate(onSavedInstantState);
		setContentView(R.layout.autocomplete);
		ArrayAdapter<String> monthArray= new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1,Months);
		final AutoCompleteTextView textView= (AutoCompleteTextView)findViewById(R.id.testAC);
		Button changeB = (Button) findViewById(R.id.btextC);
		Button changeB2= (Button) findViewById(R.id.bAC);
		textView.setAdapter(monthArray);
		changeB.setOnClickListener(new Button.OnClickListener(){
			public void onClick(View v){
				if (textView.getHeight()==100){
					textView.setHeight(30);
				} else {
					textView.setHeight(100);
				}	
			}
		});
		changeB2.setOnClickListener(new Button.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				textView.setTextColor(Color.RED);	
			}
			
		});
	}
	static final String[] Months= new String [] {"January","Janar","February","March","April"};
	
	
	}
