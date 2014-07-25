package com.example.todolist;

import java.util.ArrayList;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.os.Build;
import android.app.ListActivity;

public class MainActivity extends Activity implements OnClickListener{
	private ArrayList<String> items; 
	private ArrayAdapter <String> adapter;
	private EditText ptadd;
	private Button badd;
	private ListView lvTodo;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initialize();
		items = new ArrayList <String>();
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
		lvTodo.setAdapter(adapter);
		setListViewListener();
			
	}	
	private void setListViewListener(){
		lvTodo.setOnItemLongClickListener(new OnItemLongClickListener (){

			@Override
			public boolean onItemLongClick(AdapterView<?> vadapter, View item,
					int position, long id) {
				// TODO Auto-generated method stub
				items.remove(position);
				adapter.notifyDataSetChanged();
				return true;
			}
			
		});
	}

	private void initialize() {
		// TODO Auto-generated method stub
		ptadd = (EditText) findViewById(R.id.etadd);
		lvTodo = (ListView) findViewById(R.id.lvTodo);
		badd = (Button) findViewById(R.id.badd);
		badd.setOnClickListener(this);
	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		String lv = ptadd.getText().toString();
		adapter.add(lv);
		ptadd.setText("");
		
	}

	
}


