package TaskTwo;
public class ClassA extends Marks{
     double sub1;
     double sub2;
     double sub3;

    public ClassA(double sub1, double sub2, double sub3) {
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;

    }

    double getPercentage() {
        double totalScore = (sub1+sub2+sub3);
        return totalScore / 3;
    }
}

