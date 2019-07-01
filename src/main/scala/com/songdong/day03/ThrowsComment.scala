package com.songdong.day03

object ThrowsComment {
  def main(args: Array[String]): Unit = {
    f1()
  }
  //使用注解处理异常
  @throws(classOf[NumberFormatException])
  def f1()={
    "abc".toInt
  }
}
