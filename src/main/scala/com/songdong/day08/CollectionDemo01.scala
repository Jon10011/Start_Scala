package com.songdong.day08

object CollectionDemo01 {
  def main(args: Array[String]): Unit = {

    val str = "hello Jon"
    for (item <- str) {
      println(s"item=$item")
    }
    //String 是一个索引集合
    print(s"第一个是${str.charAt(0)}")
  }
}
