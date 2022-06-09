package com.itvdn.javaStarter;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean q = true, w = false;
        System.out.println("Сколько чисел вы хотите проверить");
        int end = sc.nextInt();

        int a = 0;
        for (int i = 0; i < end; i++) {
            System.out.println("Введите число");
            a = sc.nextInt();
            try {
                if(a == 0){
                    System.out.println("ноль не четное и не нечетное");
                }
                if(a<0){
                    System.out.println("Число отрицательное");
                }
            } catch (ArithmeticException e) {
                System.out.println("исключение");
            }

            boolean res = (a % 2 == 0) ? q : w;
            System.out.println(res);
        }
    }
}

