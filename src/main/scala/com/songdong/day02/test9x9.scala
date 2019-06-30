package com.songdong.day02

object test9x9 {
  def main(args: Array[String]): Unit = {
    // 打印九九乘法表
    val num = 9
    for (i <- 1 to num) {
      for (j <- 1 to i) {
        print(s"${j}*${i}=${j * i} \t")
      }
      println()
    }
  }
}
