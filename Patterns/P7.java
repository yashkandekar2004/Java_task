class P7 
{
	void pattern()
	{
		
		for(int i =5;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}

			System.out.println();  
		}
	}

	public static void main(String args [])
	{
		P7 obj = new P7();
		obj.pattern();
	}

}