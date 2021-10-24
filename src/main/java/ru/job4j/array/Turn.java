package ru.job4j.array;

public class Turn {

    public static int[] back(int[] array) {
        int j = array.length - 1;
        for (int i = 0; i < array.length / 2; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }
}