import javax.swing.*;
public class Example{
    public static void main(String args[]) {
        JFrame a = new JFrame("example");
        JTextField b = new JTextField("Welcome to Java");
        b.setBounds(50,100,200,30);
        a.add(b);
        a.setSize(300,300);
        a.setLayout(null);
        a.setVisible(true);
    }
}
