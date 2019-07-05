package com.songdong.day07

object ImplictDemo03 {
  def main(args: Array[String]): Unit = {
    //隐式值
    implicit val str1: String = "Jon"

    //隐式参数
    def hello(implicit name: String): Unit = { //hello$1
      println(s"hello $name")
    }

    hello //调用hello$1 使用隐式值时不要使用（）
  }
}
