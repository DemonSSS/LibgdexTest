package com.demon.test;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.demon.game.LetsRollGame;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Demon-Game-Test";
		cfg.useGL20 = false;
		cfg.width = 480;
		cfg.height = 320;
		
		new LwjglApplication(new Camera(), cfg);
	}
}
