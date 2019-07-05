package com.songdong.day07

object ImplictDemoClass05 {
  def main(args: Array[String]): Unit = {
    //隐式类
    //当在该隐式类的作用域范围穿件MySQL1的实例时，该隐式类就会生效
    implicit class DB1(val m: MySQL1) {
      def addSuffix(m:String): String = {
        m + " Jon"
      }
    }
    //创建一个MySQL1的实例
    val mySQL1 = new MySQL1
    mySQL1.helloMySQL()
    println(mySQL1.addSuffix("hhhhhhh"))

    implicit def f2(d:Double):Int={
      d.toInt
    }

    def test01(n1:Int)={
      println(s"ok-->>$n1")
    }
    test01(10.1)
  }
}

class MySQL1 {
  def helloMySQL(): Unit = {
    println("hello MySQL")
  }
}