package by.itstep.nmrsk.javalessons.hometask11.controller;

import by.itstep.nmrsk.javalessons.hometask11.model.logic.CoinToss;
import by.itstep.nmrsk.javalessons.hometask11.view.View;

public class MainOne {


    public static void main(String[] args) {
        int head = CoinToss.calculateHead();
        int tail = CoinToss.NUMBER_OF_TOSSES - head;
        String msg = String.format("Heads fell %d times, tails fell %d times", head, tail);
        View.print(msg);
    }

}
