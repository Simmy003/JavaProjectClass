import javax.swing.*;

class box{
    public static void main(String[] args) {
        JFrame f=new JFrame("FPS Control Loop");
        f.setResizable(false);
        //f.setLocationRelativeTo(null);
        Gamepanel p=new Gamepanel();
        f.add(p);
        p.startGame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1000,1000);
        f.setVisible(true);

        
    }
}