package com.sakura.aaaan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName Main
 * @Description 写一个类，能接受int 型的变量，接收变量后能存储原变量（譬如12345）和其反向变量(54321)，
 * 最多处理数量为10 个，当输入达到10 个或者输入变量为0 的时候停止。并且在类销毁前输出存储的所有变量。
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        List<String> list = new ArrayList<>();
        while (count < 10) {
            String value = scanner.next();
            int val = Integer.parseInt(value);
            if (val == 0) {
                break;
            }
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < value.length(); i++) {
                result.append(value.toCharArray()[value.length() - i - 1]);
                count++;
            }
            list.add(String.valueOf(Integer.parseInt(result.toString())));

        }
        System.out.println(String.join(" ", list));
    }
}

