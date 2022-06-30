package com.PxL.practice_test

fun main(arrgs:Array<String>) {

    val a : Int? = null
    val b : Int = 10
    val c : Int = 100

    if (a == null) {
        println("a is null")
    } else {
        println("a is not null")
    }

    if(b + c == 110) {
        println("b plus c is 110")
    } else {
        println("b plus c is not 110")
    }

    // 엘비스 연산자
    val number : Int? = null
    val number2 = number ?: 10
    // number2 에 number 를 대입할건데,
    // number가 ?(null) 이면 10을 대입
    println()
    println(number2) // 10 출력

    val number3 : Int? = 100
    val number4 = number3 ?: 10
    // number4 에 number3 를 대입할건데,
    // number3가 ?(null) 이면 10을 대입
    println()
    println(number4) // 110 출력

    // 널에 대입하기 위한 문법으로 널에 대응을 하는 좋은 코드

    val num1 : Int = 10
    val num2 : Int = 20

    val max = if(num1 > num2) {
        num1 //5
    } else if (num1 == num2) {
        num2 //10
    } // num1 < num2 에 대한 정의가 없다
    // 즉, 반드시 max에 값을 할당하지 않는다
    // 그래서 else로 할당하는 경우를 정의한다
    else {
        100
    }
}