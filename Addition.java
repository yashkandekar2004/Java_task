class Addition {
	int a, b, c;

	void getData(int x, int y) {

		a = x;
		b = y;
		System.out.println("a" + "=" + a + " b" + "=" + b);
	}

	void sum() {
		c = a + b;
		System.out.println("Addition is :" + c);
	}

	public static void main(String a[]) {
		Addition obj = new Addition();
		obj.getData(10, 20);
		obj.sum();

		Addition obj2 = new Addition();
		obj2.getData(100, 280);
		obj2.sum();
	}

}