package task1210;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array = {
                {5, 2, -4, 1, -4, 6, 23, -15, 0, 36},
                {55, 22, 4, 21, -4, 26, 3, -15, 20, 86}
        };
        SwPlace obj1 = new SwPlace();
        obj1.change(array, 0, 1, 1, 5);
    }
}
