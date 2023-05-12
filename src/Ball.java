import javax.swing.*;
import java.awt.*;

/**
 * @author Aarav Gupta
 * Class is used to design the ball physics and whether the
 * ball comes in contact with a player or the net
 */

/** Might want to change program entirely - once the player touches a tennis ball, the next level appears and the player
 * will have to catch two balls. Once they touch the tennis ball it goes onto round three. After round three,
 * the game terminates and the time it took for the player to catch the ball in each round is displayed on the next
 * screen with a 'you win" or the total time is kept track on the same screen.
 */
public class Ball
{
    // Instance Variables
    public boolean over = false;
    private int x;
    private int y;
    private int dx;
    private int dy;
    private Image TennisImage;
    private Player p;
    private int score;
    private int TopRightCorner;
    private int BottomRightCorner;
    private int BottomLeftCorner;

    public Ball()
    {
        p = new Player("Steve");
        TennisImage = new ImageIcon("Resources/Ghost.png").getImage();
        x = 400;
        y = 300;
        dx = 5;
        dy = 5;
        score = 0;

    }

    // Methods
    public void move()
    {
        // update the x-coordinate by adding the horizontal movement
        x += dx;
        y += dy;
        TopRightCorner = x + 100;
        BottomLeftCorner = y + 100;
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

    public void bounce()
    {
        if (x == p.getX())
        {
            dx = -dx;
        }
    }

    public void isContact()
    {
        if ((Math.abs(p.getX() - this.getX()) <= 45) || (Math.abs(p.getY() - this.getY()) <= 45))
        {
                this.setX(-100);
                this.setY(-100);
                over = true;
        }
    }

    public void resetPosition()
    {
        x = 400;
        y = 300;
        dx = 5;
        dy = 5;
    }

    public int getScore()
    {
        return score;
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
        g.drawImage(TennisImage, x, y, 100, 100, null);
        g.drawString("Score: " + score, 50, 50);
    }
}

