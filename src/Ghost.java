import javax.swing.*;
import java.awt.*;

/**
 * @author Aarav Gupta
 * Class is used to design a ghost that moves randomly, bouncing off the screen.
 */

public class Ghost
{
    // Instance Variables
    private int x;
    private int y;
    private int dx;
    private int dy;
    private final Image GhostImage;

    // Constructor
    public Ghost()
    {
        GhostImage = new ImageIcon("Resources/Ghost.png").getImage();
        x = 500;
        y = 500;
        dx = 5;
        dy = 5;
    }

    // Methods
    public void move()
    {
        // update the x-coordinate by adding the horizontal movement
        x += dx;
        y += dy;
        // if the ball goes out of bounds, reverse the direction
        if (x < 0 || x > 900)
        {
            dx = -dx;
        }
        if (y < 0 || y > 700)
        {
            dy = -dy;
        }
    }

    public void draw(Graphics g)
    {
        g.drawImage(GhostImage, x, y, 100, 100, null);
    }
}

