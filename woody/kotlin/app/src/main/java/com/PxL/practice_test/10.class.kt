package com.PxL.practice_test

// 10. Class

// OOP -> Object Oriented Programing (객체지향 프로그래밍)
// 절차지향 프로그래밍

//객체를 만드는 방법
// -



fun main(array :Array<String>) {
    // 클래스를 통해서 실체를 만드는 방법
    // -> 인스턴스화 -> 인스턴스 (객체)
    Car("v8 engine", "big")

    // 클래스는 자료형이 된다
    val bigCar = Car("v8 engine", "big")
    val bigCar1 :Car = Car("v8 engine", "big")

    val number :Int = 10
    val number1 = 20

    val superCar :SuperCar = SuperCar("good engine", "big", "white")

    val normalCar :Car1 = Car1("normalEngine", "normalBody")
    val badCar :Car1 = Car1("badEngine", "badObdy", "badDoor")
    println()
    println(badCar.door)
//    println(normalCar :door)

    val runableCar :RunableCar = RunableCar("simple engin", "body")
    runableCar.drive()
    runableCar.navi("집")
    runableCar.ride()
}

// 클래스 만드는 방법 (1)
class Car(var engine :String, var body :String) {

}

// 클래스 만드는 방법 (2)
class SuperCar {
    var engine :String
    var body :String
    var door :String

    constructor(engine :String, body :String, door:String) {
        println(engine)
        println(body)
        println(door)
        this.engine = engine
        this.body = body
        this.door = door
    }
}

// 클래스 만드는 방법 (3) - 1번 방법의 확장
class Car1(engine :String, body :String) {
    var door :String = ""
    constructor(engine :String, body :String, door :String) : this(engine, body) {
        this.door = door
    }
}

// 클래스 만드는 방법 (4) - 2번 방법의 확장
class Car2 {
    var engine :String = ""
    var body :String = ""
    var door :String = ""

    constructor(engine: String, body :String) {
        this.engine = engine
        this.body = body
    }

    constructor(engine: String, body :String, door :String) {
        this.engine = engine
        this.body = body
        this.door= door
    }
}

class RunableCar(engine :String, body:String) {
    fun ride() {
        println("탑승")
    }

    fun drive(){
        println("달림")
    }

    fun navi(destination :String) {
        println("$destination 으로 목적지가 설정됨")
    }
}