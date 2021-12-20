package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wrapper.ProjectSpecificWrapper;

public class TC003_EditLead extends ProjectSpecificWrapper {
	
	@BeforeTest
	public void setData() {
		excelfile = "TC002_editLead";
	}
	
	@Test(dataProvider = "getData")
	public void createLead(String uName, String pwd) {
	
		new loginPage()

}
}