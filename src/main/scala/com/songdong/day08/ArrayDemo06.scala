package com.songdong.day08

import scala.collection.mutable.ArrayBuffer
import scala.collection._

object ArrayDemo06 {
  def main(args: Array[String]): Unit = {
    val arr = ArrayBuffer("1", "2", "3").toString()
    val javaArr = new ProcessBuilder(arr)
    println(javaArr.command())
  }
}
