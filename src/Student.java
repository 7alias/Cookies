import java.util.Scanner;


public class Student extends People {
    public static String[] Student(String[] people) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + people.length + " new people names ");

        for (int i = 0; i < people.length; i++) {
            String p = scanner.nextLine();
            people[i] = p;
        }
        return people;
    }
}
