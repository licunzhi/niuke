package com.sakura.aaaae;

/**
 * @ClassName AdditionEquation
 * @Description 设a、b、c 均是0 到9 之间的数字，abc、bcc 是两个三位数，且有：abc+bcc=532。求满足条件的所有a、b、c 的值。
 * @Author lcz
 * @Date 2019/03/14 09:03
 */
public class AdditionEquation {
    public static void main(String[] args) {
        for (int a = 0; a < 9; a++) {
            for (int b = 0; b < 9; b++) {
                for (int c = 0; c < 9; c++) {
                    int result = a * 100 + b * 10 + c + b * 100 + c * 10 + c;
                    if (result == 532) {
                        System.out.println(a + " " + b + " " + c);
                    }
                }
            }
        }
    }

}
