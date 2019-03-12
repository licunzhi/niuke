package com.sakura.aaaab;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName Stamps
 * @Description 某人有8 角的邮票5 张，1 元的邮票4 张，1 元8 角的邮票6 张，用这些邮票中的一张或若干张可以得到多少中不同的邮资？
 * @Author lcz
 * @Date 2019/03/12 08:49
 */
public class Stamps {
    public static void main(String[] args) {
        Set<Float> set = new HashSet<>();

        int kind_one = 5;
        int kind_two = 4;
        int kind_three = 6;

        for (int m = 0; m <= kind_one; m++) {
            for (int n = 0; n <= kind_two; n++) {
                for (int k = 0; k <= kind_three; k++) {
                    float result = (float) (m * 0.8 + n + k * 1.8);
                    set.add(result);
                }
            }
        }

        System.out.println(set.size() - 1);

    }
}
