package com.example.trivagame;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Level4 extends Activity {
public int currentscore;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_level4);
		
new CountDownTimer(30000,1000) {
			
			@Override
			public void onTick(long millisUntilFinished) {
			TextView Timebox = (TextView) findViewById(R.id.textView5);
			Timebox.setText("You have " + millisUntilFinished/1000 + " seconds remaining");	
			}
			 
			@Override
			public void onFinish() {
				Intent intent = new Intent(Level4.this, Level5.class);
				startActivity(intent);
				
				
			}
		}.start();
		Intent intent = getIntent();
		
		int currentscore = intent.getIntExtra("Playerscore", 0);
		TextView scoreboard = (TextView)findViewById(R.id.textView4);
		scoreboard.setText("Score: "+ currentscore);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.level4, menu);
		return true;
	}
public void SubmitAnswer(View v) {
		
		
		RadioGroup answerChoice = (RadioGroup) findViewById(R.id.radioGroup1);
		int selectedRadio = answerChoice.getCheckedRadioButtonId();
		RadioButton clickRadioButton = (RadioButton)findViewById(selectedRadio);
		String currentAnswer = (String) clickRadioButton.getText();
		
		Intent intent1 = getIntent();
		
		int currentscore = intent1.getIntExtra("Playerscore", 0);
		
		if (currentAnswer.equals("unto, will answer, great, unsearchable")) {
			int score;
			TextView rightAnswer = (TextView) findViewById(R.id.textView6);
			rightAnswer.setText("Correct Answer");
		
			
		 score = currentscore + 100;	
		 Intent intent = new Intent(Level4.this, Level5.class);
			
			intent.putExtra("Playerscore", score);	
			startActivity(intent);
		}
		
		else {
			int score;
			TextView rightAnswer = (TextView) findViewById(R.id.textView6);
			rightAnswer.setText("Wrong: Correct Answer is: unto, will answer, great, unsearchable");
			
		 score = currentscore + 0;	
		 Intent intent = new Intent(Level4.this, Level5.class);
			
			intent.putExtra("Playerscore", score);
			startActivity(intent);
		}
		
		
		
		
		
		
		
	}
	
}
