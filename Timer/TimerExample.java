import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerExample {
    private int contador = 1;
    private Timer timer;

    public TimerExample() {
        // Creamos un JFrame invisible para que el programa siga corriendo
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200); // No importa el tamaño, no se mostrará
        frame.setVisible(false); // Lo hacemos invisible

        // Creamos el Timer (1000 ms = 1 segundo)
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(contador++);
            }
        });

        timer.start();
    }

    public static void main(String[] args) {
        new TimerExample(); // Crear instancia para que el Timer empiece
    }
}
