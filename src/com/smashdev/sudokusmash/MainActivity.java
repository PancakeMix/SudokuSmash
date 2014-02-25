package com.smashdev.sudokusmash;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;

public class MainActivity extends Activity {
	
	View begin, easy, medium, hard;
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		begin = findViewById(R.id.bBegin);
/*		easy = findViewById(R.id.bEasy);
		medium = findViewById(R.id.bMedium);
		hard = findViewById(R.id.bHard);*/
		
		begin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Thread gameStart = new Thread() {
					public void run() {
					Intent newGame = new Intent("com.smashdev.sudokusmash.GAME");
					startActivity(newGame);
					}
				};
				gameStart.start();
				
			}
		});
/*		easy.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		medium.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		hard.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});*/
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

