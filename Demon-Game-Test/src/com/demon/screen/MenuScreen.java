package com.demon.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.demon.game.LetsRollGame;

public class MenuScreen implements Screen{
	private LetsRollGame game;
	private Stage stage;
	private static boolean  START_GAME = false;
	private Sprite bgSprite;
	private Sprite startSprite;
	private SpriteBatch batch;
	private OrthographicCamera camera;
	public MenuScreen(LetsRollGame game) {
		super();
		this.game = game;
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
//		batch.setProjectionMatrix(camera.combined);
//		batch.begin();
//		bgSprite.draw(batch);
//		startSprite.draw(batch);
//		batch.end();
		stage.draw();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		//一个二维的正交相机 复制给batch 提供正交投影大小 复制控制显示
		camera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		//设置Y轴的
		camera.setToOrtho(false);
		
		
		stage = new Stage(480, 320, false);
		Gdx.input.setInputProcessor(stage);
//		bgSprite = new Sprite(LetsRollGame.getManager().get("data/image/bg.png", Texture.class));
//		startSprite= new Sprite(LetsRollGame.getManager().get("data/image/start.png", Texture.class));
//		startSprite.setPosition(150, 50);
//		batch = new SpriteBatch();
		stage.addActor(new Image(LetsRollGame.getManager().get("data/image/bg.png", Texture.class)));
		Image startImage = new Image(LetsRollGame.getManager().get("data/image/start.png", Texture.class));
		startImage.setPosition(150, 50);
		stage.addActor(startImage);
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
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
