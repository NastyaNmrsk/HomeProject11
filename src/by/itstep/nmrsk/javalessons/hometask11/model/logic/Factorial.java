package by.itstep.nmrsk.javalessons.hometask11.model.logic;

public class Factorial {
    public static long calculateFactorial(long number) {
        long factorial = 1;
        for (long i = 1; i <= number; i++) {
            factorial = factorial*i;
        }
        return factorial;
    }
}
