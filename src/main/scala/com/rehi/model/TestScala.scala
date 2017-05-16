package com.rehi.model

object TestScala {
    
  def main(args: Array[String]): Unit = {

    val a = "Hello, World"
  
    println(a.getClass.getName)
    println(a.length())
    
    
    "hello".foreach(println)
  }
  
}