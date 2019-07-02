package com.songdong.day04.extendsDemo

object Extends02 {
  //说明
  //1. 在 scala 中，子类继承了父类的所有属性 //2. 但是 private 的属性和方法无法访问 object Extends02 {
  def main(args: Array[String]): Unit = {
    val sub = new Sub()
    sub.sayOk()
  }

}

//父类(基类)
class Base {
  var n1: Int = 1 //public n1() , public n1_$eq()
  protected var n2: Int = 2
  private var n3: Int = 3 // private n3() , private n3_$eq()
  def test100(): Unit = { // 默认 public test100()
    println("base 100")
  }

  protected def test200(): Unit = { // ?
    println("base 200")
  }

  private def test300(): Unit = { //private
    println("base 300")
  }
}

//Sub 继承 Base
class Sub extends Base {
  def sayOk(): Unit = {
    this.n1 = 20 //这里访问本质 this.n1_$eq()
    this.n2 = 40
    println("范围" + this.n1 + " " + this.n2)
    test100() //
    test200() // }
  }
}