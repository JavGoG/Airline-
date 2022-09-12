import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlightTest {
    Flight flight;

    @Before
    public void setUp(){
        flight.addPassengerToTheFlight(new Passenger("Mr. Javier Gonzalez", 1));
        flight.addCabinCrewMembers(CabinCrewMember.FLIGHTATTENDANT);
        flight.addPassengerToTheFlight(new Passenger("Mr. Javier Gonzalez", 1));
        flight = new Flight(
                    new Pilot("John Williams", "1", 123123),
                    Plane.BOEING747,
                    "VR7676",
                    "Madrid",
                    "Barajas",
                    "15:15PM");
    }

    @Test
    void addCabinCrewMembers() {
    }

    @Test
    void addPassengerToTheFlight() {
    }

    @Test
    void setSeatsCounter() {
    }

    @Test
    void setPilot() {
    }

    @Test
    void setCabinCrewMembers() {
    }

    @Test
    void setPassengers() {
    }

    @Test
    void setPlane() {
    }

    @Test
    void setFlightNumber() {
    }

    @Test
    void setDestination() {
    }

    @Test
    void setDepartureAirport() {
    }

    @Test
    void setDepartureTime() {
    }

    @Test
    void getSeatsCounter() {
    }

    @Test
    void getPilot() {
    }

    @Test
    void getCabinCrewMembers() {
    }
}