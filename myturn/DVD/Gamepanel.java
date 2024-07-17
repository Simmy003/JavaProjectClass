
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

//Challenge : Understand this code
//Challenge : Explain this code to a 5 year old

public class Gamepanel extends JPanel {
    int Fps=60;
    long TargetTimeInMIlli=1000/Fps;
    long waitTime;

    Random rand = new Random();

    int x=rand.nextInt(400);
    int y=rand.nextInt(400);
    
   int Xdirection = 1;
   int Xspeed = 1;

   int Ydirection =1;
   int Yspeed = 1;

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillRect(x ,y, 50,50);
    }


public void GameLoop() throws InterruptedException{
        while (true) { 
            // x++;
            // if(x>=430){
            //     x=430;
            // }

            if(x==0){
                Xdirection=1;
                Xspeed=2;
                setBackground(Color.green);
            }

            else if(x==450){
                Xdirection=-1;
                Xspeed=2;
                setBackground(Color.yellow);

            }

            if(y==0){
                Ydirection=1;
                Yspeed=2;
                setBackground(Color.red);

            }
            else if(y>=420){
                Ydirection=-1;
                Yspeed=2;
                setBackground(Color.blue);


            }

            x=x+Xdirection*Xspeed;  
            y = y+Ydirection * Yspeed;          
            repaint();

            long startTime=System.nanoTime();
            System.out.println("startTime: "+startTime);
            //all your code here
            
           long endTime=System.nanoTime();
           System.out.println("endTime: "+endTime);

            long diff=endTime-startTime;
            System.out.println("diff: "+diff);

            waitTime=TargetTimeInMIlli-diff/1000000;
            System.out.println("waitTime: "+waitTime);

            Thread.sleep(waitTime); //positive

        }}

    }

  
