public class MultiplyTable {

    public static void Table() {

        int x;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                x = i * j;
                System.out.print(" " + x + " ");
            }
            System.out.println();
        }
    }
}



