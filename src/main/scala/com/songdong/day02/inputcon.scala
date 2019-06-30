package com.songdong.day02

import scala.io.StdIn

object inputcon {
  def main(args: Array[String]): Unit = {
    println("请输入姓名：")
    val name = StdIn.readLine()
    println("请输入年龄：")
    val age = StdIn.readInt()
    println("请输入薪水：")
    val sal = StdIn.readDouble()

    printf("用户信息为 name=%s age=%d sal=%.2f",name,age,sal)
    scala.io.StdIn


  }

}
object cat{
  def sayHi():Unit = {
    println("你好你好啊")
  }
}