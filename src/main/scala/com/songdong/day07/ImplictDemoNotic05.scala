package com.songdong.day07

object ImplictDemoNotic05 {
  def main(args: Array[String]): Unit = {
    //1。隐式转换不能有二义性
    //2。隐式转换不存在嵌套使用

    implicit def f(d:Double):Int={
      d.toInt
      //val num:Int=2.3//底层f1$1(2.3)  形成递归  报错
    }

    val num1:Int = 2.33
    println(s"$num1")
  }
}
