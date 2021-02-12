package com.ulsum.lambda.demo4;

import java.util.Random;
import java.util.function.Function;

public class FunctionSample {

    public static void main(String[] args) {
        // 取随机定长字符串
        Function<Integer, String> randomStringFunction = l -> {
            String chars = "abcdefghijklmnopqrstuvwxyz0123456789";
            StringBuffer stringBuffer = new StringBuffer();
            Random random = new Random();
            for (int i = 0; i < l; i++) {
                int position = random.nextInt(chars.length());
                stringBuffer.append(chars.charAt(position));
            }
            return stringBuffer.toString();
        };
        System.out.println(randomStringFunction.apply(10));
    }

}
