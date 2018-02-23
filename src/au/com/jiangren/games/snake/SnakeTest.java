package au.com.jiangren.games.snake;


import org.junit.Test;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

public class SnakeTest {

    Snake snake = new Snake(Direction.RIGHT.point2D);

    @Test

    public void testIsDead() {

        System.out.println(snake.isDead());
    }


    @Test
    public void testLastIndexOf() {

    }

}
