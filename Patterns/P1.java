class P1 {
	void createPattern() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}

			System.out.println();
		}
	}

	public static void main(String args[]) {
		P1 obj = new P1();
		obj.createPattern();
	}
}