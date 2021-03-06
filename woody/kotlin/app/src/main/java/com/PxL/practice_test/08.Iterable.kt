package com.PxL.practice_test

// 08.Iterable

fun main(array :Array<String>) {
    val a = mutableListOf<Int>(1,2,3,4,5,6,7,8,9)

    // 반복하는 방법 (1)
    for (item in a) {
        if(item == 5) {
            println("item is Five")
        } else {
            println("item is not Five")
        }
    }

    // 반복하는 방법 (2)
    for ( (index, item) in a.withIndex()) {
        println("index : " + index + " value : " + item)
        // 문자열 + Int(정수) = 문자열
        // 문자열 + 아무거나 = 문자열
    }
    println()
    // 반복하는 방법 (3) - 람다
    a.forEach {
        println(it)
    }

    // 반복하는 방법 (4)
    a.forEach { item ->
        println(item)
    }

    // 반복하는 방법 (5) - (2번과 동일)
    a.forEachIndexed { index, item ->
        println("index : " + index + " value : " + item)
    }

    // forEach 는 람다식

    // 반복하는 방법 (6)
    for ( i in 0 until a.size) {
        // until은 마지막을 포함하지 않는다
        // 0 부터 8까지
        println(a.get(i))
    }
    println()

    // 반복하는 방법 (7)
    for (i in 0 until a.size step (2)) {
        println(a.get(i))
    }
    println()

    // 반복하는 방법 (8)
    for (i in a.size -1 downTo (0)) {
        // 8 부터 0 까지 반복
        println(a.get(i))
    }

    // 반복하는 방법 (9)
    for (i in a.size -1 downTo (0) step (2)) {
        println(a.get(i))
    }
    println()

    // 반복하는 방법 (10)
    for (i in 0..10) {
        // .. -> 마지막을 포함
        // 0 부터 10 까지 반복
        println(i)
    }
    println()

    // 반복하는 방법 (11)
    var x: Int = 0
    var y: Int = 4

    while (x < y) {
        // 조건이 참일 경우 계속 반복
        // 조건이 깨지는 코드를 넣어야 무한루프를 방지
        x++ // while 문을 정지 시키는 코드
        println("x")
    }

    // 반복하는 방법 (12)
    var i: Int = 0
    var j: Int = 4
    println()
    // 조건에 상관없이 do 안의 구문을 무조건 한 번 실행
    do {
        println("Hello")
    } while (i < j)
}