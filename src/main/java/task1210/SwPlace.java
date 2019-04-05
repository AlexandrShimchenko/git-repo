package task1210;

import java.util.Arrays;

public class SwPlace {
    void change(int[][] array, int v1, int g1, int v2, int g2) {
        int var;
        var = array[v1][g1];
        array[v1][g1] = array[v2][g2];
        array[v2][g2] = var;
        for (int[] v : array) {
            for (int g : v) {
                System.out.print(g + " ");
            }
            System.out.println("\n");
        }
    }
}