import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Player extends JPanel {
    int x=0;
    int y=0;
    int speed=1;
    int directionX=0;
    int directionY=0;
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.white);
        g.fillRect(x, y, 100, 100);
        
    }

    public void update(){
        directionX=1;
        speed=1;
    }
    public void move(){
        x=x+directionX*speed;
        y=y+directionY*speed;
    }
    public void stop(){
        speed=0;
    }
    
}
