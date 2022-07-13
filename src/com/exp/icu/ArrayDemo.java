package com.exp.icu;
/*
 * 定义一个数组 数据来源于键盘的录入 最后遍历数组把元素输出在控制台
 */
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        //定义一个数组并初始化
        int[] arr = new int[5];
        //创建键盘录入对象

        Scanner scanner = new Scanner(System.in);
        /*
        录入第一个数据
        System.out.println("输入第一个数据");
        int i = scanner.nextInt();
        arr[0] = i;
        arr[0] = scanner.nextInt();
        录入第二个数据
        System.out.println("输入第二个数据");
        arr[1] = scanner.nextInt();
         */

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个数据");
            arr[i] = scanner.nextInt();
        }

        printArray(arr);
    }




    //优化代码
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }
}
