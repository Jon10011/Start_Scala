package com.songdong.day06

object TraitDemo03 {
  def main(args: Array[String]): Unit = {
    println("gogogo")
    val sheep = new Sheep()
    sheep.sayHI()
    sheep.sayHello()
  }
}

//当一个 trait 有抽象方法和非抽象方法时
//1. 一个 trait 在底层对应两个 Trait03.class 接口
//2. 还对应 Trait03$class.class Trait03$class 抽象类
trait Trait02 {
  //抽像方法
  def sayHI()

  //普通方法
  def sayHello(): Unit = {
    println("say hello...")
  }
}
//当 trait 有接口和抽象类是
//1.class Sheep extends Trait02 在底层 对应
//2.class Sheep implements Trait02
//3.当在 Sheep 类中要使用 Trait02 的实现的方法，就通过 Trait02$class
class Sheep extends Trait02 {
  override def sayHI(): Unit = {
    println("hi sheep")
  }
}