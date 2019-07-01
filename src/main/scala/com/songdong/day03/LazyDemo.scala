package com.songdong.day03

object LazyDemo {
  //惰性函数，在使用前才会执行
  def main(args: Array[String]): Unit = {
    lazy val res = sum(10,20)
    println("------------------")
    println("res="+res)//在使用res前才开始执行
  }

  def sum(n1: Int, n2: Int): Int = {
    println("sum()执行了。。。。")
    return n1 + n2
  }
}
