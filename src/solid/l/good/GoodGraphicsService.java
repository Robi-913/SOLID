package solid.l.good;

import java.awt.*;

public class GoodGraphicsService {
    public void checkForArea(Shape rectangle) {

        if (rectangle instanceof GoodSquare square) {
            System.out.println("Ii is a square: " + square.getArea());
        } else if (rectangle instanceof GoodRectangle rectange) {

            System.out.println("It is a Rectangle: " + rectange.getArea());
        } else {
            System.out.println("Error");
        }

    }
}
