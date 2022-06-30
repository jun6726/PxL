package com.PxL.practice_test

// Colletion
// -> list, set, map

// List

fun main(args: Array<String>) {

//Immutable Collection (변경 불가능)

    // List (중복 허용)
    val numberList = listOf<Int>(1, 2, 3)
    println(numberList)
    println(numberList.get(0))
    println(numberList[0])

    // Set - 집합 (중복 비허용)
    //      - 순서가 없다 -> 인덱스가 없다
    val numberSet = setOf<Int>(1,2,3,3,3)
    println(numberSet)
    numberList.forEach {
        println(it)
    }

    // Map - Key, Value 방식
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)
    println()
    println(numberMap.get("one"))

//mutable Collection (변경 가능)

    val mNumberList = mutableListOf<Int>(1,2,3)
    mNumberList.add(3, 4)
    println()
    println(mNumberList)

    val mNumberSet = mutableListOf<Int>(1,2,3,4,4,4)
    mNumberSet.add(10)
    println(mNumberSet)
}