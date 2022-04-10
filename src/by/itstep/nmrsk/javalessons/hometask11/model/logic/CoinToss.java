package by.itstep.nmrsk.javalessons.hometask11.model.logic;

import java.util.Random;

public class CoinToss {

    public static final int NUMBER_OF_TOSSES = 1000;
    public static final int NUMBER_OF_SIDES = 2;

    public static int calculateHead() {
        Random random = new Random();

        int head = 0;

        for (int i = 0; i < NUMBER_OF_TOSSES; i++) {
            int quantity = random.nextInt(NUMBER_OF_SIDES);
            if (quantity == 1) {
                head++;
            }
        }

        return head;
    }
}
