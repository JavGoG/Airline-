public enum CabinCrewMember {

    CAPTAIN(1),
    FIRSTOFFICER(2),
    FLIGHTATTENDANT(3),
    PURSER(4);

    public int getRank() {
        return rank;
    }

    private final int rank;

    CabinCrewMember(int rank) {
        this.rank = rank;
    }
    public String message (String message){
        return message;
    }

}
