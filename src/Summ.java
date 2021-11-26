public class Summ {
    public static void Run() {

        int a = 10;
        while (a > 0) {
            a -= 1;
            System.out.println("a = " + a);
            if (a == 5) break;
        }
        int summ = 0;
        for (int i = 0; i < 50; i++) {

            if (i == 45)
                continue;
            summ += i;
            System.out.println("Summa = " + summ);
        }
        switch (summ) {

            case 50:
                System.out.println(50);
                break;
            case 1180:
                System.out.println(1180);
                break;
            case 1225:
                System.out.println(1225);
                break;
            default:
                System.out.println("Result is wrong");
        }
        if (a == 5 && summ == 1180)
            System.out.println("Условие выполнено");

        else
            System.out.println("Условие не выполнено");

    }
}





