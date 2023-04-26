/**
 * @author Aarav Gupta
 * Class is the front end that will display the front end that gets
 * the information from the back end i.e., the other three classes
 */

import javax.swing.*;
import java.awt.*;

public class GameView extends JFrame
{
    private static final int
            WINDOW_WIDTH = 800,
            WINDOW_HEIGHT = 600;
    public GameView()
    {
        // C - Create and display the window.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Wii Tennis");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);
    }

    public void paint(Graphics g)
    {

    }

    public static void main(String[] args)
    {
        GameView window = new GameView();
    }
}