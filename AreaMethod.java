class AreaMethod
{
	public static void area(float radius)
	{
		float area = 3.142f * radius*radius;
		System.out.println("Area of the circle is "+area);
	}
	public static void area(int width,int height)
	{
		int area = width*height;
		System.out.println("Area of the rectangle is "+area);
	}
	public static void area(int side)
	{
		int area = side*side;
		System.out.println("Area of the square is "+area);
	}
	public static void main(String args[])
	{
		AreaMethod.area(5.2f);
		AreaMethod.area(5,7);
		AreaMethod.area(4);
	}
}