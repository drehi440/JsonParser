package com.rehi.harman.sparkManager

import org.apache.spark.sql.SparkSession
import com.rehi.harman.logger.loggerGlobal
import org.apache.spark.SparkConf
import org.apache.spark.SparkConf

object SparkManager {
  loggerGlobal.getLogger.info("Into SparkManager")

  val warehouseLocation = "file:///C:/Users/drehi/git/JsonParser/spark-warehouse/spark-warehouse"
  
  val spark = SparkSession.builder
    .config(new SparkConf)
    .config("spark.sql.warehouse.dir", warehouseLocation)
    .master("local")
    .appName("JSON PARSER")
    .enableHiveSupport()
    .getOrCreate()

  loggerGlobal.getLogger.info("Initialized SparkSession")

  def getSparkSession = spark
}