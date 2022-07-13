package com.exp.icu;

public class ArrayTest {
    public static void main(String[] args) {
        int[][] arrayDemo = new int[][]{{12, 34,}, {234, 314, 123},{1212,3113,3535}};

        System.out.println(arrayDemo[0][1]);
        System.out.println(arrayDemo[1][1]);

        System.out.println(arrayDemo[1].length);
        System.out.println(arrayDemo.length);
        System.out.println("--------------------------------");
        //二维数组的循环:循环每个数组的第一个元素
        for (int i = 0; i < arrayDemo.length; i++) {
            System.out.println(arrayDemo[i][0]);
        }

        System.out.println("--------------------------------");
        //循环数组第三个里面的元素
        for (int i = 0; i < arrayDemo[2].length; i++) {
            System.out.println(arrayDemo[2][i]);

        }
    }
}
