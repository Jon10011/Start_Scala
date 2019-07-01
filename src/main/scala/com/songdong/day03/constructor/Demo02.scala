package com.songdong.day03.constructor

object Demo02 {
  def main(args: Array[String]): Unit = {
    val a = new A
    /**
      * 默认调用A主构造器的方法，A继承了B，因此在辅助构造器之前会执行主构造器
      * 执行结果 BBBBBB
      */

    val b = new A("Jon")

    /**
      * 先执行主构造器的方法，再执行辅助构造器的方法
      * 执行结果：
      * BBBBBBBB
      * BBBBBBBB
      * AAAAA this(name:String)
      */
  }

}

class B {
  println("BBBBBBBB")
}

class A extends B {
  def this(name: String) {
    this //根本目的是为了实现子类与父类的继承关系
    print("AAAAA this(name:String)")
  }
}