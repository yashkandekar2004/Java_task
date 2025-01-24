class First {
	int a;

	void check(int x) {
		a = x;
		if (a >= 0) {
			System.out.println("Positive");
		} else {
			System.out.println("Negative");
		}
	}

	public static void main(String args[]) {
		First obj = new First();
		obj.check(10);
	}
}