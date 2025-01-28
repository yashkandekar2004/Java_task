class Factorial {
	void check(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of "+ num + "is"+fact);
	}

	public static void main(String args[]) {
		Factorial cal = new Factorial();
		cal.check(5);
	}
}
