package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        int x = x1 - x2;
        int y = y1 - y2;
        if ((x1 < 0 || x2 < 0 || y1 < 0 || y2 < 0)) {
            return 0;
        }

        if (x == Math.abs(y)) {
            rsl = Math.abs(x);
        }
        return rsl;
    }
}