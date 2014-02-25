package com.smashdev.sudokusmash;

import android.os.Bundle;
import android.view.Window;
import android.app.Activity;


public class Game extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.game);
	}

}
