package game;
import java.awt.*;
import javax.swing.JFrame;

import components.Board;

/**
 * Represents the main game window for the Bang Bang Simulation.
 *  @author Gia Bao Tran - Kiet Tran
 */
public class Game extends JFrame {
    Board player_1;
    Board player_2;

    /**
     * Constructs a new Game instance.
     */
    public Game() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Bang Bang Simulation / Gia Bao Tran-Kiet Tran");        
        getContentPane().setBackground(new Color(32, 33, 36));
        setLocationRelativeTo(null);
        setSize(1300, 800);
        setVisible(true);
        setResizable(false);
        setLayout(new BorderLayout());
        add(new StartMenu(this), BorderLayout.CENTER);
        setVisible(true);
    }
}
