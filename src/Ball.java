import javax.swing.*;
import java.awt.*;

/**
 * @author Aarav Gupta
 * Class is used to design the ball physics and whether the
 * ball comes in contact with a player or the net
 */
public class Ball
{
    // Instance Variables
    private int x;
    private int y;
    private int dx;
    private int dy;
    private Image TennisImage;

    public Ball()
    {

        TennisImage = new ImageIcon("Resources/WiiTennisBall.jpg").getImage();
        x = 0;
        y = 300;
        dx = 5;
        dy = 5;
    }

    public void move()
    {
        x += dx; // update the x-coordinate by adding the horizontal movement
        if (x < 0 || x > 600)
        { // if the ball goes out of bounds, reverse the direction
            dx = -dx;
        }
    }


    // Methods
    public boolean isContact()
    {
        return false;
    }


    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public int getDx()
    {
        return dx;
    }

    public int getDy()
    {
        return dy;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public void setDx(int dx)
    {
        this.dx = dx;
    }

    public void setDy(int dy)
    {
        this.dy = dy;
    }
    public void draw(Graphics g)
    {
        g.drawImage(TennisImage, x, y, 200, 100, null);
    }

}
