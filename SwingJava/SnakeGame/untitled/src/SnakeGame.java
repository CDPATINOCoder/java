import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SnakeGame extends JPanel implements ActionListener {

    private int x = 0;
    private int speed = 5; // Controla la dirección y velocidad
    private Timer timer;

    public SnakeGame() {
        this.setPreferredSize(new Dimension(800, 600));
        this.setBackground(Color.BLACK);
        timer = new Timer(10, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Cambia de dirección si alcanza los límites
        if (x > 750 || x < 0) {
            speed = -speed; // Invierte la dirección
        }

        x += speed; // Mueve el objeto en la dirección actual
        System.out.println("Timer activado: Nueva posición de x = " + x);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println("Redibujando en x = " + x);
        g.setColor(Color.GREEN);
        g.fillOval(x, 300, 50, 50);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new SnakeGame());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}