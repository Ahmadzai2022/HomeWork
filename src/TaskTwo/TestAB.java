package TaskTwo;

public class TestAB {
    public static void main(String[] args) {
        ClassA classA = new ClassA(80, 87.50, 90);
        double percentageA = classA.getPercentage();
        System.out.println("Percentage of student A is " + percentageA);
        System.out.println(" *********************** ");
        ClassB classB=new ClassB(98,79,92,100);
        double percentageB=classB.getPercentage();
        System.out.println("Percentage of student B is " + percentageB);
    }
}
