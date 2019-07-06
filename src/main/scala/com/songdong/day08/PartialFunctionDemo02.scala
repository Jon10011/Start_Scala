package com.songdong.day08

object PartialFunctionDemo02 {
  def main(args: Array[String]): Unit = {
    val list2 = List(1, 2, 3, 4, 1.2, 1.9f, "Jon")

    /**
      * 偏函数的简化写法
      */
    def partailFun2: PartialFunction[Any, Int] = {
      //简写case语句
      case i: Int => i + 1
      case j: Double => (j * 2).toInt
    }

    val list3 = list2.collect(partailFun2)
    println(list3)

    //第二种简写
    val list4 = list2.collect {
      case i: Int => i + 1
      case j: Double => (j * 2).toInt
      case f: Float => (f * 5).toInt
    }
    println(list4)
  }
}
