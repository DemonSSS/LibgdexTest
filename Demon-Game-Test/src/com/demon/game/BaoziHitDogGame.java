package com.demon.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;

public class BaoziHitDogGame extends Game{
	
	private static AssetManager _manager;
	private static PlatformResolver _resolver = null;
	@Override
	public void create() {
		
	}

	public static AssetManager getManager() {
		if (_manager == null) {
			_manager = new AssetManager();
		}
		return _manager;
	}

	public static PlatformResolver getPlatformResolver() {
		return _resolver;
	}

	public static void setPlatformResolver(PlatformResolver _resolver) {
		BaoziHitDogGame._resolver = _resolver;
	}
	
	
}
