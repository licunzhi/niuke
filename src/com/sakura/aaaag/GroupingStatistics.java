package com.sakura.aaaag;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @ClassName GroupingStatistics
 * @Description 先输入一组数，然后输入其分组，按照分组统计出现次数并输出，参见样例。（这题理解起来相对有难度，我给做出了结果展示）
 * 输入格式展示:
 * 1
 * 7
 * |3| 2 3 8 8 2 |3|
 * |1| 2 3 2 1 3 |1|
 *  √             √
 * 输出格式展示
 * 1={2=0,3=2,8=1}
 * 2={2=1,3=0,8=1}
 * 3={2=1,3=1,8=0}
 *
 * 解释说明:第二行输入数据的1 上面对应的分别是 3 3 所以有两个3 因此3=2
 * @Author lcz
 * @Date 2019/03/17 19:53
 */
public class GroupingStatistics {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int outer_count = scn.nextInt();// 外层进行循环次数
        for (int i = 0; i < outer_count; i++) {
            int inner_count = scn.nextInt();
            // 第一行作为value存储
            Map<Integer, Integer> allData = new TreeMap<>();
            List<Integer> valueList = new ArrayList<>();
            List<Map<Integer, Integer>> mapList = new ArrayList<>();
            for (int j = 0; j < inner_count; j++) {
                int value = scn.nextInt();
                valueList.add(value);
                allData.put(value, 0);
            }
            // key和value之间的关系合并
            for (int j = 0; j < valueList.size(); j++) {
                Map<Integer, Integer> keyMap = new HashMap<>();
                int key = scn.nextInt();
                keyMap.put(key, valueList.get(j));
                mapList.add(keyMap);
            }
            Map<Integer, List<Integer>> tempConvert = new TreeMap<>();
            for (Map<Integer, Integer> map : mapList) {
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (tempConvert.get(entry.getKey()) != null) {
                        tempConvert.get(entry.getKey()).add(entry.getValue());
                    } else {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(entry.getValue());
                        tempConvert.put(entry.getKey(), temp);
                    }
                }
            }

            // 格式化输出信息
            for (Map.Entry<Integer, List<Integer>> entry : tempConvert.entrySet()) {
                Map<Integer, Integer> params = new TreeMap<>();
                allData.forEach((k, v) -> params.put(k, v));
                List<Integer> integers = entry.getValue();
                for (Integer integer : integers) {
                    params.merge(integer, 0, (a, b) -> (params.get(integer) + 1) );
                }
                System.out.print(entry.getKey() + "={");
                List<String> message = new ArrayList<>();
                params.forEach((k, v) -> message.add(k + "=" + v));
                System.out.print(String.join(",", message));
                System.out.println("}");
            }

        }
    }
}
