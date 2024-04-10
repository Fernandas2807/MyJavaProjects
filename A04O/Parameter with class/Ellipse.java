class Elli
{
	static void area(int a,int b)
	{
		final double pi=3.142;
		double c=pi*a*b;
		System.out.println(c);
	}
}
class Ellipse
{
	public static void main(String[]args)
	{
	System.out.println("Start");
	Elli.area(8,24);
	System.out.println("Ends");
    }
}