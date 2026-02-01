package trip;

public class TestTrip {

    static void main(String[] args) {
        Trip trip = new Trip(100.0, "New York", new double[]{10, 20, 30});
        System.out.println(trip);
        Trip trip2 = new Trip(100.0, "New York", new double[]{10, 20, 30});
        System.out.println(trip2);
        System.out.println(trip.equals(trip2));
        System.out.println(trip.hashCode());
        System.out.println(trip2.hashCode());
        trip.addDistance(40);
        System.out.println(trip);
        trip.removeDistance(1);
        System.out.println(trip);
        System.out.println(trip.equals(trip2));
        System.out.println(trip.hashCode());
        System.out.println(trip2.hashCode());
    }
}
