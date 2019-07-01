package com.songdong.Exercise

import scala.io.StdIn

object TestDay0301 {
  def main(args: Array[String]): Unit = {
    println("请输入1--99之间的数")
    var n:Int = StdIn.readInt()
    print99(n)
  }

  def print99(n: Int) = {
    for (i <- 1 to n) {
      for (j <- 1 to i) {
        printf("%d * %d =%d\t",j,i,j*i)
      }
      println()
    }
  }
}
