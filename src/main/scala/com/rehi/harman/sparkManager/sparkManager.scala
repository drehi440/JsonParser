package com.rehi.harman.sparkManager

import org.apache.spark.sql.SparkSession
import com.rehi.harman.logger.loggerGlobal

object SparkManager {
  loggerGlobal.getLogger.info("Into SparkManager")

  val spark = SparkSession.builder
    .master("local")
    .appName("JSON PARSER")
    .getOrCreate()

  loggerGlobal.getLogger.info("Initialized SparkSession")

  def getSparkSession = spark
}