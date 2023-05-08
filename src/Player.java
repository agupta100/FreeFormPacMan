import javax.swing.*;
import java.awt.*;

/**
 * @author Aarav Gupta
 * Class is used to ensure the user can use mouse/keyboard input to
 * move the player and hit the ball
 */
public class Player
{
    // Instance Variables
    private String name;
    private int x;
    private int y;
    private int dx;
    private int dy;
    private Image WiiImage;

    public Player(String name)
    {
        this.name = name;
        WiiImage = new ImageIcon("Resources/MattWiiTennis.png").getImage();
    }

    // Methods
    public int generateAim()
    {
        return 10;
    }

    public int generatePower()
    {
        return 10;
    }
    public boolean isContact()
    {
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getDy() {
        return dy;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }
    public void draw(Graphics g)
    {
        g.drawImage(WiiImage, x, y, 200, 100, null);
    }


}
