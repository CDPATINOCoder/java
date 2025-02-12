import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerWithActionListenerExample {
    private int counter = 0;

    public TimerWithActionListenerExample() {
        // Crear un Timer que se ejecute cada 2 segundos (2000 ms)
        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Esto se ejecuta cada vez que el Timer "hace un tick" (cada 2 segundos)
                counter++;
                System.out.println("Contador: " + counter);
            }
        });

        // Iniciar el Timer
        timer.start();
    }

    public static void main(String[] args) {
        new TimerWithActionListenerExample(); // Crear el objeto y empezar el Timer
    }
}
