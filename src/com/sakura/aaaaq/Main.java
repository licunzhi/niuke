package com.sakura.aaaaq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Main
 * @Description 编写一个日期类，要求按xxxx-xx-xx 的格式输出日期，实现加一天的操作。
 * <p>
 * 输入第一行表示测试用例的个数m，接下来m行每行有3个用空格隔开的整数，分别表示年月日。测试数据不会有闰年。
 * <p>
 * 输入数据格式
 * 2
 * 1999 10 20
 * 2001 1 31
 * <p>
 * 输出数据格式
 * 1999-10-21
 * 2001-02-01
 * @Author lcz
 * @Date 2019/04/12 09:10
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        Integer lines = Integer.valueOf(buf.readLine());

        List<LocalDate> dataList = new ArrayList<>();
        for (Integer i = 0; i < lines; i++) {
            String dateString = buf.readLine();
            String[] dateArr = dateString.split(" ");
            LocalDate localDate = LocalDate.of(Integer.parseInt(dateArr[0]), Integer.parseInt(dateArr[1]), Integer.parseInt(dateArr[2]));
            LocalDate localDateAfter = localDate.plusDays(1L);
            dataList.add(localDateAfter);
        }

        dataList.forEach(System.out::println);
    }
}

