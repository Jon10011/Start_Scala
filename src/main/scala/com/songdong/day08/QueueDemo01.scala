package com.songdong.day08

import scala.collection.mutable

object QueueDemo01 {
  def main(args: Array[String]): Unit = {
    //创建可变队列
    val queue = new mutable.Queue[Int]
    println(queue)

    //队列增加元素
    queue += 1
    println(queue)
    queue ++= List(2, 3, 4) //默认加载队列后面
    println(queue)

    //queue += List(10,2)//Any

    //出列-删除
    //dequeue 从队列头部取出元素，queue队列本身发生变化
    val queueElement = queue.dequeue()
    println(queue)

    //入列
    //enqueue 入列，默认从队列的尾部加入
    queue.enqueue(444, 122, 333, 444) //队列元素可重复
    println(queue)


    //返回队列元素---对queue本身没有影响
    //获取队列第一个元素
    println(queue.head)

    //获取最后一个元素
    println(queue.last)

    //获取队尾的元素，第一个元素以外剩下的元素
    println(queue.tail)
    println(queue.tail.tail)//...
  }
}
