package com.songdong.day03.constructor

object Demo01 {
  def main(args: Array[String]): Unit = {
    //    val p1 = new Person("jon", 10)
    //    println(p1)
    val p2 = new Person("tom")
    println(p2)
  }

}

//构造器入门
class Person(inName: String, inAge: Int) {
  var name: String = inName
  var age: Int = inAge
  age += 10
  //  println("qqqq")

  //重写toString
  override def toString: String = {
    "name=" + this.name + "\tage=" + this.age
  }

  def this(name: String) {
    //辅助构造器必须在第一行显式调用主构造器，直接或者间接
    this("jon", 10)
    this.name = name //重新赋值
  }
}
