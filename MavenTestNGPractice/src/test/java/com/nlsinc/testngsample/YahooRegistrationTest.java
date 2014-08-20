package com.nlsinc.testngsample;

import org.testng.annotations.*;

public class YahooRegistrationTest {
	
	@Test(dataProvider = "registerData")
	//#times test will be called = #rows in return array from registerData method
	public void testRegister(String username, String password, String email, String city){
		//selenium code to open browser and register
		System.out.println("Username: " + username + "; Password: " + password + "; Email: " + email + "; City: " + city);
	}
	
	@DataProvider
	public Object[][] registerData(){
		//rows- number of times test has to run
		//columns- number of parameters
		Object[][] data = new Object[3][4];
		data[0][0] = "u1";
		data[0][1] = "p1";
		data[0][2] = "e1";
		data[0][3] = "c1";
		data[1][0] = "u2";
		data[1][1] = "p2";
		data[1][2] = "e2";
		data[1][3] = "c2";
		data[2][0] = "u3";
		data[2][1] = "p3";
		data[2][2] = "e3";
		data[2][3] = "c3";
		
		return data;
		
	}

}
