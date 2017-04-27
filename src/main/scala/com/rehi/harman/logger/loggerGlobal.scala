package com.rehi.harman.logger

import com.typesafe.scalalogging.slf4j.LazyLogging



object loggerGlobal extends LazyLogging {
  
  def getLogger = logger
  
  
  
}