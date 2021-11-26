public class StringSearch {

public static void StringSearch(){
    String Str = new String("Добро пожаловать дорогой друг");

        System.out.println("Возвращаемое значение: ");
        System.out.println(Str.matches("(.*)дорогой(.*)"));

        System.out.println("Возвращаемое значение: ");
        System.out.println(Str.matches("дорогой"));

        System.out.println("Возвращаемое значение: ");
        System.out.println(Str.matches("Добро пожаловать(.*)"));

    System.out.println("Возвращаемое значение: ");
    System.out.println(Str.startsWith("о",1));

    System.out.println("Возвращаемое значение: ");
    System.out.println(Str.replace("ро","г"));
}
}
