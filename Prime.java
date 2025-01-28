class Prime {
	void check(int num) {
		int count = 0;
		for (int i = 2; i <num-1; i++) {
			if (num % i == 0) {
				count=1;
				System.out.println("Not Prime");
			}
		}

		if (count!=1) {
			System.out.println("Number is Prime");
		} 
	}

	public static void main(String args[]) {
		Prime pr = new Prime();
		pr.check(55);
	}
}