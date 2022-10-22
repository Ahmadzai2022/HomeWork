package TaskTwo;

public class ClassB extends Marks{
    double sub1;
    double sub2;
    double sub3;
    double sub4;
 ClassB(double sub1, double sub2, double sub3, double sub4){
     this.sub1=sub1;
     this.sub2=sub2;
     this.sub3=sub3;
     this.sub4=sub4;
 }

    double getPercentage() {
        double totalScore = (sub1+sub2+sub3+sub4);
        return totalScore / 4;
    }
}



