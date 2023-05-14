import javax.swing.*;
import java.awt.*;

/**
 * @author Aarav Gupta
 * Class is used to ensure the packman follows the user's mouse without clicking
 */
public class Packman
{
    // Instance Variables
    private int x;
    private int y;
    private final Image PacImage;

    public Packman()
    {
        // Initial spawn point of packman
        this.x = 400;
        this.y = 300;
        PacImage = new ImageIcon("Resources/PacMan.png").getImage();
    }

    // Methods

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public void draw(Graphics g)
    {
        g.drawImage(PacImage, x, y, 100, 100, null);
    }
}
