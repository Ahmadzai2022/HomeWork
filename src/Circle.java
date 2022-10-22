public class Circle implements Shape {

    @Override
    public double calculateArea(double area ) {
        return Math.PI * area * area;
    }

    @Override
    public double calculatePerimeter(double area) {
        return 2 * Math.PI * area;
    }
}
