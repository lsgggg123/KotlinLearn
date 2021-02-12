package com.lsgggg123.demo.kotlin.java_call_kotlin

// 文件中声明的方法和属性在编译完之后都会成为一个 Java 类的静态成员或者方法 这个类名默认是文件名 kt

class ClassInFile

fun methodInFile() {
    println("hello world")
    println(filedInFile)
}

var filedInFile: String = "hello"


/*
    javap Compiled from "FunAndFieldInKotlinFile.kt"
    public final class com.lsgggg123.demo.kotlin.java_call_kotlin.FunAndFieldInKotlinFileKt {
      public static final void methodInFile();
      public static final java.lang.String getFiledInFile();
      public static final void setFiledInFile(java.lang.String);
      static {};
    }
 */
