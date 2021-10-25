package ru.job4j.array;

public class Turn {

    public static int[] back(int[] array) {
        for (int ind = 0; ind < array.length / 2; ind++) {
            int temp = array[ind];
            array[ind] = array[array.length - ind - 1];
            array[array.length - ind - 1] = temp;
        }
        return array;
    }
}