package com.songdong.day07

/**
  * 1。当在程序中同时有 隐式值 默认值 传值 则优先级为：传值>隐式值>默认值
  * 2。隐式值匹配时存在唯一性,不能存在二义性
  * 3。不存在隐式值 默认值和传值时，程序报错
  * 4。隐式转换不存在嵌套
  */
object ImplictDemo04 {
  def main(args: Array[String]): Unit = {
    // 当同时有implict和默认值时，隐式值优先级高
    implicit val name: String = "Jon"

    def hello(implicit content: String = "jack") = {
      println(s"hello $content")
    }

    hello //hello Jon
  }
}

object ImplictDemo041 {
  def main(args: Array[String]): Unit = {
    //当隐式参数匹配不到隐式值时，默认值优先级高
    implicit val name: Int = 10

    def hello(implicit content: String = "jack") = {
      println(s"hello $content")
    }

    hello //hello Jack
  }
}

object ImplictDemo042 {
  def main(args: Array[String]): Unit = {
    //当同时存在两个隐式值时，报错，因为隐式值唯一性
    implicit val name2: String = "Json"

    //implicit val name: String = "Jon"
    def hello(implicit content: String = "jack") = {
      println(s"hello $content")
    }

    hello // 报错
  }
}