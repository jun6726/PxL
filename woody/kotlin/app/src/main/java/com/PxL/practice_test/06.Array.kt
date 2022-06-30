package com.PxL.practice_test

// 배열

fun main(args: Array<String>) {
    // 배열 생성 (1)
    var number :Int = 10
    var group1 = arrayOf<Int>()
    println(group1 is Array)

    // 배열 생성 (2)
    var group2 = arrayOf(1,2,3,4,5)

    // (좋은 방법은 아니지만) 하나의 배열에 타입을 적지 않는다면 다양한 타입을 저장할 수 있다
    var group3 = arrayOf(1,2, 3.5, "Hello")

    //index 란 [1,2,3,4,5] 0 부터 시작해서 위치를 말하는 방법

    // 배열 사용 (1)
    var test1 = group1.get(0)
    println(test1) // 1
    var test2 = group1.get(1)
    println(test2) //2

    // 배열 사용 (2)
    val test3 = group1[0]
    println(test3)

    // 배열값 변경 (1)
    group1.set(0, 100)
    println(group1[0])

    // 배열값 변경 (2)
    group1[0] = 200
    println(group1[0])




}