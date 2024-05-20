package resources;

public class testData {

//	valid reg data
	
	public static String Firstname="Deepu";
	public static String Lastname="Kale";
	public static String Telephone="1234567890";
	public static String Password="Deepu@1210";
	public static String Passwordconfirm="Deepu@1210";
	
	
	public static String Registrationsucessexpect ="Your Account Has Been Created!";
	
//	blank reg data
	
	public static String FirstnameExpected = "First Name must be between 1 and 32 characters!";
	public static String LastnameExpected = "Last Name must be between 1 and 32 characters!";
	public static String emailExpected = "E-Mail Address does not appear to be valid!";
	public static String telephoneExpected = "Telephone must be between 3 and 32 characters!";
	public static String passwordExpected = "Password must be between 4 and 20 characters!";
	public static String priacypolExpected = "Warning: You must agree to the Privacy Policy!";
	public static String emailalertExpected = "If you already have an account with us, please login at the login page.";
	
	
//	login valid data
	

	
	public static String Succesloginexpected ="My Account";
	
	
//	invalid login data
	public static String invalidloginpassword= "Deepu@1210";
	
	public static String invalidloginexpected="Warning: No match for E-Mail Address and/or Password.";
	
	
	
	
	
	
	

	

	

	

	

	

			
			
	
}
