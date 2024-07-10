/* import javax.swing.*;
import java.awt.*;
public class Programmer extends JPanel
{
    public void paint(Graphics g) // .cltr +j = code sujection  sdsadjddjdd
    {
        System.out.print("Lets Create, Be the Creater");
        // draw the head of programmer
        g.setColor(Color.RED);
        g.fillOval(50,50,100,100);  //Alt +Insert =(code generation)

        //draw body
        g.setColor(Color.ORANGE);  // cltr +q = (quick code documentation)
        g.fillRect(75,150,50,100);

        //Draw the arms

        g.setColor(Color.BLACK);
        g.drawLine(75,175,50,200);
        g.drawLine(125, 175, 150, 200);  // Cltr + D = duplicate the current block code when no line of code is selected

        // draw the legs
        g.setColor(Color.BLACK);             //Cltr Shift + up / down arrow = move the statement up or down
        g.drawLine(100,250,125,300);  // cltr + o = method override
        g.drawLine(100,350,125,350);  // cltr +i = implement methods
    }

    public static void main(String[] args)  // Cltr +SHIFT + ENTER = COMPLETE  THE STATEMENT INTO SYNTACTICALLY CORRECT FORM FOR DO-WHILE
    // TRY-CATCH , RETURN METHODS
    {
        JFrame frame = new JFrame("Programmer");  // cltr + E = view recent files /classes created recently.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Programmer());
        frame.setSize(200,400);
        frame.setVisible(true); //

    }
}
//... ... .. ... ... ... .... .... .... ... ... // .............. ........... ....................  ............//
// wasd //*/