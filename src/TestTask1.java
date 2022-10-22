public class TestTask1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        double circleArea = circle.calculateArea(20);
        System.out.println(circleArea);

        double circlePerimeter = circle.calculatePerimeter(20);
        System.out.println(circlePerimeter);

        Square square=new Square();
        double squareArea= square.calculateArea(10);
        System.out.println(squareArea);
    }
}