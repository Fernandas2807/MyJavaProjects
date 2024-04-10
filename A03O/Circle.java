class Circle
{
	static double area()
{
	final double pi=3.142;
	int r=4;
	double a=pi*r*r;
	return a;
}
public static void main(String[]args)
	{
		double x=area();
		System.out.println(x);
	}
}