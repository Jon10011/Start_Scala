package com.songdong.day08

object TupleDemo01 {
  def main(args: Array[String]): Unit = {

    val tuple1 = (1,2,3,"Jon",4)
    println(tuple1)
    println(tuple1._1)//从1开始
    println(tuple1.productElement(0))//从0开始
    //遍历  元祖迭代器
    for(i <- tuple1.productIterator){
      println(i)
    }
  }
}
