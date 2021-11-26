import java.util.Arrays;
import java.util.Scanner;

public class SkillStrings {
    public static void lesson() {
        int a = 22;
        String b = "Двадцать два";
        System.out.println(a + " " + b);
        System.out.println("Длина строки: " + b.length());
        System.out.println("Первая буква строки: " + b.charAt(0));
        System.out.println(b.charAt(2));
        System.out.println(b.concat(b));
        System.out.println(b.equals(a));
        String s1 = "some";
        String s2 = "Some";
        System.out.println(s1.equals("some"));
        System.out.println(s2.equals("some"));
//       equalsIgnoreCase(String str) 	boolean 	Сравнивает данную строку с другой строкой, игнорируя регистр
        System.out.println(s2.equalsIgnoreCase("some"));
//       indexOf(int char) или lastIndexOf()
//       int
//       Возвращает индекс первого или последнего вхождения указанного символа в данной строке
//        System.out.println("Some string".indexOf('o'));
        // indexOf(String str) или lastIndexOf(String str) 	int 	Возвращает индекс первого или последнего вхождения указанной подстроки в данной строке
        System.out.println("Some string".indexOf("string"));
        // length() 	int 	Возвращает длину строки
        System.out.println("Some".length());
        System.out.println("abra cadabra".replace('a', 'e'));
        // replaceAll(Strin oldStr, String newStr)
        //    String 	Заменяет каждую подстроку строки на новую
        System.out.println("abra cadabra".replaceAll("abra", "no"));
        System.out.println("abra cadabra".replaceFirst("abra", "no"));
        //split(String s) 	String[] 	Разделяет строку на массив строк, строка s является разделителем
        System.out.println(Arrays.toString("Маша,Саша,Витя".split(",")));

//        вернёт массив имён {"Маша", "Саша", "Витя"}
        // substring(int beginIndex) или substring(int beginIndex, int endIndex)
//        Возвращает новую строку, которая является подстрокой данной строки
        System.out.println("Привет мир".substring(7));
        System.out.println("Привет мир".substring(0, 6));
        // toLowerCase() или toUpperCase()
//         	Преобразует все символы в строке в нижний или верхний регистр
        String hw = "Привет мир".toLowerCase();
        System.out.println(hw);
        hw = hw.toUpperCase();
        System.out.println(hw);
        String tr = "    Text     ";
        System.out.println(tr.trim());
        String str = String.valueOf(3);
        //теперь строка str = "3"


//        Напишите код, который позволяет из строки, содержащей значение "Sometimes", напечатать третий символ этого слова.

        System.out.println(("Sometimes".charAt(2)));

        String a1 = "22";
        String b1 = "22";
        System.out.println(a1.equals(b1));

    }

    //        Измените код из предыдущего задания так, чтобы вся проверка имени была выделена в отдельный метод с именем, например
    public static void checkUserName() {
//        Можно ли пользователю выбрать себе имя "Иван Иванов", если уже есть другой пользователь с именем "иван иванов", считая, что регистр важен для вашей системы?
//                Напишите код, который сравнивает эти имена и выводит результат сравнения.
        String name1 = "Иван  Иван ";
        String name2 = "иван Иваненко";
        if (name1.equals(name2)) {
            System.out.println("Да, регистр не важен");
        } else {
            System.out.println("Нет, регистр важен");
        }


        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Имена совпадают, регистр не имеет значения");
        } else {
            System.out.println("Имена не совпадают");
        }

/*
        Задание 3.2.4

        Измените код из предыдущего задания так,
        чтобы в случае совпадения имен пользователей (без учета регистра) выводился ответ:
        "Выберите другое имя пользователя",
                а если имена не совпадают, выводится ответ: "Отличное имя!".
                 используйте методы из таблицы выше.

 */
/*
        Задание 3.2.6

        Измените код из предыдущего задания так, чтобы в случае, если имя пользователя уникальное,
        пользователю также сообщалось бы "Ваше имя имеет длину <длина имени> символов",
        где вместо <длина имени> стоит соответствующее число.
        Проверьте, что ваша программа работает корректно,
        заменив имя "Иван" на другое, например "Вован".
        В задании используйте методы из таблицы выше.
  */
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Выберите другое имя пользователя");
        } else {
            System.out.println("Отличное имя!");
            System.out.println("Ваше имя имеет длину: " + name1.length() + " символов.");
            name1 = name1.replace(" ", "");

            System.out.println("А без пробелов ваше имя имеет длину: " + name1.length() + " символов.");

            System.out.println(name1.hashCode());
            System.out.println(name2.hashCode());
/*

        Задание 3.2.7

        Измените код из предыдущего задания так,
        чтобы после надписи о длине имени добавлялось замечание
        "А без пробелов ваше имя занимает <число> символов".
        Организуйте код таким образом,
        чтобы даже если имя состоит из трех слов,
        программа работала корректно.
        В задании используйте методы из таблицы выше.
  */

            String dname = "Петя";
            int age = 33;
            String prof = "Водитель";


            String phrase = ("всем привет, я " + dname + " мне " + age + " я работаю " + prof);
            System.out.println(phrase);

            String formatString = String.format("всем привет, я %s мне %d я работаю %s", dname, age, prof);
            System.out.println(formatString);
            System.out.printf("всем привет, я %s мне %d я работаю %s", dname, age, prof);

//            StringBuilder sb = new StringBuilder();

        }
    }

    public static void removeSpaces() {
        System.out.println(removeWhiteSpaces("А роза упала на лапу Азора"));
    }

    private static String removeWhiteSpaces(String str) {
        str = str.replace(" ", "");

        return str;
    }


    public static void nameEnterCheck() {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            System.out.println("Enter name:");
            String name = "Mikhailovich Vasili Pronenko";
                    //scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            System.out.println(name);
//Mikhailovich Vasili Pronenko
            String names[] = name.split(" ");
            for (int j = 0; j <names.length; j++){
                System.out.println(names[j]);

            }
            if (!isCorrectName) System.out.println("Введите корректное имя!");
        }
    }

    private static boolean checkName(String name) {
        name = name.trim();

        boolean state = false;
        if (name.length() >0) {
            state = true;
        }
        return state;
    }
}








