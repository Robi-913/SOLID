package solid.l.good;

import java.awt.*;

public class GoodGraphicsService {
    public void checkForArea(Shape rectangle) {

        if (rectangle instanceof GoodSquare square) {
            verify(square, square.getSide(), "Square");
        } else if (rectangle instanceof GoodRectangle rectange) {
            verify(rectange, rectange.getWidth(), rectange.getHeight(), "Rectangle");
        } else {
            System.out.println("Error");
        }

    }


    private void verify(GoodRectangle rectangle, int width, int height, String entity) {
        if (rectangle.getArea() == (width * height)) {
            System.out.println("Great " + entity + " you got there!");
        } else {
            System.out.println("Well, not a " + entity + ".");
        }
    }

    private void verify(GoodSquare rectangle, int side, String entity) {
        if (rectangle.getArea() == (side * side)) {
            System.out.println("Great " + entity + " you got there!");
        } else {
            System.out.println("Well, not a " + entity + ".");
        }
    }

}
