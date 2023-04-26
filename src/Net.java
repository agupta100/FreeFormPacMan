/**
 * @author Aarav Gupta
 * Class is used to stop the ball if the ball comes in
 * contact with the net (Not 100% sure if I'm going to use this class)
 */
public class Net
{
    // Instance Variables
    private int length;
    private int width;
    private int x;
    private int y;

    // Methods
    public boolean isContact()
    {
        return false;
    }

    public boolean isGameOver()
    {
        return false;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
