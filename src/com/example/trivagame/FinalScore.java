package com.example.trivagame;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class FinalScore extends Activity {
public int finalscore;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_final_score);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.final_score, menu);
		return true;
	}

}
