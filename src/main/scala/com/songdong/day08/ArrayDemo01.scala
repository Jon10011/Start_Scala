package com.songdong.day08

object ArrayDemo01 {
  def main(args: Array[String]): Unit = {
    /**
      * [Int]表示范型
      * [Any]表示该数组可以存放任意类型
      * 在没有赋值的情况下，各元素值为0
      */
    //定长数组
    val arr01 = new Array[Int](4)
    //数组长度
    println(arr01.length)

    println(s"arr01(0)=${arr01(0)}")
    //数组遍历
    for (i <- arr01) {
      println(i)
    }
    println("------------------------------")
    arr01(3) = 10
    for (i <- arr01) {
      println(i)
    }
  }
}
