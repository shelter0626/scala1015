package com.atguigu.scalal1015.day01

import scala.io.StdIn

/**
 * Author atguigu
 * Date 2020/3/2 14:15
 */
object String_2 {
    def main(args: Array[String]): Unit = {
        /*val s =
            """你阿法拉圣诞节疯狂拉萨的
爱上了房间爱死了附近
精灵盛典荆防颗粒
               
aaaa
               aq
              """*/
        /*val s =
            """
              |afaf
              |aaa
              |bb
              |ccc
              |""".stripMargin*/
        val date = "2020-03-02"
        val s =
        s"""
          |select
          | *
          |from user
          |where date='$date'
          |""".stripMargin
        println(s)


        val ss =
            """
              |你是水呢
              |哈哈 1
              |我就只到达
              |
              |大大加大
              |""".stripMargin
        println(ss)

    }
}

/*
多行字符串:
    """
    
    """
 


 */
