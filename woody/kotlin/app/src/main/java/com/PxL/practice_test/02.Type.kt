package com.PxL.practice_test

//02.Type

var name = "John"
var str  = "My name Is $name Nice to meet you"
// 문자열 안에 변수를 호출하여 출력할 수 있다. $변수명


// kotlin 은 nullsafety 한 언어로 Null을 선언하기 위해 ? 선언

//var abc : Int = null //error : Null can not be a value of a non-null type int
var abc : Int? = null //자료형 뒤에 ? > nullable type
var def : Double? = null

fun main(array: Array<String>){
    println(str) //결과 값 : My name is John Nice to meet you
    println(abc) //         null ("null"  x) //"null"이라는 문자열이 아님
}