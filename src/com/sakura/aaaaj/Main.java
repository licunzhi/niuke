package com.sakura.aaaaj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName Main
 * @Description 创建一个CTriangle 类，需要用到第二题中创建的类，即用3点来代表一个三角形，
 * 输入三个点的坐标，实现判断此三角形是不是直角三角形，并输出此三角形的周长。
 *
 * 性质分析：三点求出三边的长度，直角三角形两边平方和等于第三遍平方
 * @Author lcz
 * @Date 2019/03/18 17:29
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List<Integer> x1List = new ArrayList<>();
        List<Integer> y1List = new ArrayList<>();
        List<Integer> x2List = new ArrayList<>();
        List<Integer> y2List = new ArrayList<>();
        List<Integer> x3List = new ArrayList<>();
        List<Integer> y3List = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int x1 = scanner.nextInt();
            x1List.add(x1);
            int y1 = scanner.nextInt();
            y1List.add(y1);
            int x2 = scanner.nextInt();
            x2List.add(x2);
            int y2 = scanner.nextInt();
            y2List.add(y2);
            int x3 = scanner.nextInt();
            x3List.add(x3);
            int y3 = scanner.nextInt();
            y3List.add(y3);
        }

        for (int i = 0; i < count; i++) {
            double aa = Math.pow(x1List.get(i) - x2List.get(i), 2) + Math.pow(y1List.get(i) - y2List.get(i), 2);
            double bb = Math.pow(x1List.get(i) - x3List.get(i), 2) + Math.pow(y1List.get(i) - y3List.get(i), 2);
            double cc = Math.pow(x2List.get(i) - x3List.get(i), 2) + Math.pow(y2List.get(i) - y3List.get(i), 2);
            double temp = aa;
            if (aa < bb) {
                temp = bb;
                bb = aa;
                aa = temp;
            }
            if (aa < cc) {
                temp = cc;
                cc = aa;
                aa = temp;
            }

            if (aa == bb + cc) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            double circle = Math.sqrt(aa) + Math.sqrt(bb) + Math.sqrt(cc);
            System.out.println(String.format("%.2f", circle));
        }
    }
}
