package com.lsgggg123.demo.kotlin.kotlin_call_java;

import java.util.Arrays;

public class JavaUser {
    private String name;
    private int age;
    private boolean married;
    private int[] scores;
    private String[] strArr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public String[] getStrArr() {
        return strArr;
    }

    public void setStrArr(String[] strArr) {
        this.strArr = strArr;
    }

    @Override
    public String toString() {
        return "JavaUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", married=" + married +
                ", scores=" + Arrays.toString(scores) +
                '}';
    }
}
