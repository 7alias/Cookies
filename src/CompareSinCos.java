import java.util.Scanner;

public class CompareSinCos {

    public static void Compare(){
        System.out.println("Программа сравнения значений y=sin(cos(x)) и y=cos(sin(x)");
        System.out.println("Введите нижнее значение x:");
        Scanner scanner = new Scanner(System.in);
        double x_start = scanner.nextDouble();
        System.out.println("Введите верхнее значение x:");
        double x_end = scanner.nextDouble();
        System.out.println("Введите шаг дискретизации:");
        double step = scanner.nextDouble();
        double i = x_start;
        do {
            if (Math.sin(Math.cos(i)) < Math.cos(Math.sin(i))) {
                System.out.println("При x = " + i + " sin(cos(x)) = " + Math.sin(Math.cos(i)) + "; cos(sin(x)) = " + Math.cos(Math.sin(i)) + ". sin(cos(x)) меньше, чем cos(sin(x))");
            } else if (Math.sin(Math.cos(i)) > Math.cos(Math.sin(i))) {
                System.out.println("При x = " + i + " sin(cos(x)) = " + Math.sin(Math.cos(i)) + "; cos(sin(x)) = " + Math.cos(Math.sin(i)) + ". sin(cos(x)) больше, чем cos(sin(x))");
            } else {
                System.out.println("При x = " + i + " sin(cos(x)) = " + Math.sin(Math.cos(i)) + "; cos(sin(x)) = " + Math.cos(Math.sin(i)) + ". sin(cos(x)) равен cos(sin(x))");
            }
            i += step;
        }
        while (i <= x_end);


    }

}
