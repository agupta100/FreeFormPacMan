import javax.swing.*;
import java.awt.*;

public class Game
{
    private static final int    FIRST_CORNER_X = 30,
            FIRST_CORNER_Y = 50,
            DIAMETER = 30,
            SMALLEST_RADIUS = 10,
            CHANGE_IN_RADIUS = 30;
    private GameView window;
    private Image image;
    private Ball tennis;
    private Player user;

    public Game()
    {
        tennis = new Ball();
        image = new ImageIcon("Resources/MattWiiTennis.png").getImage();
        window = new GameView(image);
    }

    public void run()
    {
//        while (true)
        {
            tennis.move();
//            if (tennis.isContact())
//            {
//                user.setScore(user.getScore() + 1);
//            }
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.run();
    }
}
