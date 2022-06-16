package com.PxL.practice_test

/*03. Function

 함수 선언 방법
 fun 함수명 (변수명: 타입, 변수명: 타입 ...) : 반환형 {
    함수 내용
    return 반환값
 }
*/
    fun plus(first: Int, second: Int): Int {
        val result: Int = first + second
        return result
    }

    //디폴트 값을 갖는 함수 선언
    fun plusFive(first: Int, second: Int = 5) : Int {
        val result : Int = first + second
        return result
    }

    //반환 값이 없는 함수 선언 - Unit (또는 생략)을 반환 자료형을 가지는 함수는 반환 값이 없다
    fun printPlus(first: Int, second: Int):Unit{ //Unit은 생략 가능
        val result: Int = first + second
        print(result)
    }

    //간단하게 함수 선언
    fun plusShort(first: Int, second: Int) = first + second

    fun main(array: Array<String>) {
        val result = plus(5, 10)
        println(result)

        //함수에서 선언된 변수명을 직접 명시해서 대입 할 수 있다
        val result2 = plus(first = 20, second = 30)
        println(result2)

        //함수를 호출 할 때 명시된 변수명의 순서를 바꿔도 된다
        val result3 = plus(second = 100, first = 10)
        println(result3)

        //디폴트 값을 갖는 함수 호출
        val result4 = plusFive(10)
        println(result4)

        //반환 값이 없는 함수 호출
        printPlus(10, 20)

        //간단하게 선언한 함수 호출
        plusShort(50, 50)
    }