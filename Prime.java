class Prime {
	void check(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println("Number is Prime");
		} else {
			System.out.println("Number is not Prime");
		}
	}

	public static void main(String args[]) {
		Prime pr = new Prime();
		pr.check(1);
	}
}