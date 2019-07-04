package com.songdong.day06

object AddTraits {
  def main(args: Array[String]): Unit = {
    //说明
    //1. 创建 MySQL4 实例时，动态的混入 DB4 和 File4
    //研究第一个问题，当我们创建一个动态混入对象时，其顺序是怎样的 //总结一句话
    //Scala 在叠加特质的时候，会首先从后面的特质开始执行(即从左到右) //1.Operate4...
    //2.Data4
    //3.DB4
    //4.File4
    val mysql = new MySQL4 with DB4 with File4
    println(mysql)
    //研究第 2 个问题，当我们执行一个动态混入对象的方法，其执行顺序是怎样的
    //顺序是，(1)从右到左开始执行 , (2)当执行到 super 时，是指的左边的特质 (3) 如果左边没有特质 了，则 super 就是父特质

    //1. 向文件"
    //2. 向数据库
    //3. 插入数据 100
    mysql.insert(100)
  }
}

trait Operate4 { //特点 println("Operate4...")
  def insert(id: Int) //抽象方法
}

trait Data4 extends Operate4 { //特质，继承了 Operate4
  println("Data4")

  override def insert(id: Int): Unit = { //实现/重写 Operate4 的 insert
    println("插入数据 = " + id)
  }
}

trait DB4 extends Data4 { //特质，继承 Data4
  println("DB4")

  override def insert(id: Int): Unit = { // 重写 Data4 的 insert

    println("向数据库")
    super.insert(id)
  }
}

trait File4 extends Data4 { //特质，继承 Data4
  println("File4")

  override def insert(id: Int): Unit = { // 重写 Data4 的 insert
    println("向文件")
    super.insert(id) //调用了 insert 方法(难点)，这里 super 在动态混入时，不一定是父类
  }
}

class MySQL4 {} //普通类