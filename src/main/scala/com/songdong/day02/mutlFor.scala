package com.songdong.day02

import scala.io.StdIn

object mutlFor {
  def main(args: Array[String]): Unit = {
    val classNum = 3
    val stuNum = 5
    var score = 0.0
    var totalSource = 0.0
    var passNUm = 0

    for (i <- 1 to classNum) {
      var classScore = 0.0
      for (j <- 1 to stuNum) {
        print(s"请输入${i}个班级的第${j}个学生的成绩\n")
        score = StdIn.readDouble()
        classScore += score
        if (score >= 60) {
          passNUm += 1
        }

      }
      totalSource += classScore
      println(s"第${i}班级的平均分为${classScore / stuNum}")
    }
    printf("所有班级的平均分为%.2f\n", totalSource / (stuNum * classNum))
    printf("所有班级几个人数为%d\n", passNUm)

  }
}
