package com.ulsum.lambda.demo6;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethod {

    @Test
    // 提取集合中所有偶数并求和
    public void case1() {
        List<String> list = Arrays.asList("1", "2", "3", "4", "5");
        int sum = list.stream()   // 获取stream对象
                .mapToInt(s -> Integer.parseInt(s))   // mapToInt将流中每一个数据转为整数
                .filter(n -> n % 2 == 0)  // filter对流数据进行过滤
                .sum();     // 求和
        System.out.println(sum);
    }

    @Test
    // 所有名字首字母大写
    public void case2() {
        List<String> list = Arrays.asList("lily", "smith", "john");
        list.stream().map(s -> s.substring(0, 1).toUpperCase() + s.substring(1)).forEach(s -> System.out.println(s));
        // collect对六数据进行收集，生成新的List/Set
        List<String> newList = list.stream().map(s -> s.substring(0, 1).toUpperCase() + s.substring(1)).collect(Collectors.toList());
        System.out.println(newList);
    }

    @Test
    // 将所有奇数从大到小排列，且不许出现重复
    public void case3() {
        List<Integer> list = Arrays.asList(1, 60, 38, 21, 51, 60, 51, 73);
        List<Integer> newList = list.stream().distinct()    // 去重复的流数据
                .filter(n -> n % 2 == 1)
                .sorted((a, b) -> b - a)     // 流数据排列
                .collect(Collectors.toList());
        System.out.println(newList);
    }

}
