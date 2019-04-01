package com.sakura.aaaao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName Main
 * @Description 根据输入的字符串判断字符串中数字的位置。
 * <p>
 * 按类里存储的数个数m输出m行。每行两个数，表示原变量及其反向变量。
 * <p>
 * 输入数据格式
 * 12 3442 0
 * <p>
 * 输出数据格式
 * 12 21
 * 3442 2443
 * @Author lcz
 * @Date 2019/03/21 15:19
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        Integer lines = Integer.valueOf(buf.readLine());
        for (int i = 0; i < lines; i++) {
            String readLine = buf.readLine();
            for (int i1 = 0; i1 < readLine.length(); i1++) {
                if (Character.isDigit(readLine.charAt(i1))) {
                    System.out.print(i1 + 1 + " ");
                }
            }
            System.out.println();
        }
    }
}

