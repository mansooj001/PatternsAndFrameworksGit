package Assignments.Assignment2.RichRail.Domain;

/**
 * Created by jason on 12/19/2016.
 */
public class Wagon {
    private final WagonType wagonType;
    private String ID;
    private int seats;

    public Wagon(WagonType wagonType) {
        this.wagonType = wagonType;
    }

    WagonType getWagonType() {
        return wagonType;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    class WagonType {
        String type;

        public WagonType(String type)  throws Exception{
            if (!type.contains("WAGON")){
              throw (new Exception("Wagontype bevat geen \"WAGON\""));
            }
            this.type = type;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof WagonType)) return false;

            WagonType wagonType = (WagonType) o;

            return type.equals(wagonType.type);
        }

        @Override
        public int hashCode() {
            return type.hashCode();
        }
    }
}
