/**
 * @author Aarav Gupta
 * Class is the front end that will display the front end that gets
 * the information from the back end i.e., the other three classes
 */

import javax.swing.*;

public class GameView extends JFrame
{
    public GameView()
    {
        // C - Create and display the window.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Wii Tennis");
        this.setSize(1000, 800);
        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        GameView window = new GameView();
    }
}