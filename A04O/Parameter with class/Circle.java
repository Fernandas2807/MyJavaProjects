class Cir
{
	static void area(int r)
	{
		final double pi=3.142;
		double a=pi*r*r;
		System.out.println(a);
	}
}
class Circle
{
	public static void main(String[]args)
	{	
	Cir.area(6);
    }
}