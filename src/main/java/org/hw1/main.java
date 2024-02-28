package org.hw1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner aScanner = new Scanner(System.in);
        try {
            System.out.print("Введите делимое (целое число): ");
            int divisible = aScanner.nextInt();
            System.out.print("Введите делитель (целое число): ");
            int divider = aScanner.nextInt();
            System.out.printf("Решение: %s / %s = %s", divisible, divider, divisible / divider);
        } catch (InputMismatchException ex1) {
            System.out.println("Некорректный ввод. Введите, пожалуйста, целое число.");
        } catch (ArithmeticException ex2) {
            System.out.println("Некорректный ввод. Деление на ноль недопустимо.");
        }
        aScanner.close();
    }
}
