package com.sakura.aaaar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Main
 * @Description 建立一个求一元二次方程解的类（a*x2+b*x+c=0），输入系数a,b,c 的值后打印出这个方程的解
 * <p>
 * 输入第一行为样例数m，接下来m行每行3个整数a、b、c。。
 * <p>
 * 输入数据格式
 * 3
 * 1 -3 2
 * 1 -2 1
 * 2 1 2
 * <p>
 * 输出数据格式
 * x1=1.00,x2=2.00
 * x=1.00
 * -1
 * @Author lcz
 * @Date 2019/04/29 10:50
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        Integer lines = Integer.valueOf(buf.readLine());

        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < lines; i++) {
            String[] strings = String.valueOf(buf.readLine()).split(" ");
            int a = Integer.parseInt(strings[0]);
            int b = Integer.parseInt(strings[1]);
            int c = Integer.parseInt(strings[2]);
            double deta = b * b - 4 * a * c;
            if (deta < 0) {
                resultList.add("-1");
            } else if (deta > 0) {
                double x1 = (-b - Math.sqrt(deta)) / (2.0 * a);
                double x2 = (-b + Math.sqrt(deta)) / (2.0 * a);
                resultList.add(String.format("x1=%.2f,x2=%.2f", x1, x2));
            } else if (deta == 0) {
                double x = -b / (2.0 * a);
                resultList.add(String.format("x=%.2f", x));
            } else {
                double res = ((double) (c)) / (-b);
                resultList.add(String.format("x=%.2f", res));
            }
        }
        System.out.print(String.join("\n",resultList));
    }
}

