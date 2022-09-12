import static org.junit.jupiter.api.Assertions.*;

class PilotTest {
    Pilot pilot;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        pilot = new Pilot("Charles", "Captain", 123456 );
    }

    @org.junit.jupiter.api.Test
    void fly() {
        pilot.fly("Let's go to Madrid");
    }
}