package com.sakura.aaaah;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName MarshallingString
 * @Description
 * 请输入字符串，最多输入4 个字符串，要求后输入的字符串排在前面，例如
 *
 * 输入：EricZ
 *
 * 输出：1=EricZ
 *
 * 输入：David
 *
 * 输出：1=David 2=EricZ
 *
 * 输入：Peter
 *
 * 输出：1=Peter 2=David 3=EricZ
 *
 * 输入：Alan
 *
 * 输出：1=Alan 2=Peter 3=David 4=EricZ
 *
 * 输入：Jane
 *
 * 输出：1=Jane 2=Alan 3=Peter 4=David
 * @Author lcz
 * @Date 2019/03/18 14:17
 */
public class MarshallingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List<String> result = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < count; i++) {
            String name = scn.nextLine();
            result.add(name);
            List<String> message = new ArrayList<>();
            for (int i1 = 0; i1 < (result.size() > 4 ? 4 : result.size()); i1++) {
                message.add((i1 + 1) + "=" + result.get(result.size() - i1 - 1));
            }
            System.out.println(String.join(" ", message));
        }
    }
}
