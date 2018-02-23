package au.com.jiangren.games.snake;



import javafx.geometry.Point2D;

import java.util.ArrayList;
import java.util.List;


public class Snake {

    private Direction direction = Direction.RIGHT;
    private Point2D head;
    private Point2D previousTail;

    private List<Point2D> body = new ArrayList<>();

    public Snake(Point2D head) {
        this.head = head;
        this.previousTail = head;
        body.add(head);


        for (int i = 0 ; i < 15; i++) {
            body.add(head.add(Direction.LEFT.point2D));
        }



    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void update() {
        head = head.add(direction.point2D);

        previousTail = body.remove(body.size() - 1);
        body.add(0, head);
    }

    public Point2D getPosition() {
        return head;
    }

    public boolean eatFood(Food food) {
        return head.equals(food.getPosition());
    }

    public void grow() {
        body.add(previousTail);
    }

    public int getLength() {
        return body.size();
    }

    public List<Point2D> getBody() {
        return body;
    }

    public boolean isOutOfBounds(int size) {
        return head.getX() < 0 || head.getY() < 0
                || head.getX() > size || head.getY() > size;
    }

    public boolean isDead() {
        return body.lastIndexOf(head) > 0;
    }
}
