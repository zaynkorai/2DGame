package com.korai.game.entities.statics;

import com.korai.game.Handler;
import com.korai.game.entities.Entity;

public abstract class StaticEntity extends Entity {
	
	public StaticEntity(Handler handler, float x, float y, int width, int height){
		super(handler, x, y, width, height);
	}

}
