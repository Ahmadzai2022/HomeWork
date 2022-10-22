public class Square implements Shape {
    @Override
    public double calculateArea(double area) {
        return area * area;
    }

    @Override
    public double calculatePerimeter(double area) {
        return 4 * area;
    }

}
