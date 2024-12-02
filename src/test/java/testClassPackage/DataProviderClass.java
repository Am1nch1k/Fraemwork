

package testClassPackage;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	

	
	@DataProvider(name = "newUserData")
	public static Object[][] getnewUserData() {
		return new Object[][] {
			{"Ramesh", "pass1", "pass1"},
			{"Ramesh", "1234", "1234"},
			{"Ramesh1", "1234", "abcd"}
			};
	}
	
	

	@DataProvider(name ="loginData")
	public static Object[][] getLoginData() {
		return new Object[][] { 
			{"Ramesh", "pass1"},
			{"wrongusername", "pass1"},
			{"Ramesh", "wrongpassword"}
			};
	}
	

	@DataProvider(name ="categories")
	public static Object[][] getCategoryData() {
		return new Object[][] {
			{"bmw"},
			{"honda"},
			{"audi"},
			{"benz"},
			{"Home loan"},
			{"education loan"},
			{"school fee"},
			{"hostel fee"}
			};
	}
	
	

	
	@DataProvider(name ="getExpensesData")
	public static Object[][] getExpensesData() {
		return new Object[][] {
			{"13", "10", "2000", "honda", "200", "Purchaged"},
			{"13", "10", "2000", "bmw", "200", "Purchaged"},
			{"13", "10", "2000", "audi", "200", "Purchaged"},
			{"13", "11", "2010", "benz", "200", "Purchaged"},
			{"13", "11", "2010", "school fee", "200", "Barrowed"},
			{"13", "11", "2010", "education loan", "200", "Barrowed"},
			{"13", "12", "2011", "school fee", "200", "Paid"},
			{"13", "12", "2011", "hostel fee", "200", "Paid"},
			{"13", "10", "2012", "honda", "200", "Purchaged"},
			{"13", "10", "2012", "bmw", "200", "Purchaged"},
			{"13", "10", "2012", "audi", "200", "Purchaged"},
			{"13", "11", "2013", "benz", "200", "Purchaged"}
			};
	}
	

	

	
	@DataProvider(name = "editUserData")
	public static Object[][] getEditUserData() {
		return new Object[][] {
			{"pass1 ", " ", "pass2"}, 
			{"pass1", "pass2", " "}, 
			{" ", "pass2", "pass2"},
			{"pass1", "pass2", "pass3"},
			{"pass1", "pass2", "pass2"}
			};
	}
	
}


