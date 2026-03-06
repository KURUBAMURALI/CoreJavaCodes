package com.code.java;

import java.util.Scanner;

public class Demo3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n + "x" + i+"="+(n*i));
        }
    }
}
