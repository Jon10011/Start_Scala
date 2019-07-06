package com.songdong.day08

object ArrayDemo02 {
  def main(args: Array[String]): Unit = {
    /**
      * 使用object Array的apply创建数组
      * 直接初始化数组，这时因为数组中给定了整数和String，所以这数组的范型就是Any
      */
    var arr02 = Array(1, 2, 3, "Jon")
    //遍历
    println("----------一般方式----------")
    for (i <- arr02) {
      println(i)
    }
    //传统方式
    println("----------传统方式----------")
    for (index <- 0 until arr02.length) {
      println(s"arr02[$index]=${arr02(index)}")
    }
  }
}
