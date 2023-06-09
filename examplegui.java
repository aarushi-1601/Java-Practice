import java.awt.*;
public class examplegui extends Frame {

    examplegui() {
        Button b= new Button("CLICK ME");
        Button c= new Button("SUBMIT");

        // b.setBounds(30,100,80,30);
        
        setSize(300,300);
        setTitle("This is gui button first example");
        setLayout(new FlowLayout());
        setVisible(true);
        
        add(b);
        // c.setBounds(100,100,80,30);
        
        add(c);
        // setSize(300,300);
        // setLayout(new FlowLayout());
        // setVisible(true);
    }
    public static void main(String args[]){

        examplegui f = new examplegui();
    }
}