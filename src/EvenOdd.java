
public class EvenOdd {
    public void Even() {
        int array[] = {4, 5, 8, 9, 7, 1, 2, 3, 5, 4, 8, 9};
        for (int i = 0; i < array.length; i++) {
            System.out.print((i+1)+"№"+ array[i]+" ");
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print((i+1)+"№"+ array[i]+" ");
        }
    }
}




