class Armstrong 
{
	void check (int number)
	{
		
      	int temp = number, sum = 0;
        int digits = String.valueOf(number).length(); 

        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;

            
            for (int i = 0; i < digits; i++) { 
                power *= digit;
            }

            sum += power;
            temp /= 10;
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is not an Armstrong Number.");
        }
	}

	public static void main(String args [])
	{
		Armstrong obj =new Armstrong();
		obj.check(370);
	}
}