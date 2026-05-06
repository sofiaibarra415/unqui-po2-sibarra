package ar.edu.unq.po2.tp3.rectangle;

import ar.edu.unq.po2.tp3.point.Point;

public class Square extends Rectangle {

    public Square(Point topLeft, int side) {
        super(topLeft, new Point(topLeft.getX() + side, topLeft.getY() + side));
    }
}