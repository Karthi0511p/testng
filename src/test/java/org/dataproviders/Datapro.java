package org.dataproviders;

import org.testng.annotations.DataProvider;

public class Datapro {
	@DataProvider(name="user")
	private Object[][] data() {
		Object[][] ob=new Object[][] {
			{"karthi0511@gmail.com","5475"},
			{"sankar@gmail.com","8742"},
			{"ravi@gmail.com","8874"}
		};
		return ob;
		
	}
	@DataProvider(name="data")
	private Object[][] recever() {
       
		Object[][] re=new Object[][] {
			{"kumar","2255"},
			{"deva","1234"},
			{"ran","5923"}
			
		};
		return re;


	}
	
	

}
