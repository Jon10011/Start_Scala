package com.songdong.day02.functionTest

object digui {
  def main(args: Array[String]): Unit = {
    test(4)
  }

  def test(n: Int) {
    if (n > 2) {
    test (n - 1)
  }
    println ("n=" + n)

    /**
      * n=2
      * n=3
      * n=4
      */
  }
}
