package com.rehi.harman.main

import com.rehi.harman.logger.loggerGlobal

import com.typesafe.scalalogging.slf4j.LazyLogging
import com.rehi.harman.sparkManager.SparkManager


object TransformationEngine extends App {
  
  val logger = loggerGlobal.getLogger
  
  logger.info(s"THIS IS WORKING")
  logger.info("TRANSFORMATION ENGINE STARTED")
  
  val sc = SparkManager.getSparkSession.sparkContext
  
  val sql = SparkManager.getSparkSession.sqlContext

  val readFile = sql.read.json(sc.wholeTextFiles("C:\\Users\\drehi\\git\\JsonParser\\src\\main\\resources\\test.json", 1).values)
  
  readFile.show(false)
  
}
