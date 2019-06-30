package com.songdong.Exercise

import scala.io.StdIn

object demo01 {
  def main(args: Array[String]): Unit = {
    println("请输入月份")
    val month = StdIn.readInt()
    println("请输入年龄")
    val age = StdIn.readInt()
    val ticket = 60
    if (month >= 4 && month <= 10) {
      if (age >= 18 && age <= 60) {
        printf(s"你的票价是${ticket}")
      } else if (age < 18) {
        printf(s"你的票价是${ticket / 2}")
      } else {
        printf(s"你的票价是${ticket / 3}")
      }
    } else {
      if (age >= 18 && age <= 60) {
        printf(s"你的票价是${ticket + 40}")
      } else {
        printf((s"你的票价是${ticket + 20}"))
      }

    }

  }

}
