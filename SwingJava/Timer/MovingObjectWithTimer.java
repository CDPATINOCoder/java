import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovingObjectWithTimer {

    private int x = 0; // Posición del objeto
    private Timer gameTimer; // Timer para mover el objeto

    public MovingObjectWithTimer() {
        // Crear un panel para el juego
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.RED);
                g.fillRect(x, 100, 50, 50); // Dibujar el objeto en la nueva posición
            }
        };

        // Configurar el tamaño del panel
        panel.setPreferredSize(new Dimension(400, 200));

        // Crear un Timer que actualice la posición cada 50 ms
        gameTimer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mover el objeto 5 píxeles hacia la derecha
                x += 5;
                panel.repaint(); // Redibujar el panel
            }
        });

        gameTimer.start(); // Iniciar el Timer

        // Configurar el JFrame
        JFrame frame = new JFrame("Objeto en Movimiento");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MovingObjectWithTimer(); // Crear el juego
    }
}
