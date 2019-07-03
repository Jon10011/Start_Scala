package com.songdong.day05

object ScalaOverride {
  /**
    * 1、def只能重写另一个def
    * 2、val只能重写另外一个val属性或者重写不带参数的def
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {
    val obj1: A1 = new B1
    val obj2: B1 = new B1
    //动态绑定
    println("obj1.age=" + obj1.age + "\tobj2.age=" + obj2.age)
  }
}

class A1 {
  val age: Int = 10 //public age()
}

class B1 extends A1 {
  override val age: Int = 20 //public age()
}