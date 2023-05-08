/**
 * @author Aarav Gupta
 * Class is the front end that will display the front end that gets
 * the information from the back end i.e., the other three classes
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class GameView extends JFrame
        implements MouseListener, MouseMotionListener
{
    private static final int
            WINDOW_WIDTH = 800,
            WINDOW_HEIGHT = 600;
    private final Image image;
    private int xMouse;
    private int yMouse;
    private Player user;
    private Ball tennis;
    public GameView(Image image)
    {
        user = new Player("Steve");
        tennis = new Ball();
        this.image = image;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setTitle("Wii Tennis");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);
        this.addMouseMotionListener(this);
//        window.addMouseListener(window);
//        window.addMouseMotionListener(window);
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.white);
        g.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
        g.drawImage(image, 300, 475, 100, 100, this);
        user.draw(g);
        tennis.draw(g);
    }


    @Override
    public void mouseDragged(MouseEvent e) {

    }

    public void mouseMoved(MouseEvent e)
    {
        // find out where the mouse is
        int xMouse = e.getX();
        int yMouse = e.getY();

        // update the location of the player so that it follows the mouse
        user.setX(xMouse);
        user.setY(yMouse);

        // update the screen
        repaint();
    }



    public Image getImage()
    {
        return image;
    }


    @Override
    public void mouseClicked(MouseEvent e)
    {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}