import java.util.Random;

public class Battle {



    /*
    * Напишите программу, в которой создаются 2 «противоборствующих» объекта (от разных классов),
    * состояние которых описывается параметрами: «имя» (строковый, необязательно), «здоровье» (целочисленный), «сила удара» (целочисленный),
    * текущее состояние жив/не жив (логический).

В основном или отдельном классе создать статический метод,
* который будет осуществлять «бой насмерть»
* (подсказка: в бесконечном цикле с каждой итерацией цикла от здоровья одного объекта будет вычитаться сила удара другого объекта,
* пока здоровье одного из объектов (или обоих, при равных условиях) не будет меньше либо равно нулю.

По окончанию цикла сделать вывод в консоль с указанием, какой из объектов «победил».
    * */


    public static void Game() {
        String name1 = "Godzilla";
        String name2 = "Pokemon";
        //Создаем экземпляр класса Random()
        Random rand = new Random();

        //Создаем переменную типа int
        int randPunch1 = 1+rand.nextInt(10);
        int randPunch2 = 1+rand.nextInt(10);
        int health1 = 1000;
        int health2 = 1000;
        boolean isAlive1 = true;
        boolean isAlive2 = true;

            do {
                for (int i = health1+health2; health1 >=0 && health2 >= 0; i--) {
                    health1 = health1 - randPunch2;
                    System.out.println(name1 + health1);
                    health2 = health2 - randPunch1;
                    System.out.println(name2 + health2);
                if (health1 < 0) {
                    isAlive1 = false;
                    System.out.println(name2 + " Win");
                } else {
                    isAlive2 = false;
                    System.out.println(name1 + " Win");
                }
                break;

            }}while (isAlive1 == true && isAlive2 == true);
        }
    }

