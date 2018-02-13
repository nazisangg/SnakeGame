package au.com.jiangren.games.snake;

import javafx.geometry.Point2D;


public enum Direction {
    RIGHT(new Point2D(1, 0)),

    LEFT(new Point2D(-1, 0)),

    UP(new Point2D(0, -1)),

    DOWN(new Point2D(0, 1));

    final Point2D point2D;

    Direction(Point2D point2D) {
        this.point2D = point2D;
    }
}