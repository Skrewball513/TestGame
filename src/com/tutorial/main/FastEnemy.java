package com.tutorial.main;

import java.awt.*;


public class FastEnemy extends GameObject{

    private Handler handler;

    public FastEnemy(int x, int y, ID id, Handler handler) {
        super(x, y, id);

        this.handler = handler;

        velX = 2;
        velY = 8;


    }

    public Rectangle getBounds(){
        return new Rectangle(x, y, 16, 16);
    }

    public void tick() {
        x += velX;
        y += velY;

        if(y <= 0 || y >= Game.HEIGHT - 32) velY *= -1;
        if(x <= 0 || x >= Game.WIDTH - 32) velX *= -1;

        handler.addObject(new Trail(x, y, ID.Trail, Color.red, 16, 16, 0.03f, handler));
    }

//write a comment!

    public void render(Graphics g) {

        //Graphics2D g2d = (Graphics2D) g;

        g.setColor(Color.cyan);
        g.fillRect(x, y, 16, 16);

    }
}
