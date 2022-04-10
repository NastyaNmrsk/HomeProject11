package by.itstep.nmrsk.javalessons.hometask11.controller;

import by.itstep.nmrsk.javalessons.hometask11.model.logic.ReverseNumber;
import by.itstep.nmrsk.javalessons.hometask11.view.View;

import java.util.Scanner;

public class MainTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number N: ");
        int N = scanner.nextInt();
        String msg = String.format("The entered number is %d, the number in reverse order is %d", N, ReverseNumber.calculateReverseNumber(N));
        View.print(msg);
    }

}
