package com.lsgggg123.demo.kotlin.java_call_kotlin;

import java.lang.reflect.Field;

public class CallKotlin {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        KotlinPojo kotlinPojo = new KotlinPojo();
        System.out.println(kotlinPojo.getName());
        kotlinPojo.setName("new-name");
        System.out.println(kotlinPojo.getName());

        Field name = kotlinPojo.getClass().getDeclaredField("name");
        name.setAccessible(true);
        System.out.println(name.get(kotlinPojo));
    }
}
