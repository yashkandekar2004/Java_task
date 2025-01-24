class MultiplicationTable {
	void table(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}
	}

	public static void main(String args[]) {
		MultiplicationTable cal = new MultiplicationTable();
		cal.table(5);
	}
}