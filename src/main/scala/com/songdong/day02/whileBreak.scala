package com.songdong.day02

import util.control.Breaks._

object whileBreak {
  def main(args: Array[String]): Unit = {
    test2()
  }


  def test1() {
    var n = 1
    //breakable 高阶函数，可以接受函数为参数的函数就是高阶函数
    breakable(
      while (n <= 20) {
        println("n=" + n)
        n += 1
        if (n == 10) {
          break()
        }
      }
    )
    println("ok~~~")
  }

  def test2(): Unit = {
    for (i <- 1 to 10 if (i != 2 && i != 3)) {
      println("i=" + i)
    }
  }
}
