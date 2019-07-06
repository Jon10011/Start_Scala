package com.songdong.day08

object PartialFunctionDemo01 {
  def main(args: Array[String]): Unit = {
    val list1 = List(1, 2, 3, 4, "Jon")
    //要求返回列表数字+1
    //方式1，filter
    //方式2，模式匹配 match
    //方式3，偏函数

    /**
      * 说明：
      * 1、PartialFunction[Any,Int] 表示便函数接收的参数类型是Any，返回的类型是Int
      * 2、isDefinedAt(x: Any):如果返回true就会去调用apply 构建对象的实例，如果是false，则过滤
      * 3、apply构造器对传入的值+1并返回（新的集合）
      */
    val partialFun = new PartialFunction[Any, Int] {
      override def isDefinedAt(x: Any): Boolean = x.isInstanceOf[Int]

      override def apply(v1: Any): Int = {
        v1.asInstanceOf[Int] + 1
      }
    }
    //使用
    // 如果使用偏函数则map不支持便函数，应该使用collect
    /**
      * 执行流程：
      * 1、遍历list1所有元素
      * 2、调用if(partailFun - isDefinedAt(list1元素)){partailFUn -apply(list1元素)}
      * 3、每得到一个element 放入新的集合，最后返回
      */
    val list2 = list1.collect(partialFun)
    println(list2)
  }
}
