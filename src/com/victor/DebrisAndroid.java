package com.victor;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;

public class DebrisAndroid extends AndroidApplication {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initialize(new Debris(), false);
	}
}