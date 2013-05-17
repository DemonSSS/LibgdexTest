package com.demon.test;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Animation implements ApplicationListener {
	com.badlogic.gdx.graphics.g2d.Animation animation;
	TextureRegion[] shaiziFrames;
	private Texture texture;
	TextureRegion region;
	SpriteBatch batch;
	TextureRegion currentFrame;

	float stateTime;

	@Override
	public void create() {
		batch = new SpriteBatch();
		texture = new Texture(Gdx.files.internal("data/image/one.png"));
		// texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		//
		region = new TextureRegion(texture, 0, 0, 48, 48);
		shaiziFrames = new TextureRegion[6];
		shaiziFrames[0] = region;
		texture = new Texture(Gdx.files.internal("data/image/two.png"));
		region = new TextureRegion(texture, 0, 0, 48, 48);
		shaiziFrames[1] = region;
		texture = new Texture(Gdx.files.internal("data/image/three.png"));
		region = new TextureRegion(texture, 0, 0, 48, 48);
		shaiziFrames[2] = region;
		texture = new Texture(Gdx.files.internal("data/image/four.png"));
		region = new TextureRegion(texture, 0, 0, 48, 48);
		shaiziFrames[3] = region;
		texture = new Texture(Gdx.files.internal("data/image/five.png"));
		region = new TextureRegion(texture, 0, 0, 48, 48);
		shaiziFrames[4] = region;
		texture = new Texture(Gdx.files.internal("data/image/six.png"));
		region = new TextureRegion(texture, 0, 0, 48, 48);
		shaiziFrames[5] = region;
		animation = new com.badlogic.gdx.graphics.g2d.Animation(0.5f,
				shaiziFrames);
		animation.setPlayMode(animation.LOOP_RANDOM);
		int Temp=(int) Math.round(Math.random()*6+0);
		System.out.print(Temp);
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		stateTime += Gdx.graphics.getDeltaTime();

		currentFrame = animation.getKeyFrame(stateTime, true);

		batch.begin();
		batch.draw(currentFrame, Gdx.graphics.getWidth() / 2,
				Gdx.graphics.getHeight() / 2);
		batch.end();
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
