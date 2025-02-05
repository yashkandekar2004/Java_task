import java.util.Scanner;

class Train {

    private int distance;
    private String seatType;

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    void calculateFare() {
        int fare = 0;
        if (seatType.equals("first")) {
            fare = distance * 10;
        } else if (seatType.equals("second")) {
            fare = distance * 7;
        } else {
            fare = distance * 5;
        }
        System.out.println("Fare: " + fare);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Train t = new Train();
        System.out.println("Enter distance: ");
        t.setDistance(sc.nextInt());
        System.out.println("Enter seat type: ");
        t.setSeatType(sc.next());
        t.calculateFare();
    }
}