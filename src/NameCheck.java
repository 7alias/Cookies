import java.util.Scanner;

public class NameCheck {


    public static void nameEnterCheck() {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            System.out.println("Enter name:");
            String name =
                    //"Mikhailovich Vasili Pronenko";
                    scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            System.out.println(name);
//Mikhailovich Vasili Pronenko
            String words[] = name.split(" ");
            if (words.length == 3) {
                System.out.println("Correct input, the names are:");
                NameCheck.sortByLength(words);
                for (int j = 0; j < words.length; j++) {
                    System.out.println(words[j]);
                }
                System.out.println(NameCheck.formatName(words));


            } else {
                System.out.println("Enter correct name of 3 parts");
                nameEnterCheck();
            }
        }
        if (!isCorrectName) System.out.println("Введите корректное имя!");
    }


    private static String formatName(String[] words) {

        String fio = "";
        for (int i = 0; i < 3; i++) {
            fio = fio.concat(words[i] + " ");

        }
        return fio;
    }

    private static String[] sortByLength(String[] words) {
        //Написать код здесь
        int size = words.length;
//logic for sorting
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
//compares each elements of the array to all the remaining elements
                if (words[i].compareTo(words[j]) > 0) {
//swapping array elements
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        return words;
    }

    private static boolean checkName(String name) {
        name = name.trim();
        boolean state = false;
        if (name.length() > 0) {
            state = true;
        }
        return state;
    }
}
