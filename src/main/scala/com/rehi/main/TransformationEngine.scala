package com.rehi.main

import com.rehi.logger.loggerGlobal

import com.typesafe.scalalogging.slf4j.LazyLogging
import com.rehi.sparkManager.SparkManager

import org.apache.spark.sql.Row
import org.apache.spark.sql.hive._
import org.apache.spark.sql.functions._

object TransformationEngine extends App {
  
  val logger = loggerGlobal.getLogger
  
  logger.info(s"THIS IS WORKING")
  logger.info("TRANSFORMATION ENGINE STARTED")
  
  val sc = SparkManager.getSparkSession.sparkContext
  
  val sql = SparkManager.getSparkSession.sqlContext
  
  import sql.implicits._

  val readFile = sql.read.json(sc.wholeTextFiles("C:\\Users\\drehi\\git\\JsonParser\\src\\main\\resources\\test.json", 1).values)

  val readFileDates = readFile.select(explode(readFile("dates")))
  val readFileRenameToDates = readFile.select(explode(readFile("dates"))).toDF("dates")
  
  val readFileColumn = readFile.select(explode(readFile("content")))
  
  val readFileColumnRenameToCol = readFile.select(explode(readFile("content"))).toDF("content")
  
  val readFileColumnRenameToColField = readFileColumnRenameToCol.select("content.foo","content.bar")
  
  
  
  //to show the full content of the column
  readFile.show(false)
  readFileDates.show(false)
  readFileRenameToDates.show(false)
  readFileColumn.show(false)
  readFileColumnRenameToCol.show(false)
  readFileColumnRenameToColField.show(false)
}
