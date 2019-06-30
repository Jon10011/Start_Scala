package com.songdong.day01

object printDemo {
  def main(args: Array[String]): Unit = {
    var str1: String = "hello"
    var str2: String = "world"
    println(str1 + str2)
    var name: String = "Jon"
    var age: Int = 10
    var sal: Float = 10.23f
    var height: Double = 180.22
    printf("名字=%s 年龄=%s 薪水=%.2f 身高%.3f", name, age, sal, height)
    println(s"个人信息如下：\n名字$name \n年龄$age \n薪水$sal \n身高$height")
    println(s"个人信息如下：\n名字${name} \n年龄${age} \n薪水${sal + 10} \n身高${height * 100}")
    var c1: Char = 97
    println("c1=", c1)
    var a: Int = 2.6.toInt
    println(a)
    var b: Byte = 5
    var s:Short = 3
//    var t:Short = s+b
    var t1 = s+b
    println("T1=",t1)
    var s1:String = "123"
    var s12 = s1.toInt
    println("s12",s12)
  }

}
