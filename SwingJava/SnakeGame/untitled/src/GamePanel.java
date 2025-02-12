import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {
    // Configuración del juego
    public static final int SCREEN_WIDTH = 800;
    public static final int SCREEN_HEIGHT = 600;
    public static final int UNIT_SIZE = 25;
    public static final int GAME_DELAY = 75;

    // Variables del juego
    private Timer gameTimer;
    private boolean isRunning = true;

    public GamePanel() {
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        startGame();
    }

    private void startGame() {
        gameTimer = new Timer(GAME_DELAY, this);
        gameTimer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(isRunning) {
            updateGame();
            repaint();
        }
    }

    private void updateGame() {
        // Lógica de actualización del juego
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawGame(g);
    }

    private void drawGame(Graphics g) {
        if(isRunning) {
            // Dibujar elementos del juego
            g.setColor(Color.RED);
            g.fillOval(SCREEN_WIDTH/2, SCREEN_HEIGHT/2, UNIT_SIZE, UNIT_SIZE);
        } else {
            // Dibujar pantalla de Game Over
        }
    }
}