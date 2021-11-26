import java.util.Scanner;

public class Piercing {

public static void AgeCheck() {
    /*
    Напишите простую программу для салона пирсинга, где при вводе возраста клиента через переменную выводились бы
    соответствующие ограничения:

    младше 14:прокол ушей в присутствии родителей;
    от 14 до 18:прокол ушей, пупка, языка, носа в присутствии родителей;
    от 18 лет:
    без ограничений.

    */
    Scanner scanner = new Scanner(System.in);
    int age = 0;
    System.out.println("What is your age?");
    age = scanner.nextInt();
    if (age < 14) {
        System.out.println("Разрешается прокол ушей в присутствии родителей");
    }
    else if (age >18){
        System.out.println("Все виды пирсинга без ограничений");}
        else
    {
        System.out.println("Разрешается прокол ушей, пупка, языка, носа в присутствии родителей.");
    }
    }
}


