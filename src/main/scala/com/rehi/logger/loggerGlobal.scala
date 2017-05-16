package com.rehi.logger

import com.typesafe.scalalogging.slf4j.LazyLogging



object loggerGlobal extends LazyLogging {
  
  def getLogger = logger
  
  
  
}