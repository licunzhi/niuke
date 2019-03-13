package com.sakura.aaaad;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName IntegerSurplus
 * @Description 一个数如果恰好等于它的各因子（该数本身除外）子和，如：6=3+2+1，则称其为“完数”；
 * 若因子之和大于该数，则称其为“盈数”。求出2 到60 之间所有“完数”和“盈数”，并以如下形式输出： E: e1 e2 e3 ......(ei 为完数) G: g1 g2 g3 ......(gi 为盈数)
 * @Author lcz
 * @Date 2019/03/13 16:32
 */
public class IntegerSurplus {
    public static void main(String[] args) {
        List<Integer> wanshu = new ArrayList<>();
        List<Integer> yingshu = new ArrayList<>();
        for (int i = 2; i <= 60; i++) {
            int result = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    result += j;
                }
            }
            if (result == i) {
                wanshu.add(i);
            } else if (result > i) {
                yingshu.add(i);
            }
        }
        System.out.print("E: ");
        wanshu.forEach(value -> System.out.print(value + " "));
        System.out.print("G: ");
        yingshu.forEach(value -> System.out.print(value + " "));
    }
}
