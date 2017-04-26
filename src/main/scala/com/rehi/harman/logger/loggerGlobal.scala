package com.rehi.harman.logger

import java.util.logging.Logger
import java.util.logging.Level

object loggerGlobal {
  
  def getLogger(className : String): Logger ={
    val logger = Logger.getLogger(className)
    logger.setLevel(Level.INFO)

    logger
  }
  
}