public class SimpleNumbers {

    public void test() {
        long time = System.currentTimeMillis()/1000;


        for (int i = 2; i <= 2000000; i++) {
            boolean isExit = true;
            int sqrt = (int) Math.sqrt((double) i);

            for (int j = 2; j <= sqrt; j++) {
                if (i % j == 0) {
                    isExit = false;
                    break;
                }
            }
            if (isExit) {
                System.out.print(" " + i);
                time = System.nanoTime() - time;

            }


        }
        System.out.println();
        time = System.currentTimeMillis()/1000- time;
        System.out.println("Elapsed " + -(time / 1000000000.0) + " s");
    }
}
