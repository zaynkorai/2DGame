package com.korai.game.states;

import java.awt.Graphics;

import com.korai.game.Handler;
import com.korai.game.gfx.Assets;
import com.korai.game.ui.ClickListener;
import com.korai.game.ui.UIImageButton;
import com.korai.game.ui.UIManager;

public class MenuState extends State {

	private UIManager uiManager;

	public MenuState(Handler handler) {
		super(handler);
		uiManager = new UIManager(handler);
		handler.getMouseManager().setUIManager(uiManager);

		uiManager.addObject(new UIImageButton(200, 200, 128, 64, Assets.btn_start, new ClickListener() {
			@Override
			public void onClick() {
				handler.getMouseManager().setUIManager(null);
				State.setState(handler.getGame().gameState);
			}
		}));
	}

	@Override
	public void tick() {
		uiManager.tick();
		
		// Temporarily just go directly to the GameState, skip the menu state!
		handler.getMouseManager().setUIManager(null);
		State.setState(handler.getGame().gameState);
	}

	@Override
	public void render(Graphics g) {
		uiManager.render(g);
	}

}
