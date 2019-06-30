package com.songdong.day02

object ForDemo01 {
  def main(args: Array[String]): Unit = {
    var list = List("nihao", "haha", "ssds")
    for (item <- list) println(item)
  }

}
