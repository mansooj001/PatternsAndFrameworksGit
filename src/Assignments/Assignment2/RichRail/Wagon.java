package Assignments.Assignment2.RichRail;

/**
 * Created by jason on 12/19/2016.
 */
public class Wagon implements IVehicle{
    private WagonType wagonType;
    private IDrawing IDrawing;

    public Wagon(WagonType wagonType, IDrawing IDrawing) {
        this.wagonType = wagonType;
        this.IDrawing = IDrawing;
    }

    WagonType getWagonType() {
        return wagonType;
    }

    @Override
    public void draw() {
        IDrawing.draw();
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
