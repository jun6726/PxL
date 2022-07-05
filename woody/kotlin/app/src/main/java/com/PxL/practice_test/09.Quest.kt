package com.PxL.practice_test

fun main(array :Array<String>) {
    first()
    second(80)
    second(68)
    third(11)
    gugudan(2)
    gugudan(214)


}

/*1번 문제
List를 두개 만든다
첫번째 List에는 0 부터 9 까지 값을 넣는다 (반복문)
두번째 List에는 첫번째 List의 값을 하나씩 확인한후
짝수면 True 홀수면 False를 넣어준다*/

fun first() {
    val list1 = mutableListOf<Int>()
    val list2 = mutableListOf<String>()

    for(i in 0..9) {
        list1.add(i)
    }

    for(i in list1) {
        if(list1.get(i) % 2 == 0) {
            list2.add("True")
        } else {
            list2.add("False")
        }
    }
    println(list1)
    println(list2)
}

/*2번 문제
학점을 구하자
80 ~ 90 -> A`
70 ~ 80 -> B
60 ~ 70 -> C
나머지 F*/

fun second(score :Int) {
    var A = 90
    var B = 80
    var C = 70
    var D = 60
    var grade = ""
    if(score >= A) {
        grade = "A"
    } else if (score >= B && score < A) {
        grade = "B"
    } else if (score >= C && score < B) {
        grade = "C"
    } else if (score >= D && score < C) {
        grade = "D"
    } else {
        grade = "F"
    }

    println(grade)
}

/*3번 문제
전달 받은 숫자의 각 자리 숫의 합을 구하자
조건 : 전달 받은 숫자는 무조건 두자리 숫자이다*/

fun third(number :Int) {
    var sum = 0
    do{
        println("두 자리 숫자 $number 입력받았습니다")
        sum += number % 10
        sum += number / 10
        println("두 자리수의 합은 $sum 입니다")
    }while(number < 10)
}

/*4번 문제
구구단 출력하자*/

fun gugudan(number :Int) {
    var sum = 0
    for (i in 2 .. 9) {
        sum = number * i
        println("$number X $i = $sum")
    }
}

// collection에 약하다 > 파이썬때도 그랬음 (복습)