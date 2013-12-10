package com.mdobbins.sample;

import com.mdobbins.framework.Screen;
import com.mdobbins.implementation.framework.AndroidGame;

public class SampleGame extends AndroidGame {
    @Override
    public void onBackPressed() {
    getCurrentScreen().backButton();
    }
//    int frameBufferWidth = isPortrait ? 800: 1280;
//    int frameBufferHeight = isPortrait ? 1280: 800;
	
	
    @Override
    public Screen getInitScreen() {
        return new LoadingScreen(this);
    }

   
}