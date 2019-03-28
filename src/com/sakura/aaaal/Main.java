package com.sakura.aaaal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Main
 * @Description 一个小球，从高为H的地方下落，下落弹地之后弹起高度为下落时的一半，
 * 比如第一次弹起高度为H/2，如此往复，计算从小球H 高度下落到第n 次弹地往返的总路程。
 * @Author lcz
 * @Date 2019/03/21 15:19
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(buf.readLine());
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String[] strings = buf.readLine().split(" ");
            int height = Integer.parseInt(strings[0]);
            int num = Integer.parseInt(strings[1]);

            double length = 0.0;
            double temp = height;
            for (int j = 0; j < num; j++) {
                if (j == 0) {
                    length += temp;
                } else {
                    length += temp;
                    temp = temp / 2.0;
                }
            }
            list.add(length);
        }

        for (Double s : list) {
            System.out.printf("%.2f\n", s);
        }

    }
}
