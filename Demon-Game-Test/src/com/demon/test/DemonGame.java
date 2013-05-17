package com.demon.test;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class DemonGame implements ApplicationListener {
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private Texture texture;
	private Sprite sprite;
	TextureRegion region;
	private SpriteBatch spriteBatch;
	private BitmapFont bitmapFont;
	@Override
	public void create() {		
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		
		camera = new OrthographicCamera(1, h/w);
		batch = new SpriteBatch();
//		
		texture = new Texture(Gdx.files.internal("data/image/one.png"));
//		texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
//		
		 region = new TextureRegion(texture, 0, 0, 48, 48);
		
		sprite = new Sprite(region);
		sprite.setSize(50,50);
//		sprite.setOrigin(sprite.getWidth()/2, sprite.getHeight()/2);
		sprite.setPosition(10, 10);
		
//		spriteBatch = new SpriteBatch();
		//字体
		bitmapFont = new BitmapFont(Gdx.files.internal("data/font/myfont.fnt"), Gdx.files.internal("data/font/myfont.png"), false);
	}

	@Override
	public void dispose() {
		batch.dispose();
		texture.dispose();
	}

	@Override
	public void render() {		
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
//		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		sprite.draw(batch);
//		batch.draw(region, 0, 0, 480, 320);
//		batch.draw(texture, 48, 48); q
		bitmapFont.drawMultiLine(batch, "我在制作\n骰子", 100, 100);
		batch.end();
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
