package com.songdong.day03

object ThrowDemo {
  def main(args: Array[String]): Unit = {
//    val res = test()
//    println(res.toString)
    //需要处理异常保证代码可以在异常后继续执行
    try{
      test()
    }catch {
      case  ex:Exception => println("捕获到异常"+ex.getMessage)
    }finally {

    }
    println("ok~~~")
  }

  def test():Nothing={
    throw new Exception("-----出现异常1")
  }
}
