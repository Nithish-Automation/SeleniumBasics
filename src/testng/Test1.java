package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	@Test(priority = -1 , invocationCount = 2)
	public void Demo() {
		Reporter.log("call", true);
	}
		
		@Test(priority = 1, enabled = false)
		public void Status() {
			Reporter.log("status", true);
		}
			
			@Test(priority = 1)
			public void Chat() {
				Reporter.log("chat", true);
		
		
		
	}
	

}
