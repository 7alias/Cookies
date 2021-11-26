import java.math.*;

public class AreaCalc {

    public static double Triangle(double a,double b) {


        double s = b / 2 * Math.sqrt(a * a - b * b / 4);
        return s;
    }


}
