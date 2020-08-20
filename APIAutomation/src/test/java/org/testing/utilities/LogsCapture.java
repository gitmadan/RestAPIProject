package org.testing.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogsCapture {

	public static void takeLogs(String classname, String message) {
		
		 DOMConfigurator.configure("../APIAutomation/LogsLayout.xml"); 
		 Logger l =		 Logger.getLogger(classname); 
		 l.info(message);
		 
	}

}
