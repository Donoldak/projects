package nasledovanie;

public class Square {
    double height;
    double width;

    static Square getSquare(double a){
        Square square = new Square();
        square.width = a;
        square.height = a;
        return square;
    }

    static double getArea(Square square){
        return square.height * square.width;
    }

}
