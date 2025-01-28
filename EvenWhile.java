class EvenWhile 
{
	void whileLoop(int i , int n )
	{
		while(i<=n)
		{
			if(i%2==0)
			{
				System.out.println(i);
				
			}
			
			i++;
		}
	}

	void forLoop( int n1 )
	{
		for(int i=5;i<=n1;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}

			
		}
	}

	public static void main (String args [])
	{
		EvenWhile obj =new EvenWhile();
		obj.whileLoop(5,18);
		obj.forLoop(18);
	}
}