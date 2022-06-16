package com.PxL.practice_test

//01.Variable`
/* 변수는 var/val 로 선언 가능
1. variable - 변화가 가능한 변수 (mutable)
2. value    - 변화가 불가능한 변수 (immutable) 상수.

코틀린은 변수 선언할때 (선언하지 않으면) 스스로 자료형을 선택함 */

//변수 선언 방법1
var number = 10

//변수 선언 방법 2
//var / val 변수 : 자료형 = 값
var number1 : Int = 20
var hello1 : String = "Hello"
var point1 : Double = 3.4

fun main(array: Array<String>){
    number = 20
//        number = 20.5 // 정수형으로 변수가 정해져있음 > error
}