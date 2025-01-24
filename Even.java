class Even {
	void check(int a) {
		if (a % 2 == 0) {
			System.out.println("Number is Even");
		} else {
			System.out.println("Number is Odd");
		}
	}

	public static void main(String args[]) {
		Even obj = new Even();
		obj.check(10);
	}
}