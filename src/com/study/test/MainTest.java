package com.study.test;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("左直角三角形");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("★");
            }
            System.out.println();
        }
        System.out.println("左倒直角三角形");
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j > i; j--) {
                System.out.print("★");
            }
            System.out.println();
        }
        System.out.println("右倒直角三角形");
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 3; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("右直角三角形");
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("正等边三角形");
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        int size = 3;
        //先打印上半部分
        System.out.println("正三角形");
        for (int i = 0; i < size / 2 + 1; i++) {
            //打印空白部分
            //i = 0 1 2 3 4
            //打印空格是 4 3 2 1 0
            for (int j = size / 2; j > i; j--) {
                System.out.print(" ");
            }
            //打印星号
            //i = 0 1 2 3 4
            //星号数量 1 3 5 7 9
            // 2*i + 1
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
