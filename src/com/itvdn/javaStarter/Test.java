package com.itvdn.javaStarter;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        int q = (byte)253<<2;
//        System.out.println(q);
//        int w = -127>>2;
//        System.out.println(w);
//        int e = -1>>>24;
//        System.out.println(e);

        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число а");
        int a = in.nextInt();
        boolean _true = true;
        boolean _false = false;
        if(a>0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
