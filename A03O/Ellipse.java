class Ellipse
{
	static double area()
	{
		int a=6;
		int b=5;
		double pi=3.142;
		double c=pi*a*b;
		return c;
	}
	public static void main(String[]args)
	{
		double x=area();
		System.out.println(x);
	}
}