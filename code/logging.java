import org.apache.log4j.Logger;  
  
import java.io.*;  
import java.sql.SQLException;  
import java.util.*;  
  
public class Example{  
  
   /* Get the class name to be printed on */  
   static java.util.logging.Logger log = Logger.getLogger(Example.class.getName());  
     
   public static void main(String[] args)throws IOException,SQLException{  
      log.debug("Hello this is a debug message");  
      log.info("Hello this is an info message");  
      log.severe("hello this is severe message");
      log.warning("hello this is warning message");
   }  
}  