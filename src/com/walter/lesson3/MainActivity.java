package com.walter.lesson3;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void save(View x) {
		CheckBox cbRugby = (CheckBox) findViewById(R.id.cbRugby);
		CheckBox cbFootball = (CheckBox) findViewById(R.id.cbFootball);
		CheckBox cbHockey = (CheckBox) findViewById(R.id.cbHockey);
		CheckBox cbAthletics = (CheckBox) findViewById(R.id.cbAthletics);
		TextView tvResults = (TextView) findViewById(R.id.tvResults);

		String rugby = "", football = "", hockey = "", athletics = "";

		if (cbRugby.isChecked()) {
			rugby = "Rugby";
		}

		if (cbFootball.isChecked()) {
			football = "Football";
		}

		if (cbHockey.isChecked()) {
			hockey = "Hockey";
		}

		if (cbAthletics.isChecked()) {
			athletics = "Athletics";
		}

		tvResults.setText(hockey + "\n" + football + "\n"
		                  + rugby + "\n"+ athletics);
		
		RadioButton male =(RadioButton) findViewById(R.id.rbMale);
		RadioButton female= (RadioButton) findViewById(R.id.rbFemale);
		String gender = "";
		if(male.isChecked())
		{
		  gender = "Male";	
		}
		else if(female.isChecked())
		{
			gender = "Female";	
		}
		Toast.makeText(this, gender, Toast.LENGTH_LONG).show();
		ProgressBar bar = (ProgressBar) findViewById(R.id.progressBar1);
		bar.setVisibility(View.INVISIBLE);//View.VISIBLE
		
		cbRugby.setVisibility(View.INVISIBLE);
		
		
		
		
		

	}

}
