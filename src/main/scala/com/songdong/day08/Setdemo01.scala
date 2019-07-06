package com.songdong.day08

import scala.collection.mutable

object Setdemo01 {
  def main(args: Array[String]): Unit = {
    //创建集合--默认不可变
    val set01 = Set(1,2,3) //不可变
    println(set01)
    val set02 = mutable.Set(1,2,3)//可变
    println(set02)

    println(set02.max)
  }
}
