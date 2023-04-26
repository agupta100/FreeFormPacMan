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
}
