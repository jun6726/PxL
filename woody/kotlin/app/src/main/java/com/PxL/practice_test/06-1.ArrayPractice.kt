package com.PxL.practice_test

fun main(args: Array<String>) {

    val array = arrayOf<Int>(1,2,3)

    // get, set
    val number = array.get(0)
    println(number)

//    val number1 = array.get(100) // 인덱스 예외

    array.set(0, 100)
    val number2 = array.get(0)
    println(number2)

//    array.set(100, 100) // 인덱스 에외

    //Array 의 Bounds
    // - 처음 만들때 결정

    // 배열 생성 (3)
    val a1 = intArrayOf(1, 2, 3)
    val a2 = charArrayOf('b', 'b')
    val a3 = doubleArrayOf(1.2, 10.32)
    val a4 = booleanArrayOf(true,false, true)

    // 배열 생성 (4) -> lambda 활용
    var a5 = Array(10, { 0 })
    var a6 = Array(5, {1; 2; 3; 4; 5})



}