import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;


public class Gamepanel extends JPanel implements Runnable{
    
    Thread t;
    Enemy enemy=new Enemy();
    Enemy[] enemies=new Enemy[50];
    Player p=new Player();
    
    Gamepanel(){
        super();
        this.setPreferredSize(new Dimension(500,500));
        this.setBackground(Color.black);
        for(int i=0;i<enemies.length;i++){
            enemies[i]=new Enemy();
        }
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e){
                p.update();
            }
            public void keyReleased(KeyEvent e){
                p.stop();
            }
        });
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i=0;i<enemies.length;i++){
            enemies[i].paintComponent(g);
            p.paintComponent(g);
        }
    }

    public void startGame(){
        t=new Thread(this);
        t.start();
    }
    public void update(){
        for(int i=0;i<enemies.length;i++){
            enemies[i].update();
        }
       p.move();
    }
    @Override
    public void run() {
        double drawInterval=1000000000/60;
        double deltaTime=0;
        long lastPassedTime=System.nanoTime();
        long currentTime=0;

        while(t!=null){
            currentTime=System.nanoTime();
            deltaTime+=(currentTime-lastPassedTime)/drawInterval;
            lastPassedTime=currentTime;

            if(deltaTime>=1){
                update();
                repaint();
                deltaTime--;
            }
        }
    }

    
}
