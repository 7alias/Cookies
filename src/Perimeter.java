import static java.lang.Math.sqrt;

public class Perimeter {
public static void PrintPerimeter() {
    double a = 2;
    double b = 2;
    double r = 6;

    System.out.println("Triangle S = " + AreaCalc.Triangle(a, b));

    System.out.println("Perimetr triangle = " + Perimeter.PerimeterTriangle(a, b));
    System.out.println("Perimetr circle = " + Perimeter.PerimetrCircle(r));
    System.out.println("Perimetr square = " + Perimeter.PerimeterSquare(a));
}

    public static double PerimeterSquare(double a) {
        return a * 4;
    }

    public static double PerimetrCircle(double r) {
        return 2 * r * Math.PI;
    }

    public static double PerimeterTriangle(double a, double b) {
        return a * 2 + b;
    }
}
