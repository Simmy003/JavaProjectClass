import java.awt.*;
import java.io.File;
import java.util.Random;
import javax.imageio.*;
import javax.swing.*;

public class Enemy extends JPanel {
    Random rand=new Random();
    int x=rand.nextInt(600);
    int y=rand.nextInt(400);
    Image image;
    Enemy(){
    try {
        image=ImageIO.read(new File("./Asteroid.png"));
    } catch (Exception e) {
        // TODO: handle exception
    }   }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(image, x, y, 50, 40, this);
    }
    public void update(){
        y+=1;
    }
}

