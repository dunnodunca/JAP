import javax.swing.*;

import game.Game;

/**
 * The main entry point for the game.
 * @author Gia Bao Tran - Kiet Tran
 */
public class Main {
    /**
     * Main method to start the game.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::runGame);
    }

    /**
     * Runs the game.
     */
    @SuppressWarnings("unused")
	public static void runGame() {
        Game game = new Game();
    }
}
