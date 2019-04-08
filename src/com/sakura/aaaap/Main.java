package com.sakura.aaaap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName Main
 * @Description 编写一个复数类，有构造函数，能对复数初始化；重载加法操作符并按a+bi 的形式输出。
 * <p>
 * 输入第一行表示测试用例的个数m，接下来m行每行有4个用空格隔开的整数，分别表示2个复数的实部和虚部
 * 输出m行。按a+bi或者a-bi的格式输出，表示两个复数相加的和。
 * <p>
 * 输入数据格式
 * 1
 * 3 4 1 -2
 * <p>
 * 输出数据格式
 * 4+2i
 * @Author lcz
 * @Date 2019/04/08 15:19
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        Integer lines = Integer.valueOf(buf.readLine());

        for (Integer i = 0; i < lines; i++) {
            String[] strings = buf.readLine().split(" ");
            Integer[] arr = new Integer[4];
            for (int j = 0; j < strings.length; j++) {
                arr[j] = Integer.parseInt(strings[j]);
            }

            if (arr[1] + arr[3] < 0) {
                System.out.println((arr[0] + arr[2]) + "" + (arr[1] + arr[3]) + "i");
            } else {
                System.out.println((arr[0] + arr[2]) + "+" + (arr[1] + arr[3]) + "i");
            }
        }
    }
}

