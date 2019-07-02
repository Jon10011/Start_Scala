package com.songdong.day03.constructor

object Demo04 {
  def main(args: Array[String]): Unit = {
    var work = new Work("jon")
    work.name//无法访问inName

    var work2 = new Work2("jon")
    work2.name
    work2.inName// 可以访问inName,不能写
    println("ok~~~~~")

    val work3 = new Work3("json")
    work3.inName//读
    work3.inName="jack"//写
  }
}
//1.如果主构造器是Work(inName:String)，那么inName是一个局部变量
class Work(inName:String){
  var name = inName
}

//2.如果主构造器是Work2( val inName:String)，那么inName就是work2 的一个private的只读属性
class Work2(val inName:String){
  var name = inName
}

//3.如果主构造器是Work3( var inName:String)，那么inName就是work3 的一个可读写的属性
class Work3(var inName:String){
  var name = inName
}