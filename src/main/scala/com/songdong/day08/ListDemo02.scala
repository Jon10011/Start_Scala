package com.songdong.day08

import scala.collection.mutable.ListBuffer

object ListDemo02 {
  def main(args: Array[String]): Unit = {
    // ListBuffer可变list集合，属于序列

    val list0 = ListBuffer[Int](1, 2, 3, 4, 5)

    //动态增加元素
    val list1 = new ListBuffer[Int]
    list1 += 4
    list1.append(5)
    list1.append(5, 6, 7, 8)

    list1 ++= list0
    println(list1)

    val list2 = list0 ++ list1
    val list3 = list0 :+ 6
    println(list2)
    println(list3)

    list3.remove(1)
    println(list3)
  }
}
