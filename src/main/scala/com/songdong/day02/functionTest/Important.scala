package com.songdong.day02.functionTest

object Important {
  /**
    * 1、返回值类型可以是数据类型也可以是引用类型
    * 2、类中可以声明类，方法中可以声明方法
    * 3、形参默认值,使用带名参数修改某一默认值
    * 4、scala默认形参是val，因此无法在函数中修改
    * 5、***递归函数必须明确返回值，因为递归函数在执行之前无法推断出结果类型，即无法使用类型推导
    * 6、支持可变参数：def(args:Int*){} 支持o-多个参数；def(n1:Int,args:Int*){}支持1-多个参数
    * 7、可变形参必须写在参数最后
    */
  def main(args: Array[String]): Unit = {
    val tiger = new Tiger
    val tiger2 = example1(10, tiger)
    println(tiger.name)
    println(tiger2.name)
    println(tiger.hashCode() + " " + tiger2.hashCode())
    println("-------------------------------------")
    println(example5(1, 2))
    println("--------2222-----------------------------")

    def f1(): Unit = {
      println("f1 Ok~~~") //写在main 内部的方法 private final方法
    }

    println("--------333-----------------------------")
    println(sayHi())
    println(sayHi(s2 = "jack"))
    println(sayOk())
    println("--------666-----------------------------")
    println(sum(10,20,30,40,50))
  }

  def example1(n1: Int, tiger: Tiger): Tiger = {
    println("n1=" + n1)
    tiger.name = "Jon"
    tiger
  }

  //return 无效
  def example2(n1: Int, n2: Int) {
    return n1 + n2
  }

  //写了return必须明确返回值类型
  def example3(n1: Int, n2: Int): Int = {
    return n1 + n2
  }

  //类型推导
  def example4(n1: Int, n2: Int) = {
    n1 + n2
  }

  //无返回值
  def example5(n1: Int, n2: Int) {
    n1 + n2
  }

  //省略返回值类型使用类型推导或者Any
  def example6(s: String): Any = {
    s
  }

  def sayOk(): Unit = {
    println("main sayOk~~~")
  }

  def sayHi(s: String = "你好", s2: String = "jon"): Unit = {
    println("main sayOk~~~" + s + s2)
  }

  def sum(n1: Int, args: Int *
  ): Int = {
    println("arg.length=" + args.length)
    var sum = 0
    for (item <- args) {
      sum += item
    }
    sum
  }
}

class Tiger {
  var name = ""
}