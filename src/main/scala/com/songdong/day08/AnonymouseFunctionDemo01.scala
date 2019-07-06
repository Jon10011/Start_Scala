package com.songdong.day08

object AnonymouseFunctionDemo01 {
  def main(args: Array[String]): Unit = {
    /**
      * 说明
      * 1、不需要写def函数名
      * 2、不需要写返回类型 使用类型推导
      * 3、= 变成 =>
      * 4、如果有多行则需要使用{}
      */
    val triple = (x: Double) => 3 * x
    println(s"triple:${triple(4)}")
  }
}
