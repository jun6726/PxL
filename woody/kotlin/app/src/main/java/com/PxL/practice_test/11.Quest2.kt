package com.PxL.practice_test

// 1) 사칙 연산을 수행하는 클래스
// 2) 은행 계좌 만들기
//      - 계좌 생성 기능 ( 이름, 생년월일 )
//      - 잔고를 확인 하는 기능
//      - 출금 기능
//      - 예금 기능

// 3) TV 클래스
//      - on/off 기능
//      - 채널을 돌리는 기능
//      - 초기 채널은 (S사 M사 K사 3개)

fun main(array: Array<String>) {
    val calculator :Calc = Calc()
    calculator.plus(15,30)
    calculator.minus(15, 30)
    calculator.multiple(15, 3)
    calculator.sub(15,3)

    val account :Account = Account()
    account.create("최연준", 950417)
    account.saveMoney(25000)
    account.loadMoney(5000)
    account.moneyLookup()

}

class Calc() {
    var sum = 0;
    fun plus(num1 :Int, num2 :Int) {
        sum = num1 + num2
        println(sum)
    }

    fun minus(num1 :Int, num2 :Int) {
        sum = num1 - num2
        println(sum)
    }

    fun multiple(num1 :Int, num2 :Int) {
        sum = num1 * num2
        println(sum)
    }

    fun sub(num1 :Int, num2 :Int) {
        sum = num1 / num2
        println(sum)
    }
}

class Account {

    var myAccount :String = ""
    var myMoney :Int = 0

    fun create(name :String, birth :Int) {
        myAccount = name + birth
        myMoney = 0
    }

    fun moneyLookup() {
        println("내 계좌번호는 $myAccount 입니다. 잔고는 $myMoney 입니다.")
    }

    fun saveMoney(money :Int) {
        myMoney += money
        println("내 계좌 $myAccount 에 $money 원을 입금했습니다.")
    }

    fun loadMoney(money :Int) {
        myMoney -= money
        println("내 계좌 $myAccount 에서 $money 원을 출금했습니다.")
    }
}

class TV() {
    fun turnOnOn() {

    }

    fun turnOff() {

    }

    fun ChanelUp() {

    }

    fun ChanelDown() {

    }

    fun ChanelNumber() {

    }


}