class Test
{
	//instance variables 
	int a=100,b=50;

	public static void main(String[] args)
	{
		Test t = new Test();
		t.sum();
           System.out.println(t.a);
	}

	//non-static method 
	public void sum()
	{
		System.out.println(a+b);	
	}
}
