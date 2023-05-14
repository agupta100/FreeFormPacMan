import javax.swing.*;
import java.awt.*;

/**
 * @author Aarav Gupta
 * Class is used to run the game.
 */
public class Game
{
    // Instance Variables
    private final GameView window;
    private final Image image;

    // Constructor
    public Game()
    {
        image = new ImageIcon("Resources/PacManBackground.jpg").getImage();
        window = new GameView(image);
    }

    public static void main(String[] args)
    {
        Game game = new Game();
    }
}
