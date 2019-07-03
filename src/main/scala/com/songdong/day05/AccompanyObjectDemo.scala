package com.songdong.day05

object AccompanyObjectDemo {
  def main(args: Array[String]): Unit = {
    //创建三个小孩
    val child0 = new Child("白骨精")
    val child1 = new Child("蜘蛛精")
    val child2 = new Child("黄鼠狼精")
    Child.joinGame(child0)
    Child.joinGame(child1)
    Child.joinGame(child2)
    Child.showNum()
  }
}

//伴生类
class Child(cName: String) {
  var name: String = cName
}

//伴生对象
object Child {
  //用于统计共有多少小孩的属性
  var totalChildNum = 0

  def joinGame(child: Child) = {
    totalChildNum += 1
    println(s"${child.name} 加入游戏")
  }

  def showNum() {
    println(s"共有 $totalChildNum 个小孩加入游戏")
  }
}