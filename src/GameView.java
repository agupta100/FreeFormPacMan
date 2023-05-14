import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * @author Aarav Gupta
 * Class is the front end that will display the front end that gets
 * the information from the back end i.e., the other three classes
 */

public class GameView extends JFrame
        implements MouseListener, MouseMotionListener
{
    // Instance Variables
    private static final int
            WINDOW_WIDTH = 1100,
            WINDOW_HEIGHT = 1000;
    private final Packman pack;
    private final Ghost ghost;
    private final Image background;

    // Constructor
    public GameView(Image image)
    {
        pack = new Packman();
        ghost = new Ghost();
        background = new ImageIcon("Resources/PacManBackground.jpg").getImage();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("PacMan!");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);
        this.addMouseMotionListener(this);
    }

    // Methods
    public void paint(Graphics g)
    {
        g.setColor(Color.white);
        g.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
        g.drawImage(background, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, this);
        pack.draw(g);
        ghost.draw(g);
        ghost.move();
    }

    @Override
    public void mouseDragged(MouseEvent e)
    {

    }

    public void mouseMoved(MouseEvent e)
    {
        // Find out where the mouse is
        int xMouse = e.getX();
        int yMouse = e.getY();

        // Update the location of the player so that it follows the mouse
        pack.setX(xMouse);
        pack.setY(yMouse);

        // Update the screen
        repaint();

    }

    @Override
    public void mouseClicked(MouseEvent e)
    {

    }

    @Override
    public void mousePressed(MouseEvent e)
    {

    }

    @Override
    public void mouseReleased(MouseEvent e)
    {

    }

    @Override
    public void mouseEntered(MouseEvent e)
    {

    }

    @Override
    public void mouseExited(MouseEvent e)
    {

    }

}