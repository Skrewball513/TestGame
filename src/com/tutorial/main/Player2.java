package com.tutorial.main;

import java.awt.*;

public class Player2 extends GameObject {

    public Player2(int x, int y, ID id) {
        super(x, y, id);

        velX = 0;

    }

    public void tick() {
        x += velX;
        y += velY;

    }

    public void render(Graphics g) {
        g.setColor(Color.green);
        g.fillOval(x, y, 64, 64);

    }

    @Override
    public Rectangle getBounds() {
        return null;
    }
}

