
import javax.swing.*;

public class Mainly {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame=new JFrame("DVD");
        Gamepanel gp=new Gamepanel();
        frame.add(gp);

        // frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(500, 500);
        frame.setVisible(true);
        gp.GameLoop();
        
    }
    
}
