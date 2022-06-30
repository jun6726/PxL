package com.PxL.practice_test

//연산자

//산술연산자
// +, -, *, / (몫), % (나머지)

//대입연산자
//좌변 = 우변 (우변 값이 좌변에 들어간다)
// a = 5 (o), 5 = a (x)

//복합 대입 연산자
// += , -=, *=, /=, %=
// a += 10 -> a = a + 10

//증감 연산자
// ++, --
// a++, a--

//비교 연산자
// >, >=, <, <=, ==, !=
//True == True -> True
//True == False -> False
//True != True -> False
//True != False -> True

//논리 연산자
// &&, ||, !!
// True && True -> True
// True || False -> True


//Practice

fun main(array: Array<String>) {

    // 산술 연산자
    var a = 10 + 1
    var b = 10 - 1
    var c = 1 * 9
    var d = 20 / 3
    var e = 20 % 3

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)

    // 대입 연산자
    var f = 5
    
    // 복합 대입 연산자
    a += 10
    b -= 10
    c *= 3
    d /= 4
    e %= 2
    println()
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)

    // 증감 연산자
    a++
    b--
    println()
    println(a)
    println(b)

    // 비교 연산자
    var g = a > b
    var h = b > a
    var i = a == b
    var j = !i
    var k = j != i
    println()
    println(g)
    println(h)
    println(i)
    println(j)
    println(k)

    // 논리 연산자

    var l = i && j
    var m = i || j
    println(l)
    println(m)
}