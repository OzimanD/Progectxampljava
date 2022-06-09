package com.itvdn.javaStarter;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        double a = 9, b = 3;
        Scanner matOper = new Scanner(System.in);
        System.out.println("Введите знак");
        String simvol = matOper.nextLine();
        switch (simvol){
            case "* *":
                double c = a*b;
                System.out.println("Результат умножения "+a+"*"+b+"равен="+c);
                break;
            default:
                System.out.println("Нет такого знака мат действия");


        }


    }
}
