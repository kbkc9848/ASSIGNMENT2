# Define the root logger with appender file  
log = C:\Users\kondaveetib/log4jfolder  
log4j.rootLogger = DEBUG, FILE  
  
# Define the file appender  
log4j.appender.FILE=org.apache.log4jfolder.FileAppender  
log4j.appender.FILE.File=${log}/log.out  
  
# Define the layout for file appender  
log4j.appender.FILE.layout=org.apache.log4jfolder.PatternLayout  
log4j.appender.FILE.layout.conversionPattern=%m%n  