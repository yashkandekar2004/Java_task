class AreaRectangle {
	double length;
	double breadth;
	double area;

	double calculate(double length, double breadth) {
		area = length * breadth;
		return area;
	}

	public static void main(String a[]) {
		AreaRectangle cal = new AreaRectangle();
		double res = cal.calculate(10.7, 10.8);
		System.out.println("Area Of Recatangle is : " + res);
	}
}