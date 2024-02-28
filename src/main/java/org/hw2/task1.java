package org.hw2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) throws InvalidNumberException {

        Scanner sc = new Scanner(System.in);
        System.out.println("====== Задача № 1 ======");

        try {
            System.out.print("Введите целое число: ");
            int number = sc.nextInt();
            checkNumber(number);
        } catch (InputMismatchException ex) {
            System.out.println("Некорректный ввод! Вводите целые числа!");
        }
        sc.nextLine();
        System.out.println();
    }

    public static void checkNumber(int value) throws InvalidNumberException {
        if (value <= 0) {
            throw new InvalidNumberException("Некорректное число!");
        } else {
            System.out.println("Число корректно.");
        }
    }

    private static class InvalidNumberException extends Throwable {
        public InvalidNumberException(String s) {

        }
    }
}
