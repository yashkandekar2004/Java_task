class AreaCircle {
	final double pi = 3.147;
	double r;
	double area;

	void calculateArea() {
		r = 20.5;
		area = pi * r * r;
		System.out.println("Area Of Circle :" + area);
	}

	public static void main(String a[]) {
		AreaCircle cal = new AreaCircle();
		cal.calculateArea();
	}
}