package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	
	Logger logger= LogManager.getLogger(Log4jDemo.class);

	public static void main(String[] args) {
		
        System.out.println("Hello...");
	}

}
