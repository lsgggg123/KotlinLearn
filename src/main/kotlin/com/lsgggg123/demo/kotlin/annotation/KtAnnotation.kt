package com.lsgggg123.demo.kotlin.annotation

// 注解 （annotation）
// meta-annotation （元注解）
@Target(
    AnnotationTarget.CONSTRUCTOR,
    AnnotationTarget.CLASS,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.EXPRESSION,
    AnnotationTarget.PROPERTY_SETTER
)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class KtAnnotation()

@KtAnnotation
class AnnotationClass {

    @KtAnnotation
    fun info(): Int {
        return (@KtAnnotation 10)
    }
}

//constructor 关键字不可省略
class AnnotationClass2 @KtAnnotation constructor(a: Int)

class AnnotationClass3 {
    var a: Int? = null
        @KtAnnotation set
}