package task753;

class Position {
    void getMaxPosition(int[] array) {
        int i = 0;
        int j = 0;
        int max = array[i];

        for (; i < array.length - 1; i++) {
            if (array[i] >= max) {
                max = array[i];
                j = i;
            } else continue;
        }
        System.out.println(max);
        System.out.println(j);
    }
}
