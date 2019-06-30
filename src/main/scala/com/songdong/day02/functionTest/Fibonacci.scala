package com.songdong.day02.functionTest

object Fibonacci {
  def main(args: Array[String]): Unit = {
    println(testFib(3))
    println(f(3))
    println(peach(3))

  }

  //斐波那契数列
  def testFib(n: Int): Int = {
    if (n == 1 || n == 2) {
      1
    } else {
      testFib(n - 1) + testFib(n - 2)
    }
  }

  //求函数f(1=3),f(n)=2 * f(n - 1) + 1
  def f(n: Int): Int = {
    if (n == 1) {
      3
    } else {
      2 * f(n - 1) + 1
    }
  }

  //猴子吃桃
  def peach(day: Int): Int = {
    if (day == 10) {
      1
    } else {
      (peach(day + 1) + 1) * 2
    }
  }

}
