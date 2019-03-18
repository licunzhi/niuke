package com.sakura.aaaai;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * @ClassName Main
 * @Description 设计一个程序能计算一个日期加上若干天后是什么日期。
 * @Author lcz
 * @Date 2019/03/18 17:29
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            Scanner scan = new Scanner(System.in);
            int year = scan.nextInt();
            int month = scan.nextInt();
            int day = scan.nextInt();
            int days = scan.nextInt();

            LocalDate localDate = LocalDate.of(year, month, day);
            LocalDate plusDays = localDate.plusDays(days);
            System.out.println(plusDays.format(DateTimeFormatter.ofPattern("YYYY-MM-dd")));
        }
    }
}
