package by.itstep.nmrsk.javalessons.hometask11.controller;

import by.itstep.nmrsk.javalessons.hometask11.model.logic.Factorial;
import by.itstep.nmrsk.javalessons.hometask11.view.View;

import java.util.Scanner;

public class MainFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a natural number: ");
        long number = scanner.nextLong();
        long result = Factorial.calculateFactorial(number);
        String msg = String.format("The factorial of %d is %d", number, result);
        View.print(msg);
        scanner.close();
    }
}
