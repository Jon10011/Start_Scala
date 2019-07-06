package com.songdong.day08

object ListDemo01 {
  def main(args: Array[String]): Unit = {
    //list 不可变集合
    val list01 = List(1, 2, 3)
    println(list01)
    println(list01(1)) //通过索引访问元素

    //在list最后添加元素
    val list011 = list01 :+ 4
    println(list011)
    //在list前面添加元素
    val list012 = 0 +: list01
    println(list012)

    val list02 = Nil //空集合
    println(list02)

    //::向集合中新建添加元素，集合对象要放置在最右边
    val list021 = 1 :: 2 :: 3 :: 4 :: Nil
    println(list021)

    //:::将集合中的每一个元素加入到集合中
    val list022 = 1 :: 2 :: 3 :: 4 :: list021:::Nil
    println(list022)

  }
}
