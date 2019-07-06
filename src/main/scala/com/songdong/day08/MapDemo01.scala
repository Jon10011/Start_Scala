package com.songdong.day08

import scala.collection.mutable

object MapDemo01 {
  def main(args: Array[String]): Unit = {
    /**
      * Map--映射
      * 创建映射
      */
    //默认创建不可变map---有序
    //key-value 类型支持Any
    //底层每对key-value 对应都是一个Tuple2类型
    val map1 = Map("Alic" -> 10, "Bob" -> 20, "beijing" -> "北京")
    println(s"不可变有序的Map1:$map1")

    //创建可变映射Map---无序
    val map2 = mutable.Map("Alic" -> 10, "Bob" -> 20, "beijing" -> "北京")
    //添加
    map2("name") = "Jon" //存在则更新，不存在则添加
    map2 += ("name2" -> "jack") //单个
    map2 += ("name3" -> "jeam", "name4" -> "json") //多个
    //删除
    map2 -= ("name2") //单个
    map2 -= ("name2", "name3") //多个 key不存在时不会报错
    println(s"可变无序的Map2:$map2")

    //创建空的映射
    val map3 = new mutable.HashMap[String, Int]
    println(s"空的Map:$map3")

    //对偶元祖
    val map4 = mutable.Map(("Alic", 10), ("Bob", 20), ("beijing", "北京"))
    println(s"对偶元祖创建的Map4：$map4")

    /**
      * 取出元素
      */
    //1、key
    println(map4("Alic"))

    //2、contains检查key是否存在
    if (map4.contains("Alic")) {
      println(s"key存在，值=${map4("Alic")}")
    } else {
      println(s"key不存在")
    }

    //3、使用map.get(key).get取值 存在返回Some。get可以取出Some的值
    println(map4.get("Alic").get)

    //4、getOrElse()取值
    println(map4.getOrElse("Alic1", "不存在Alic1"))

    /**
      * Map遍历
      */
    for ((k, v) <- map4) println(s"key:$k 对应的value是$v")
    for (k <- map4.keys) println(k) //key
    for (v <- map4.values) println(v) //value
    for (v <- map4) println(v) //Tuple2


  }
}
