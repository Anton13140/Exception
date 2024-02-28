package org.hw2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) throws DivisionByZeroException {
        Scanner sc = new Scanner(System.in);
        System.out.println("====== Задача № 2 ======");
        try {
            System.out.print("Введите первое целое число: ");
            int a = sc.nextInt();
            System.out.print("Введите второе целое число: ");
            int b = sc.nextInt();
            divide(a, b);
        } catch (InputMismatchException e1) {
            System.out.println("Ошибка: некорректный ввод. Вводите целые числа!");
        }
        sc.nextLine();
        System.out.println();
    }


    public static void divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо!");
        } else {
            System.out.println(a / b);
        }
    }

    private static class DivisionByZeroException extends Throwable {
        public DivisionByZeroException(String s) {
        }
    }
}
