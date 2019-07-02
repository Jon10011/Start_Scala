package com.songdong.day04.extendsDemo

object Extends01 {
  def main(args: Array[String]): Unit = {
    var student = new Student
    student.name="Jon"
    student.studying()
    student.showInfo()
  }
}

class Person() {
  var name:String=_
  var age:Int=_
  def showInfo(): Unit ={
    println("name="+this.name)
  }
}

class Student extends Person {
  def studying(): Unit = {
    //这里可以使用父类的属性
    println(this.name + "----hhhhhhh")
  }
}