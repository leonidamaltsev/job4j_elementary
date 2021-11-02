package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] multiple = new int[size][size];
        for (int i = 0; i < multiple.length; i++) {
            for (int j = 0; j < multiple[i].length; j++) {
                multiple[i][j] = (i + 1) * (j + 1);
            }
        }
        return multiple;
    }
}