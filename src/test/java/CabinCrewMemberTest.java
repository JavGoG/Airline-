import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CabinCrewMemberTest {
    CabinCrewMember firstOficer;

    @BeforeEach
    void setUp() {
        firstOficer= CabinCrewMember.valueOf("CAPTAIN");
    }
    @Test
    void message() {
         assertEquals("Fasten the seatbelt", firstOficer.message("Fasten the seatbelt"));
    }
    @Test
    void checkRank(){
        assertEquals(1, firstOficer.getRank());
    }
}