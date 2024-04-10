class Method
{
	static void area()
	{
	final double pi=3.142;
	int r=6;
	double a=pi*r*r;
	System.out.println(a);
	}
}
class Circle
	{
		public static void main(String[]args)
		{
			System.out.println("Start");
			Method.area();
			System.out.println("End");
		}
	

}
