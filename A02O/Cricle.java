class Cricle
{
	static void area(int r)
	{
		final double pi=3.142;
		double a=pi*r*r;
		System.out.println(a);
		return;
	}
	public static void main(String[]args)
	{
		System.out.println("Start");
		area(8);
		System.out.println("End");
	}
}