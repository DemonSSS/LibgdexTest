package com.demon.test;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

public class UIElement implements ApplicationListener {
	private BitmapFont bitmapFont;
	private Stage stage;
	private LabelStyle labelStyle;
	Image VictoriaImage;
	TextureRegion region;
	Texture tex;
	TextureRegion one;
	TextureRegion two;
	ImageButton button;
	TextureRegionDrawable up;
	TextureRegionDrawable down;

	@Override
	public void create() {
		// TODO Auto-generated method stub
		bitmapFont = new BitmapFont(Gdx.files.internal("data/font/myfont.fnt"),
				Gdx.files.internal("data/font/myfont.png"), false);
		labelStyle = new LabelStyle(bitmapFont, bitmapFont.getColor());
		stage = new Stage(480, 320, true);
		Gdx.input.setInputProcessor(stage);
		Label label = new Label("骰子", labelStyle);
		label.setPosition(50, 150);
		label.setFontScale(2);
		label.setColor(Color.GREEN);
		stage.addActor(label);
		// Imageview
		tex = new Texture(Gdx.files.internal("data/image/bg.png"));
		region = new TextureRegion(tex, 0, 0, 480, 320);
		VictoriaImage = new Image(region);
		// VictoriaImage.setColor(Color.PINK);
		// VictoriaImage.setScale(0.5F);
//		VictoriaImage.setPosition(00, 40);
//		VictoriaImage.setOrigin(0, 0);// 设置旋转中心
//		VictoriaImage.setRotation(45);
		// VictoriaImage.setSize(390, 300);
		stage.addActor(VictoriaImage);

		// ImageButton
		one = new TextureRegion(new Texture(
				Gdx.files.internal("data/image/one.png")), 0, 0, 48, 48);
		two = new TextureRegion(new Texture(
				Gdx.files.internal("data/image/two.png")), 0, 0, 48, 48);

		up = new TextureRegionDrawable(one);
		down = new TextureRegionDrawable(two);

		button = new ImageButton(up, down);
		button.setPosition(100, 100);
		
		stage.addActor(button);
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
		stage.act();
		stage.draw();
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		bitmapFont.dispose();
		stage.dispose();

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
