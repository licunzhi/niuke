package com.sakura.aaaak;

import java.util.Scanner;

/**
 * @ClassName Main
 * @Description 创建一个CPoint 类，代表平面直角坐标系中的点，
 * 创建构造函数和运算符重载函数，运算符重载为类重载（非友元重载），可以实现计算两个点之间的距离。
 * @Author lcz
 * @Date 2019/03/21 15:19
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        Scanner sca = new Scanner(System.in);
        while (m-- > 0) {
            double[] nodes = new double[4];
            for (int i = 0; i < 4; i++) {
                nodes[i] = sca.nextInt();
            }
            double len = Math.sqrt((nodes[3] - nodes[1]) * (nodes[3] - nodes[1]) + (nodes[2] - nodes[0]) * (nodes[2]
                            - nodes[0]));
            System.out.printf("%.2f", len);
            System.out.println();
        }
    }
}
