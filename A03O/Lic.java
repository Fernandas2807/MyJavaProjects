class Lic
{
	static void sign()
	{
		System.out.println("Sign_In");
	}
	static void login()
	{
		System.out.println("Login");
	}
	public static void main(String[]args)
	{
		sign();
		login();
		home();
		apply();
		approval();
		logout();
	}
	static void home()
	{
		System.out.println("Welcome to homepage");
	}
	static void apply()
	{
		System.out.println("Apply the loan");

	}
	static void approval()
	{
		System.out.println("Loan Approved");
	}
	static void logout()
	{
		System.out.println("Logout in this protal");
	}
}