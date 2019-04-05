package task68;

public class Comparison {
    private int m = 10;

    public void getComparison() {
        for (int i = 1; i < 6; i++) {
            if ((i * i) < m)
                System.out.println(i * i);
        }
    }
}