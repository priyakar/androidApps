package com.book.listviewtest;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ButtonTest extends Activity{
	Button testB, changeC, layoutB;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.buttontest);
		initialize();
	}

	private void initialize()
	 {
		// TODO Auto-generated method stub
		final Button testB = (Button) findViewById(R.id.testB);
		Button changeC = (Button) findViewById(R.id.bAC);
		Button layoutB = (Button) findViewById(R.id.btextC);
		testB.setOnClickListener(new Button.OnClickListener(){

			public void onClick(View v) {
				// TODO Auto-generated method stub
				testB.setText("Button works!");
			}
		
		});
		changeC.setOnClickListener(new Button.OnClickListener(){

			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (testB.getHeight() == 100){
					testB.setHeight(30);
				} else {
					testB.setHeight(100);
				}
			}
			});
		
		layoutB.setOnClickListener(new Button.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				testB.setTextColor(Color.GREEN);
			}
			});
		}
		}
		

