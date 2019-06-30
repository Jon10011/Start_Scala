package com.songdong.day02.functionTest

object methodFunctin {
  def main(args: Array[String]): Unit = {
    val sum = new Sum
    println(sum.sum(10, 20))

    //方法转函数
    val f1 = sum.sum _
    println("f1=" + f1)
    println("f1=" + f1(20, 30))

    //函数求和
    val f2 = (n1: Int, n2: Int) => {
      n1 + n2 //函数体
    }
    //val f2 = (n1: Int, n2: Int) => n1 + n2 //函数体
    println("f2="+f2)
    println("f2="+f2(11,11))
  }

}

class Sum {
  def sum(n1: Int, n2: Int): Int = {
    n1 + n2
  }
}