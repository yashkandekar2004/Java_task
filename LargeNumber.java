class LargeNumber {
	void check(int a, int b, int c) {
		if (a >= b && a >= c) {
			System.out.println(" larger number is :  " + a);
		} else if (b >= a && b >= c) {
			System.out.println(" large number is : " + b);
		} else if (c >= a && c >= b) {
			System.out.println(" large number is : " + c);
		}
	}

	public static void main(String args[]) {
		LargeNumber obj = new LargeNumber();
		obj.check(20, 20, 10);
	}
}