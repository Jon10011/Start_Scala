package com.songdong.day05

object ScalaNoNameDemo01 {
  def main(args: Array[String]): Unit = {
    val monster = new Monster {
      override var name: String = _

      override def cry(): Unit = {
        println("2222")
      }
    }
    monster.cry()
  }
}

abstract class Monster {
  var name: String

  def cry()
}
