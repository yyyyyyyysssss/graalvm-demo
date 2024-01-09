package com.tech.reflective;

/**
 * @Description
 * @Author ys
 * @Date 2024/1/5 10:06
 */
public class StringReverser {

    public static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

}
