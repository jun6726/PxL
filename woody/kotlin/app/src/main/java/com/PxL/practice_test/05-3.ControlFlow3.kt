package com.PxL.practice_test

fun main(args: Array<String>) {

    val value: Int? = null

    when (value) {
        null -> println("value is null")
        else -> println("value is not null")
    }

    val value2: Boolean? = null

    when (value2) {
        true -> println("")
        false -> println("")
        // value2 선언부에서 ? 으로 null 이 가능한 변수로 선언했고
        // null이 될 수 있기 때문에 when(value2)가 null 일 경우를 정의야함
        // 항상 반환하는 분기문 (안전한 코드를 위해)
        null -> println("")
    }

    //값을 리턴하는 when 구문의 경우 반드시 값을 리턴
    val value3 = when(value2) {
        true -> 1
        false -> 3
        null -> 4 // else -> 4
    }


    // when 의 다양한 조건식 (1)
    val value4: Int = 10
    when(value4) {
        // is 는 타입을 묻는 연산자
        is Int -> { // value4가 Int 형인가
            println("value4 is Int")
        } else -> {
            println("value4 is not Int")
        }
    }

    // when 의 다양한 조건식 (2)
    val value5: Int = 87
    when(value5) {
        // in 은 값이 범위 안에 있는지 묻는 연산자
        in 60..70 -> { // .. 은 60~70 이며, 70미만을 하고 싶다면 until 을 사용
            println("value5 is in 60-70")
        }
        in 70..80 -> {
            println("value5 is in 70-80")
        }
        in 80..90 -> {
            println("value5 is in 80-90")
        }
    }


}