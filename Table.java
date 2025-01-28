class Table 
{
	void whileLoop(int num)
	{
		int i=1;
		while(i<=10)
		{
			System.out.println(num + " X " + i +" = "+ (num*i));
			i++;
		}
	}

	void forLoop(int num1)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(num1 + " X " + i +" = "+ (num1*i));
		}
	}
	
	public static void main (String args [])
	{
		Table obj =new Table();
		obj.whileLoop(5);
		System.out.println("For Loop");
		obj.forLoop(10);
	}
}