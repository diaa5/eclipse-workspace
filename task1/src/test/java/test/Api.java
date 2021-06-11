package test;

import org.testng.annotations.Test;

import com.shaft.api.RestActions;
import com.shaft.api.RestActions.RequestType;
import com.shaft.validation.Assertions;
import com.shaft.validation.Assertions.AssertionComparisonType;
import com.shaft.validation.Assertions.AssertionType;

import io.restassured.response.Response;

public class Api {

    @Test
    public void validateallposts() 
    {
	RestActions apiObject = new RestActions("https://jsonplaceholder.typicode.com");
	Response users = apiObject.performRequest(RequestType.GET, 200, "/posts");

	Assertions.assertEquals("qui est esse", RestActions.getResponseBody(users), AssertionComparisonType.CONTAINS,
		AssertionType.POSITIVE);

    }
    
    @Test
    public void validatepostbyid() 
    {
	RestActions apiObject = new RestActions("https://jsonplaceholder.typicode.com");
	Response users = apiObject.performRequest(RequestType.GET, 200, "/posts/4");

	Assertions.assertEquals("eum et est occaecati", RestActions.getResponseBody(users), AssertionComparisonType.CONTAINS,
		AssertionType.POSITIVE);
    }
    

}