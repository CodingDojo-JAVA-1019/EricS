import java.lang.Math;

public class PyTheo {
    public double calculateHypotenuse(int legA, int legB) {
        double a = legA;
        double b = legB;
        double calculateHypotenuse = (a*a)+(b*b);
        calculateHypotenuse = Math.sqrt(calculateHypotenuse); 
        System.out.println(calculateHypotenuse);
        return calculateHypotenuse;
    }
}