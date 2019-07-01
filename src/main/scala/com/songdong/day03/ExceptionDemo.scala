package com.songdong.day03

object ExceptionDemo {

  def main(args: Array[String]): Unit = {
    try {
      var r = 10 / 0
    } catch {
      /**
        * 只能有一个catch
        * 可以有多个case，匹配多种异常
        * =>关键富豪，后面表示对该异常处理的代码块
        */
      case ex: ArithmeticException => println("捕获了除数为0的异常")
      case ex: Exception => println("捕获了异常")
    } finally {
      //最终要执行的代码
      println("scala finally")
    }
    println("ok  继续执行～～～")
  }

}
