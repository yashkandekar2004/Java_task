class Day {
	void check(int num) {
		if (num == 1) {
			System.out.println("Monday");
		} else if (num == 2) {
			System.out.println("Tuesday");
		} else if (num == 3) {
			System.out.println("Wednesday");
		} else if (num == 4) {
			System.out.println("Thrusday");
		} else if (num == 5) {
			System.out.println("Friday");
		} else if (num == 6) {
			System.out.println("Saturday");
		} else if (num == 7) {
			System.out.println("Sunday");
		} else {
			System.out.println("Invalid Number");
		}
	}

	public static void main(String args[]) {
		Day obj = new Day();
		obj.check(1);
	}
}