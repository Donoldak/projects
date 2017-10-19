package nasledovanie;

public class Main {
    public static void main(String[] args) {
        Rectangle[] rectangles = {
                Rectangle.getRectangle(5,7),//35
                Rectangle.getRectangle(2,5),//10
        };
        Square[] squares = {
                Square.getSquare(5), //25
                Square.getSquare(10), //100
        };
        double result = sumOfAreas(rectangles, squares);
        System.out.println(result);
        System.out.println(minOfAreas(rectangles, squares));
        System.out.println(maxOfAreas(rectangles, squares));
    }

    static double sumOfAreas(Rectangle[] rectangles, Square[] squares){
        double sum = 0;
        for (int i = 0; i < rectangles.length; i++) {
            sum += Rectangle.getArea(rectangles[i]);
        }
        for (int i = 0; i < squares.length; i++) {
            sum += Square.getArea(squares[i]);
        }
        return sum;
    }

    static double minOfAreas(Rectangle[] rectangles, Square[] squares){
        double min = Rectangle.getArea(rectangles[0]);
        for (int i = 0; i < rectangles.length; i++) {
            double area =  Rectangle.getArea(rectangles[i]);
            if( area < min){
                min = area;
            }
        }
        for (int i = 0; i < squares.length; i++) {
            double area = Square.getArea(squares[i]);
            if(area < min){
                min = area;
            }
        }
        return min;
    }

    static double maxOfAreas(Rectangle[] rectangles, Square[] squares){
        double max = Rectangle.getArea(rectangles[0]);
        for (int i = 0; i < rectangles.length; i++) {
            double area =  Rectangle.getArea(rectangles[i]);
            if( area > max){
                max = area;
            }
        }
        for (int i = 0; i < squares.length; i++) {
            double area = Square.getArea(squares[i]);
            if(area > max){
                max = area;
            }
        }
        return max;
    }

}
