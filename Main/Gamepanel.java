
import java.awt.Graphics;
import javax.swing.JPanel;

public class Gamepanel extends JPanel {
    int Fps=60;
    long TargetTimeInMIlli=1000/Fps;
    long waitTime;

    int x=0;
    int y=0;
    int speed=1;
    int direction=-1;


    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillRect(x ,y, 50,50);
    }


    public void GameLoop() throws InterruptedException{
        while (true) { 
            long startTime=System.nanoTime();
            //all your code here
            if(x<500){
            x++;            
            repaint();
            }
            long endTime=System.nanoTime();
            long diff=endTime-startTime;
            waitTime=TargetTimeInMIlli-diff/1000000;
            Thread.sleep(waitTime);

        }

    }




}
  
