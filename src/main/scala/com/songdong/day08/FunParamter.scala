package com.songdong.day08


object FunParamter {
  def main(args: Array[String]): Unit = {
    def plus(x: Int) = 3 + x

    //函数作为参数
    val result1 = Array(1, 2, 3, 4).map(plus(_))
    println(result1.mkString(","))

    //在scala中函数也是有类型，plus的类型就是<Function1>
    println("plus的类型是：" + (plus _))
  }
}
