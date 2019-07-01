package com.songdong.day03.oop

object CatDemo {
  def main(args: Array[String]): Unit = {
    val cat = new Cat
    //属性赋值
    cat.name = "小白"
    cat.age = 10
    cat.color = "白色"
    println(cat.name, cat.age, cat.color)
  }

}

//默认public的类
//属性可以是任意类型，包括可以是一个值类型也可以是一个引用类型
class Cat {
  //定义、声明属性,"_"表示默认值
  //var name: String相当于privat name，同时生成两个public方法，类似getter，setter方法
  var name: String = ""
  var age: Int = _
  var color: String = _ //值类型
  var lover = new Dog //引用类型
  var a = null //Null类型
  var b: String = null //String类型

}

//属性默认值
class Dog {
  var var1: String = _ //null，引用类型默认值也是null
  var var2: Float = _ //0.0
  var var3: Double = _ //0.0
  var var4: Boolean = _ //false
  var var5: Byte = _ //0
}

/**
  * 创建对象时如果希望将子类类型交给父类的引用，则需要写上类型。有继承或者多态的时候也需要加上类型声明
  * ex：val emp = new Emp //emp类型就是Emp
  * val emp :Person = new Emp //emp类型是Person
  */

