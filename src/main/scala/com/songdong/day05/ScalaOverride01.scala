package com.songdong.day05

object ScalaOverride01 {
  def main(args: Array[String]): Unit = {
    println("hello~")
  }
}

//在A2中有一个抽象的字段（属性）
//1。抽象的字段（属性）：就是没有初始化的字段（属性）
//2。当一个类含有抽象属性时，则该类需要标记为abstract
//3。对于抽象的属性在底层不会生成对应的属性声明，而是生成两个对应的抽象方法（name ，name_$eq）
//
abstract class A2 {
  var name: String//抽象
  var age:Int = 20
}

class Sub_A2 extends A2 {
  //1. 如果我们在子类中去重写父类的抽象属性，本质是实现了抽象方法
  // 2. 因此这里我们可以写 override ，也可以不写
  override var name: String = ""

  //3。var只能重写另有个抽象的var属性
  //override var age:Int = 30   错误
}