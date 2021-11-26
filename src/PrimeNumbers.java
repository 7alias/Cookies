import java.util.Scanner;

public class PrimeNumbers {

    public static void method() {

        //рост / 100
        //вес
        //формула: вес/рост м2
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter height:");
        double height = scan.nextDouble();
        System.out.println("Enter weight:");
        double weight = scan.nextDouble();

        double imt = weight / (height * height / 100);
        System.out.println("IMT = " + imt);
        if (imt > 0.3) {
            System.out.println("You are too fat");
        } else if (imt < 0.2) {
            System.out.println("Very low weight");

        } else {
            System.out.println("You are in perfect shape");
        }
    }
}