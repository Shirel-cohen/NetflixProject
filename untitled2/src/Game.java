import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {
    private Player player;

    public static void main (String [] args) {
        Game g1 = new Game ();
    }
     public Game (){
        this.init();
        this.player = new Player();
        //this.showComponents();
     }

     public void showComponents(){
         JLabel label = new JLabel();
         label.setText("Game");
         label.setBounds(300, 100, 300, 50);
         this.add(label);

         JButton button = new JButton("Button");
         button.setBounds(300, 200, 100, 25);
         button.addActionListener((event) -> {
             label.setText("Button was click");
             button.setVisible(false);
         });
         this.add(button);

     }

    public void init () {
        this.setVisible(true);
        this.setSize(Definition.WIDTH, Definition.HEIGHT);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Game");
        this.setResizable(false);
    }

    public void paint (Graphics g){
        super.paint (g);
  //      g.setColor(Color.CYAN);
//        g.fillRect (300, 100, 100, 100);
//        g.setColor(Color.RED);
//        g.fillRect (400, 200, 100, 250);
        this.player.paint(g);
    }

}
