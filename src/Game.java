import java.util.ArrayList;

public class Game
{
    private static final int    FIRST_CORNER_X = 30,
            FIRST_CORNER_Y = 50,
            DIAMETER = 30,
            SMALLEST_RADIUS = 10,
            CHANGE_IN_RADIUS = 30;
    private GameView window;


    public Game()
    {
        window = new GameView();
    }
}