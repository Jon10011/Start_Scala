package com.songdong.day10

object WordCount {
  def main(args: Array[String]): Unit = {
    val lines = List("heihei heihei songdong wanshang hao a ", "Jon ni zai gan shdengme wanshang hao a heihei")
    //val res1 = lines.flatMap((s: String) => s.split(" "))
    /**
      * 扁平化
      */
    val res1 = lines.flatMap(_.split(" "))
    println(s"res1=${res1}")

    /**
      * 对偶list
      */
    //val res2 = res1.map((s: String) => (s, 1))
    val res2 = res1.map((_, 1))
    println(s"res2=${res2}")

    /**
      * 分组
      */
    //val res3 = res2.groupBy((x: (String, Int)) => x._1)
    val res3 = res2.groupBy(_._1)
    println(s"res3=${res3}")
    /**
      * 对元祖统计大小
      */
    val res4 = res3.map((x: (String, List[(String, Int)])) => (x._1, x._2.size))
    //res3.map(x => (x._1, x._2.size))
    //val res4 = res3.map(x => (_._1, _._2.size)) ？？？
    println(s"res4=${res4}")
    /**
      * 排序
      */
    val res5 = res4.toList.sortBy(_._2).reverse
    println(s"res5=$res5")

    /**
      * 组合简写
      */
    println(lines.flatMap(_.split(" ")).map((_,1))
      .groupBy(_._1).map((x: (String, List[(String, Int)])) => (x._1, x._2.size))
      .toList.sortBy(_._2).reverse)
  }
}
