package com.sakura.aaaaa;

/**
 * @ClassName SymmetricSquare
 * @Description 对称平方
 * @Author lcz
 * @Date 2019/03/11 14:23
 */
public class SymmetricSquare {
    public static void main(String[] args) {

        for (int i = 1; i < 256; i++) {
            char[] array = String.valueOf(i * i).toCharArray();

            boolean tag = true;

            for (int m = 0; m < array.length / 2; m++) {
                if (array[m] != array[array.length - 1 - m]) {
                    tag = false;
                }
            }

            if (tag) {
                System.out.println(i);
            }
        }
    }
}
