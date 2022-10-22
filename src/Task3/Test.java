package Task3;

public class Test {
    public static void main(String[] args) {
        Truck truck = new Truck(2300, 50000, "red");
        double truckPrice = truck.calculateSalePrice();
        System.out.println("Truck price is " + truckPrice);
        System.out.println(" ****************************** ");
        Sedan sedan = new Sedan(25, 20000, "silver");
        double sedanPrice = sedan.calculateSalePrice();

        System.out.println("Sedan price is " + sedanPrice);
    }
}
