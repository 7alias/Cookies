import java.util.Arrays;

public class Massive {

    public static void skill() {
        //Создаем массив
        //Создаем массив
        int[] array = {22, 4, 5, 6};
//Выводим массив в консоль
        System.out.println(Arrays.toString(array));
//Будет напечатана строка: [22, 4, 5, 6]

//Сортируем его
        Arrays.sort(array);
//Будет: [4, 5, 6, 22]
        System.out.println(Arrays.toString(array));

        //Ищем элемент и печатаем его индекс в консоль
        System.out.println("[" + Arrays.binarySearch(array, 4) + "]");
//Будет напечатано 1.
        //Заполняем все ячейки массива цифрой 15
        Arrays.fill(array, 15);

//Создаем копию, в отведенных рамках
        int[] copy = Arrays.copyOfRange(array, 1, 3);
//copy будет равен {4, 5}.
        System.out.println(Arrays.toString(copy));


        //Создаем массив 1
        int[] array1 = {1, 2, 4, 56};
//Создаем массив 2
        int[] array2 = {1, 762, 44, 5};
//Сравниваем массивы
        if (Arrays.equals(array1, array2) == false){

            System.out.println("Not equal");}
        }
//Массивы не равны, метод вернёт false


    }
