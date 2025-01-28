class P5 {
	void pattern() {
		int rows = 4;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				if (j % 2 == 0) {
					System.out.print("0");
				} else {
					System.out.print("1");
				}
			}

			System.out.println();
		}
	}

	public static void main(String args[]) {
		P5 obj = new P5();
		obj.pattern();
	}
}