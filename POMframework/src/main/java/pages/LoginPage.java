package pages;

import wrapper.ProjectSpecificWrapper;

public class LoginPage extends ProjectSpecificWrapper{
	
	public LoginPage enterUserName(String uName){
		enterByName("USERNAME", uName);
		return this;
	}


	public LoginPage enterPassword(String pwd) {
		enterById("password", pwd);
		return this;
	}
	
	public HomePage clickLogin() {
		clickByXpath("//input[@value='Login']");
		return new HomePage();
	}
}
