import javax.swing.JFrame;

public class GameFrame extends JFrame {
    public GameFrame() {
        // Configurar propiedades del JFrame
        this.setTitle("Snake Profesional");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        // Crear y agregar el panel del juego
        GamePanel gamePanel = new GamePanel();
        this.add(gamePanel);

        // Empaquetar y hacer visible
        this.pack(); // Ajusta el tamaño al contenido (GamePanel)
        this.setLocationRelativeTo(null); // Centrar
        this.setVisible(true);
    }
}
