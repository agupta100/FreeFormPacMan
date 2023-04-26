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
    private Image image;
    public GameView(Image image)
    {
        this.image = image;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Wii Tennis");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);
    }

    public void paint(Graphics g)
    {

    }

    public Image getImage()
    {
        return image;
    }


}