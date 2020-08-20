package ResponseValidation;

import org.testing.TestScripts.PostRequestTC;
import org.testing.runner.TCRunnerClass;
import org.testing.utilities.LogsCapture;

import com.jayway.restassured.response.Response;

public class ResponseStatusCodeValidation {
	
	public static void responseStatusCode(Response res, int expectedStatusCode)
	
	{
	if(res.getStatusCode()==expectedStatusCode)	
	{
		
		System.out.println("Status code is matching");
		
	}
	else
	{
		String msg=" TC failed as Status code is not matching " +expectedStatusCode+ " is expected but actual is " +res.getStatusCode();
		LogsCapture.takeLogs("PostRequestTC", msg);
		System.out.println("Status code  is not matching");
	}
	}
}
