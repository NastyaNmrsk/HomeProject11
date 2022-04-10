package by.itstep.nmrsk.javalessons.hometask11.model.logic;

public class PrimeDivisor {
    public static final int PRIME_NUMBERS = 9;

    public static int findDivisor(int number) {
        int divisor = 0;
        System.out.printf("The prime divisors of %d:\n", number);
        for (int i = 2; i < PRIME_NUMBERS; i++)
            if (number % i == 0) {
                divisor = i;
                System.out.println(divisor);
            }
        return divisor;
    }
}
