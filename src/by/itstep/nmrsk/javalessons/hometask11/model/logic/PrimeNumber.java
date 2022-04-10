package by.itstep.nmrsk.javalessons.hometask11.model.logic;

public class PrimeNumber {
    public static boolean determinePrimeNumber(int number) {
        boolean prime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
            }
        }
        return prime;
    }
}
