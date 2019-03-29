package com.sakura.aaaam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName Main
 * @Description 写一个CTriangle 类，要求可以接受CTriangle(y,x)形式的构造。
 * 表示含义如下：A(0,y) B(0,0) C(x,0)。要求能够处理若干个三角形的相加（点B保持不变，两直角边相加）。
 *
 * 输入有若干行，每行两个数y，x，读到0表示结束。
 *
 * 输入的数据样式为
 * 10 20
 * 1 31
 * 0
 *
 * 输出的数据样式
 * A(0,11),B(0,0),C(51,0)
 *
 * @Author lcz
 * @Date 2019/03/21 15:19
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String[] line = buf.readLine().split(" ");
        int x = 0;
        int y = 0;
        while(Integer.parseInt(line[0]) != 0) {
            x += Integer.parseInt(line[0]);
            y += Integer.parseInt(line[1]);
            line = buf.readLine().split(" ");
        }
        System.out.println(String.format("A(0,%d),B(0,0),C(%d,0)", x, y));

    }
}
