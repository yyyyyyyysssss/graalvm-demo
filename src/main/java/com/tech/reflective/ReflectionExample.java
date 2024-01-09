package com.tech.reflective;

import java.lang.reflect.Method;

/**
 * @Description
 * @Author ys
 * @Date 2024/1/4 13:12
 */

public class ReflectionExample {

    public static Object reflectionExample(String[] args) throws ReflectiveOperationException {
        if (args == null || args.length == 0) {
            System.err.println("You must provide the name of a class, the name of its method and input for the method");
            return "";
        }
        String className = args[0];
        String methodName = args[1];
        String input = args[2];

        Class<?> clazz = Class.forName("com.tech.reflective." + className);
        Method method = clazz.getDeclaredMethod(methodName, String.class);
        return method.invoke(null, input);
    }

}
