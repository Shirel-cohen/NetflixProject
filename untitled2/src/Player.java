import java.awt.*;

public class Player {

    private Head head;
    private Body body;

    public Player(){
        this.head=new Head(100, 100, 100,100);
        this.body=new Body();
    }

    public void paint (Graphics graphics){
        this.head.paint(graphics);
        this.body.paint(graphics);

    }
}
