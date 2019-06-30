package com.songdong.day02

object ForDemo02 {
  def main(args: Array[String]): Unit = {
    //until
    val start = 1
    val end = 10
    for (item <- start until end) {
      println(s"hello scala${"-->>>" + item}")
    }
    println("-------------------------------------")
    for (i <- 1 to 3 if i != 2) {
      println(i)
    }
    println("-------------------------------------")
    for (i <- 1 to 10; j = i + 1) {
      println(j)
    }
    println("-------------------------------------")
    for (i <- 1 to 3; j <- 1 to 3) {
      println(s"${i}+${j}=" + (i + j))
    }
    println("-------------------------------------")
    //yield将每次循环的值加入到集合vector中，返回给res
    val res = for (i <- 1 to 10) yield i
    print(res)
    val res1 = for (i <- 1 to 10) yield {
      if (i % 2 == 0) {
        s"${i}是偶数"
      } else {
        s"${i}不是偶数"
      }
    }
    println(res1)
    println("-------------------------------------")
    for {
      i <- 1 to 3
      j <- 1 to 3
    } {
      println(s"${i}+${j}=", i + j)
    }
    println("-----step for demo1--------------------------------")
    for (i <- Range(1, 10, 2)) {
      println(s" 第${i}次输出" + i)
    }
    println("-----step for demo2--------------------------------")
    for (i <- 1 to 10 if i % 2 == 1) {
      println(s" 第${i}次输出" + i)
    }
  }
}
