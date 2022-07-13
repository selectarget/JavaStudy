package com.exp.icu;
/*
 *二维数组的打乱
 */

import java.util.Random;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //定义一个二维数组
        int[][] arr = new int[][]{{1, 2, 3, 4, 5, 6}, {7, 8, 9, 0, 11, 12}, {13, 14, 15, 16, 17}};
        //创建随机数对象
        Random rand = new Random();
        //遍历二维数组 进行元素打乱
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int x = rand.nextInt(arr.length);
                int y = rand.nextInt(arr[x].length);
                //元素交换
                int temp = arr[i][j];
                arr[i][j] = arr[x][y];
                arr[x][y] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "");
            }
            System.out.println();
        }


    }
}
