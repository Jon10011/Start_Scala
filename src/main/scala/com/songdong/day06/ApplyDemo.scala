package com.songdong.day06

object ApplyDemo {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3)
    println(list)
    val pig1 = new Pig("xiaoming")
    val pig2 = Pig("xiaohong")
    val pig3 = Pig()
    println(s"pig1.name=${pig1.name}")
    println(s"pig2.name=${pig2.name}")
    println(s"pig3.name=${pig3.name}")

  }
}
//apply
class Pig(pName:String){
  var name:String = pName
}

object Pig{
  def apply(pName: String): Pig = new Pig(pName)

  def apply(): Pig = new Pig("xiaobai")

}