package by.itstep.nmrsk.javalessons.hometask11.controller;

import by.itstep.nmrsk.javalessons.hometask11.model.logic.PrimeNumber;
import by.itstep.nmrsk.javalessons.hometask11.view.View;

import java.util.Scanner;

public class MainThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = scanner.nextInt();
        boolean prime = PrimeNumber.determinePrimeNumber(number);
        String msg = number <= 1 ? "Please, input a valid number"
                : (prime ? "It's a prime number" : "It's a composite number");
        View.print(msg);
        scanner.close();
    }
}
