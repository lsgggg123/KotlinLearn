package com.lsgggg123.demo.coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    GlobalScope.launch {
        delay(1000)
        println("Hello kotlin coroutine")
    }
    println("Hello main")
    Thread.sleep(2000)
}

/*
jad 反编译结果：

import com.lsgggg123.demo.coroutine.HelloWorldKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;

@Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 2, d1 = {"\000\b\n\000\n\002\020\002\n\000\032\006\020\000\032\0020\001\006\002"}, d2 = {"main", "", "KotlinLearn"})
public final class HelloWorldKt {
  public static final void main() {
    BuildersKt.launch$default((CoroutineScope)GlobalScope.INSTANCE, null, null, (Function2)new Object(null), 3, null);
    String str = "Hello main";
    boolean bool = false;
    System.out.println(str);
    Thread.sleep(2000L);
  }
}
 */