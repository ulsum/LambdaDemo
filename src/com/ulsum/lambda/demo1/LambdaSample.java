package com.ulsum.lambda.demo1;

public class LambdaSample {

    public static void main(String[] args) {
        // 1.标准Lambda使用方式
        MathOperation addition = (Integer a, Integer b) -> {
            System.out.println("加法运算");
            return a + b + 0f;
        };
        System.out.println(addition.operator(5, 3));

        // 2.Lambda允许忽略参数类型
        MathOperation subtraction = (a, b) -> {
            System.out.println("减法运算");
            return a - b + 0f;
        };
        System.out.println(subtraction.operator(5, 3));

        // 3.单行实现代码可以省略大括号和return
        MathOperation multiplication = (a, b) -> a * b + 0f;
        System.out.println(multiplication.operator(5, 3));
    }

}
