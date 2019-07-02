package com.songdong.day03.constructor

import scala.beans.BeanProperty

object BeanPropertyDemo {
  def main(args: Array[String]): Unit = {
  val car = new Car
    car.name="baoma"
    //使用@BeanProperty 自动生成getter和setter方法

    car.getName()
    car.setName("benchi")
    println(car.getName)
  }
}

class Car() {
  @BeanProperty var name: String = null
}