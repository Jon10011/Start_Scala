package com.songdong.day08

import scala.collection.mutable.ArrayBuffer

object ArrayDemo03 {
  def main(args: Array[String]): Unit = {
    //变长数组 ArrayBuffer
    val arr03 = ArrayBuffer[Int]()
    //追加 每次append在底层会重新分配空间，arr03的内存地址会发生变化，生成新的ArrayBuffer
    arr03.append(1)
    arr03.append(3)
    //修改
    arr03(0) = 2
    println(arr03)
    //删除 ,根据下标
    arr03.remove(1)
    println(arr03)
  }
}
