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
            WINDOW_WIDTH = 1100,
            WINDOW_HEIGHT = 1000;
    private final Image image;
    private int xMouse;
    private int yMouse;
    private Player user;
    private Ball tennis;
    private Image background;
    public GameView(Image image)
    {
        user = new Player("Steve");
        tennis = new Ball();
        background = new ImageIcon("Resources/PacManBackground.jpg").getImage();
        this.image = image;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Wii Tennis");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);
        this.addMouseMotionListener(this);
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.white);
        g.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
        g.drawImage(background, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, this);
        user.draw(g);
        tennis.move();
        tennis.isContact();
        tennis.bounce();
        tennis.draw(g);
    }

    @Override
    public void mouseDragged(MouseEvent e)
    {

    }

    public void mouseMoved(MouseEvent e)
    {
        // find out where the mouse is
        int xMouse = e.getX();
        int yMouse = e.getY();

        // update the location of the player so that it follows the mouse
//        if (tennis.over){
//            user.setX(xMouse);
//            user.setY(yMouse);
//        }


        // update the screen
        repaint();
//        tennis.isContact();
    }



    public Image getImage()
    {
        return image;
    }


    @Override
    public void mouseClicked(MouseEvent e)
    {
        tennis.isContact();
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