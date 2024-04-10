class Gmail
{ 
	static void sign()
	{
		System.out.println("Sign_In");
	}
    static void login()
	{
		System.out.println("Login");
	}
	static void home()
	{
		System.out.println("Welcome to Homepage");
	}
	static void msg()
	{
		System.out.println("Send Emails");
	}
	public static void main(String[]args)
	{
		sign();
		login();
		home();
		msg();
		logout();

	}
	static void logout()
	{
		System.out.println("Logout");
	}

}