import javax.swing.*;

public class MiVentana extends JFrame {
    public MiVentana() {
        setTitle("MiPrimeraVentana");
        setSize(800, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        ImageIcon icono = new ImageIcon("resources/icon.png");
        setIconImage(icono.getImage());
        setVisible(true);
    }

    public static void main(String[] args) {
        new MiVentana();
    }

}
