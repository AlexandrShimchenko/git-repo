 package task1163;

public class CountNeg {
    void count(int[] array) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                k++;
            }
        }
        System.out.println(k);
    }
}
