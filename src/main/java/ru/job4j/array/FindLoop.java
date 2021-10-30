package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int e1) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == e1) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
