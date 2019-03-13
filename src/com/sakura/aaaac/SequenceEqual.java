package com.sakura.aaaac;

/**
 * @ClassName SequenceEqual
 * @Description 设N是一个四位数，它的9倍恰好是其反序数（例如：1234 的反序数是4321），求N的值。
 * @Author lcz
 * @Date 2019/03/13 16:05
 */
public class SequenceEqual {
    public static void main(String[] args) {
        for (int i = 1000; i < 9999; i++) {
            String str = String.valueOf(i);
            char[] chars = String.valueOf(i * 9).toCharArray();
            if (chars.length == str.length()) {
                String result = "";
                for (int j = chars.length - 1; j >= 0; j--) {
                    result += chars[j];
                }
                if (str.equals(result)) {
                    System.out.printf(String.valueOf(i));
                }
            }
        }
    }
}
