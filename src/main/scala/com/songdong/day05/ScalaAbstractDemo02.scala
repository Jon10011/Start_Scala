package com.songdong.day05

object ScalaAbstractDemo01 {
  def main(args: Array[String]): Unit = {
    println("ok~~")
    // 默认情况下，一个抽象类是不能实例化的，但是你实例化时，动态的实现了抽象类的所有
    // 抽象方法，也可以先,如下
    val animal = new Animal2 {
      override def sayHello(): Unit = {
        println("ok2")
      }
    }
  }
}

//抽象类
abstract class Animal1 {
  //抽象类中可以有实现的方法
  def sayHi() = {
    println("ok1")
  }
}

abstract class Animal2 {
  def sayHello()

  var food: String
}

//如果一个类继承了抽象类，则它必须实现抽象类的所有抽象方法和抽象属性，除非它自己也声明为 abstract 类
class Cat extends Animal2 {
  override def sayHello(): Unit = {
    println("hahahahaha")
  }

  override var food: String = _
}