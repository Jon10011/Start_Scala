//package com.songdong.day04.scalapackage
//
//object packageImport {
//
//}

package com.songdong { // 包 com.songdong
  package day04 { //包 day04
  class Person { //表示在com.songdong.day04下创建了Person的class
    val name = "Jon"

    def play(message: String): Unit = {
      println(this.name + " " + message)
    }
  }

    object Test { //表示在com.songdong.day04// 下创建了Test 类
      def main(args: Array[String]): Unit = {
        println("ok")
      }
    }

  }

}