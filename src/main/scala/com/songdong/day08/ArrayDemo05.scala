package com.songdong.day08

object ArrayDemo05 {
  def main(args: Array[String]): Unit = {
    //多维数组
    //下面数组表示：二维数组中有三个一维数组，每个数组中有四个元素
    var arr = Array.ofDim[Double](3, 4)
    // var arr = Array.ofDim(3, 4)
    for (item <- arr) {
      for (i <- item) {
        print(i + "\t")
      }
      println()
    }
    //指定去取出
    println(arr(1)(1))

    //修改值
    arr(1)(1) = 100
    println(arr)
    println("-----------------------")
    for (item <- arr) {
      for (i <- item) {
        print(i + "\t")
      }
      println()
    }
  }
}
