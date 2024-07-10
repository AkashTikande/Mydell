import javax.swing.*;

public class Graphics extends JPanel {
    public void paint(java.awt.Graphics g) {
        super.paint(g);
        int x = 50, y = 50, width = 100, height = 100;
        for (int i = 0; i < 5; i++) {
            g.drawRect(x, y, width, height);
            g.drawString("Row " + i, x + 10, y + 20);
            g.drawString("Data " + i + ", 1", x + 10, y + 40);
            g.drawString("Data " + i + ", 2", x + 10, y + 60);
            g.drawString("Data " + i + ", 3", x + 10, y + 80);
            x += width;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.getContentPane().add(new Graphics());
        frame.setSize(600, 400);
        frame.setVisible(true);
    }

    public void drawString(String hello, int i, int i1) {
    }

    public void drawOval(int i, int i1, int i2, int i3) {
    }

    public void fillRect(int i, int i1, int i2, int i3) {
    }
}



















