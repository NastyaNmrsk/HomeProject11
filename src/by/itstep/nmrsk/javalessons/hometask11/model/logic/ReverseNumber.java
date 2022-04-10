package by.itstep.nmrsk.javalessons.hometask11.model.logic;

public class ReverseNumber {
    public static int calculateReverseNumber(int N) {
        int M;
        for (M = 0; N != 0; N /= 10) {
            M = M * 10 + N % 10;
        }
        return M;
    }
}


