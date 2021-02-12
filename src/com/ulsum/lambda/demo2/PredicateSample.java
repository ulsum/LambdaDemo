package com.ulsum.lambda.demo2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateSample {

    public static void main(String[] args) {
        Predicate<Integer> predicate = n -> n > 4;
        boolean result = predicate.test(4);
        System.out.println(result);

        // 传统方式取奇数
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        for (Integer num : list) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }

        // Predicate方式取奇数
        filter(list, n -> n % 2 == 1);
        // Predicate方式取偶数
        filter(list, n -> n % 2 == 0);
    }

    public static void filter(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer num : list) {
            if (predicate.test(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

}
