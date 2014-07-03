package com.example.trivagame;

import android.R.integer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Level2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_level2);
		
		new CountDownTimer(30000,1000) {
			
			@Override
			public void onTick(long millisUntilFinished) {
			TextView Timebox = (TextView) findViewById(R.id.StartCounting);
			Timebox.setText("You have " + millisUntilFinished/1000 + " seconds remaining");	
			}
			 
			@Override
			public void onFinish() {
				Intent intent = new Intent(Level2.this, Level3.class);
				startActivity(intent);
				
				
			}
		}.start();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.level2, menu);
		return true;
	}
	public void SubmitAnswer(View v) {
		
		
		RadioGroup answerChoice = (RadioGroup) findViewById(R.id.radioGroup1);
		int selectedRadio = answerChoice.getCheckedRadioButtonId();
		RadioButton clickRadioButton = (RadioButton)findViewById(selectedRadio);
		String currentAnswer = (String) clickRadioButton.getText();
		if (currentAnswer.equals("2 Timothy 1:7")) {
			int score;
			TextView rightAnswer = (TextView) findViewById(R.id.textView3);
			rightAnswer.setText("Correct Answer");
			
		 score = 100;	
		 Intent intent = new Intent(Level2.this, Level3.class);
			
			intent.putExtra("Playerscore", score);	
			startActivity(intent);
		}
		
		else {
			int score;
			TextView rightAnswer = (TextView) findViewById(R.id.textView3);
			rightAnswer.setText("Wrong: Correct Answer is: 2 Timothy 1:7");
			
		 score = 0;	
		 Intent intent = new Intent(Level2.this, Level3.class);
			
			intent.putExtra("Playerscore", score);
			startActivity(intent);
		}
		
		
		
		
		
		
		
	}
}
