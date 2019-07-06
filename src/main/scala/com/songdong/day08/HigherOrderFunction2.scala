package com.songdong.day08

object HigherOrderFunction2 {
  def main(args: Array[String]): Unit = {
    /**
      * 说明
      * 1、minusxy是高阶函数，因为它返回一个匿名函数
      * 2、返回的匿名函数 (y: Int) => x - y
      * 3、返回的匿名函数可以使用变量接受
      */

    def minusxy(x: Int) = {
      (y: Int) => x - y
    }

    //分步执行
    //此处f1就是(y: Int) => 2 - y
    val f1 = minusxy(2)
    println(f1(3)) //-1
    println(f1(4)) //-2

    //一步执行
    println(minusxy(2)(3)) //-1

    println(minusxy(2)(4)) //-2
  }
}
