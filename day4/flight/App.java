package flight;

public class App {
    public static void main(String[] args) {
        Flight manilaToBoracay = new Flight();
        System.out.println(manilaToBoracay.passengers);
        System.out.println(manilaToBoracay.seats);

        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();

        manilaToBoracay.addPassenger(); //Full

        manilaToBoracay.setNumberOfSeats(20);

        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();

        // Changed the formula to show computation for number of available seats
        // Number of seats - number of passengers = number of available seats
        System.out.println(
                "Current # of available seats: " + (manilaToBoracay.seats - manilaToBoracay.passengers));// 7
        System.out.println(
                "Current # of passengers: " + manilaToBoracay.passengers);// 13
    }
}
