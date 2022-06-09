package com.itvdn.javaStarter;

public class Test2 {
    public static void main(String[] args) {

        int a = (byte) 1000;
        System.out.println(a);
        int c = 0;
        int b = 1000;
        while (b >= -128) {
            System.out.println("шаг цикла-" + c + " результат=" + b);
            c += 1;
            b -= 128;
        }
    }
}