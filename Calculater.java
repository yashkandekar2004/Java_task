class Calculater {
	void sum(int a, int b) {
		System.out.println(a + b);
	}

	void sub(int a, int b) {
		System.out.println(a - b);
	}

	void mult(int a, int b) {
		System.out.println(a * b);
	}

	void div(int a, int b) {
		System.out.println(a / b);
	}

	public static void main(String args[]) {
		int x = 10;
		int y = 20;

		Calculater cal = new Calculater();

		System.out.println("Menu : ");
		System.out.println("1 Addition : ");
		System.out.println("2 Subtraction : ");
		System.out.println("3 Multipication: ");
		System.out.println("4 Division : ");

		int choice = 1;
		System.out.println("Choice :  " + choice);
		switch (choice) {
			case 1:
				cal.sum(x, y);
				break;
			case 2:
				cal.sub(x, y);
				break;
			case 3:
				cal.mult(x, y);
				break;
			case 4:
				cal.div(x, y);
				break;
			default:
				System.out.println("Invalid choice");
		}
	}
}