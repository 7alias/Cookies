import java.util.Scanner;

public class Calculator {
    /*
        Калькулятор считывает число.
        После этого считывает операцию, которую необходимо выполнить. Давайте ограничимся простыми операциями: сложение, вычитание, умножение и деление.
        Считывает второй операнд.
        После выполнения операции калькулятор выводит получившееся значение.
    */
    public void calc() {

        Scanner scanner = new Scanner(System.in);
        char end = 'w';
        System.out.println("Enter q to exit or c to continue");
        end = scanner.next().charAt(0);
        while (true) {
            if (end == 'q') {
                System.out.println("Exit");
                break;
            } else {
                System.out.println("Enter Number1");
                int operand1 = scanner.nextInt(); //считывает число
    /*Метод next() класса Scanner считывает строку,
    а метод charAt(0) позволяет взять первый символ в этой строке.
     так мы получаем операцию, которую нужно выполнить*/
                System.out.println("Enter operation + - * /");
                char operation = scanner.next().charAt(0);
                System.out.println("Enter Number2");
                int operand2 = scanner.nextInt(); //считывает число
                double x = 0;
                switch (operation) {

                    case '-':
                        x = operand1 - operand2;
                        break;
                    case '+':
                        x = operand1 + operand2;
                        break;
                    case '*':
                        x = operand1 * operand2;
                        break;
                    case '/':
                        x = operand1 / operand2;
                        break;
                    default:
                        break;


                }
                System.out.println("And the answer is:  " + x);
                System.out.println("Enter operation + - * /");
                operation = scanner.next().charAt(0);

                System.out.println("Enter Number2");
                operand2 = scanner.nextInt(); //считывает число
                switch (operation) {

                    case '-':
                        x -= operand2;
                        break;
                    case '+':
                        x += operand2;
                        break;
                    case '*':
                        x *= operand2;
                        break;
                    case '/':
                        x /= operand2;
                        break;
                    default:
                        break;
                }
                System.out.println("And the answer is:  " + x);
                System.out.println("Enter operation + - * /");
                operation = scanner.next().charAt(0);

                System.out.println("Enter Number2");
                operand2 = scanner.nextInt(); //считывает число
                System.out.println("And the answer is:  " + x);
                calc();

            }
        }
    }

}

