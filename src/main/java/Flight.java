import java.util.ArrayList;

public class Flight {
    private static int seatsCounter;
    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers = new ArrayList<>();
    private ArrayList<Passenger> passengers = new ArrayList<>();
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    public Flight(Pilot pilot, Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilot = pilot;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public void addCabinCrewMembers(CabinCrewMember cabinCrewMember){
        this.cabinCrewMembers.add(cabinCrewMember);
    }
    public void addPassengerToTheFlight(Passenger passenger){
        if (Flight.getSeatsCounter()<= 299){
            this.passengers.add(passenger);
            seatsCounter++;
        }
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public static int getSeatsCounter() {
        return seatsCounter;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int availableSeats(){
        return Plane.BOEING747.getCapacity() - seatsCounter;

    }
}
