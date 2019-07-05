package com.songdong.day07

object ImplictDemo01 {
  def main(args: Array[String]): Unit = {

    //隐式转换函数 Double->Int
    //隐式函数应当在作用域内生效，只能有一个匹配
    implicit def f1(d: Double): Int = {
      d.toInt
    }

    implicit def f2(d1:Float): Int ={
     d1.toInt
    }
    val num: Int = 2.1
    val num2:Int = 2.1f
    println(s"num=$num")
  }
}
