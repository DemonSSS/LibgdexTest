package com.demon.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;
import com.demon.screen.LoadingScreen;

public class LetsRollGame extends Game{
	public static AssetManager manager;
	@Override
	public void create() {
		// TODO Auto-generated method stub
		setScreen(new LoadingScreen(this));
	}
	public static AssetManager getManager() {
		if (manager == null) {
			manager = new AssetManager();
		}
		return manager;
	}
}
