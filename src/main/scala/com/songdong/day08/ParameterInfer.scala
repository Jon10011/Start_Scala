package com.songdong.day08

object ParameterInfer {
  def main(args: Array[String]): Unit = {
    /**
      * 类型推断
      */
    val list1 = List(1, 2, 3, 4, 5)
    println(list1.map((x: Int) => x + 1))
    println(list1.map((x) => x + 1))
    println(list1.map(x => x + 1))
    println(list1.map(_ + 1))

    def f1(n1: Int, n2: Int): Int = {
      n1 + n2
    }

    println(list1.reduce(f1)) // 10
    println(list1.reduce((n1: Int, n2: Int) => n1 + n2)) //10
    println(list1.reduce((n1, n2) => n1 + n2)) //10
    println(list1.reduce(_ + _)) //10


  }

}
