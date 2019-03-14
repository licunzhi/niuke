package com.sakura.aaaaf;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @ClassName WordRecognition
 * @Description 输入一个英文句子，把句子中的单词(不区分大小写)
 * 按出现次数按从多到少把单词和次数在屏幕上输出来，要求能识别英文句号和逗号，即是说单词由空格、句号和逗号隔开。
 * @Author lcz
 * @Date 2019/03/14 09:09
 */
public class WordRecognition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Map<String, Integer> resultMap = new TreeMap<>((o1, o2) -> o1.compareToIgnoreCase(o2));

        str = str.replace(",", " ");
        str = str.replace(".", " ");
        String[] strings = str.split(" ");

        for (String s : strings) {
            if ("".equals(s)) {
                continue;
            }
            resultMap.merge(s.toLowerCase(), 1, (a, b) -> a + b);
        }

        resultMap.forEach((k, v) -> System.out.println(k + ":" + v));


    }
}
