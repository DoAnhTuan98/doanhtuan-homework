package program.player;

import program.GameOject;
import program.Vector2D;
import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class PlayerBullet extends GameOject {
//    BufferedImage image;
//    Vector2D position;
//    Vector2D velocity;

    public PlayerBullet() {
        image = SpriteUtils.loadImage("assets/images/player-bullets/a/1.png");
        position = new Vector2D(); // (0,0)
        velocity = new Vector2D(0,-5);
    }

    public void render(Graphics g){
//        g.drawImage(image, (int)position.x,(int)position.y, null);
        super.render(g);
    }

    public void run(){
//        position.add(velocity.x,velocity.y);
        super.run();
    }
}
