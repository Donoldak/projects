public class Rectangle {
    double height;
    double width;

    static Rectangle getRectangle(double height, double width){
        Rectangle rectangle = new Rectangle();
        rectangle.width = width;
        rectangle.height = height;
        return rectangle;
    }

    static double getArea(Rectangle rectangle){
        return rectangle.height * rectangle.width;
    }

}
