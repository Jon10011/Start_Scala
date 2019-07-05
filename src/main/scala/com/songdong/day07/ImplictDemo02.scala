package com.songdong.day07

object ImplictDemo02 {

  //隐式转换函数
  implicit def f(mysql: MySQL): DB = {
    new DB
  }

  def main(args: Array[String]): Unit = {
    val mySQL = new MySQL
    mySQL.insert()
    mySQL.delete() //通过隐式转换增加对象的功能
    mySQL.update()
  }
}

class MySQL {
  def insert() = {
    println("insert")

  }
}

class DB {
  def delete(): Unit = {
    println("delete")
  }

  def update(): Unit = {
    println("update")
  }
}