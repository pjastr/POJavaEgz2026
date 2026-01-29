package position;

public final class ImmutableBuilding {

    private final double height;
    private final String address;
    private final int floorCount;

    public ImmutableBuilding(double height, String address, int floorCount) {
        this.height = height;
        this.address = address;
        this.floorCount = floorCount;
    }

    public double getHeight() {
        return height;
    }

    public String getAddress() {
        return address;
    }

    public int getFloorCount() {
        return floorCount;
    }

    @Override
    public String toString() {
        return "ImmutableBuilding{" +
                "height=" + height +
                ", address='" + address + '\'' +
                ", floorCount=" + floorCount +
                '}';
    }

    public ImmutableBuilding update(double heightChange, String addressSuffix,
                                           int floorCountChange) {
        return new ImmutableBuilding(height + heightChange, address + addressSuffix, floorCount + floorCountChange);
    }
}
