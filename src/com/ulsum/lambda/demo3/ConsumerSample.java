package com.ulsum.lambda.demo3;

import java.util.function.Consumer;

public class ConsumerSample {

    public static void main(String[] args) {
        output(s -> System.out.println("向控制台打印 - " + s));
        output(s -> {
            // 示例代码
            System.out.println("向xxx网站发送数据包 - " + s);
        });
    }

    public static void output(Consumer<String> consumer) {
        String text = "学习Java";
        consumer.accept(text);
    }

}
