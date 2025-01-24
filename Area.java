class Area 
{
	void circle(int r )
	{
		double pi=3.14;
		double area =pi*r*r;
		System.out.println("Area  Of Circle is : " + area);
	}

	void rectangle(int l, int b)
	{
		int area1=l*b;
		System.out.println("Area Of Rectangle is : " + area1);
	}

	void interest (int principal, int rate , int time)
	{
		   int interest = (principal * rate * time) / 100;
		   System.out.println("Simple interest is : " +interest);
	}

	public static void main (String args [])
	{
		Area obj=new Area();
		System.out.println("Menu : ");
		System.out.println("1 Area Of Circle  ");
		System.out.println("2 Area Of Rectangle ");
		System.out.println("3 Simple Interest");

    		int choice =3;
		System.out.println("Choice : "+choice);

		switch(choice)
		{
			case 1 :obj.circle(12);
				break;
			case 2 :obj.rectangle(12,14);
				break;
			case  3:obj.interest (10000,2,4);
				break;
			default :
			System.out.println("Wrong Choice");
				
		}
	}
}