package ar.edu.unq.po2.tp3.rectangle;

import ar.edu.unq.po2.tp3.point.Point;

public class Rectangle {

    private Point topLeft;
    private Point bottomRight;

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public int getWidth() {
        return bottomRight.getX() - topLeft.getX();
    }

    public int getHeight() {
        return bottomRight.getY() - topLeft.getY();
    }

    public int getArea() {
        return getWidth() * getHeight();
    }

    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    public boolean isHorizontal() {
        return getWidth() > getHeight();
    }

    public boolean isVertical() {
        return getHeight() > getWidth();
    }

    public Point getTopLeft()     { return topLeft; }
    public Point getBottomRight() { return bottomRight; }
}