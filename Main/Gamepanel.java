
import java.awt.Graphics;
import javax.swing.JPanel;

public class Gamepanel extends JPanel {
    int Fps=150;
    long TargetTimeInMIlli=1000/Fps;
    long waitTime;

    int x=0;
    int y=0;
    // int speed=1;
    // int direction=1;
    int Xdirection,Ydirection;
    int Xspeed,Yspeed;
   


    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillRect(x ,y, 50,50);
    }


    public void GameLoop() throws InterruptedException{
        while (true) { 
            long startTime=System.nanoTime();
            //all your code here
             x++;
             y++;
            // Xdirection=Xdirection+Xspeed;
            // Ydirection=Ydirection+Yspeed;

                     
            if(Xdirection<450){
                Xdirection=0;
                Xspeed ++;
            }
            else if(Xdirection>450){
                Xdirection=0;
                Xspeed--;
            }

            if(Ydirection<450){
                Ydirection=0;
                Yspeed++;
            }
            else if(Ydirection>450){
                Xdirection=450;
                Yspeed--;
            }


            //x=x+speed*direction;
            repaint();
            
            long endTime=System.nanoTime();
            long diff=endTime-startTime;
            waitTime=TargetTimeInMIlli-diff/1000000;
            Thread.sleep(waitTime);

        }}

    }

  
