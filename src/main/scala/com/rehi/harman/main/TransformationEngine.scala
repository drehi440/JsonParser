package com.rehi.harman.main

import com.rehi.harman.logger.loggerGlobal

import com.typesafe.scalalogging.slf4j.LazyLogging


object TransformationEngine extends App {
  
  val logger = loggerGlobal.getLogger
  
  logger.info(s"THIS IS WORKING")
  
}