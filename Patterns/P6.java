class P6 {
	void pattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int s = n - 1; s >= i; s--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			for (int j = 2; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	public static void main(String args[]) {
		P6 obj = new P6();
		obj.pattern(4);
	}
}