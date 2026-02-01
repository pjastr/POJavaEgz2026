package trip;

import java.util.Arrays;
import java.util.Objects;

public class Trip {

    private double cost;
    private String destination;
    private double[] distances;

    public Trip(double cost, String destination, double[] distances) {
        this.cost = cost;
        if (destination == null)
            throw new IllegalArgumentException("Destination cannot be null");
        this.destination = destination;
        if (distances == null)
            throw new IllegalArgumentException("Distances array cannot be null");
        this.distances = distances.clone();
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        if(destination == null)
            throw new IllegalArgumentException("Destination cannot be null");
        this.destination = destination;
    }

    public double[] getDistances() {
        return distances.clone();
    }

    public void setDistances(double[] distances) {
        if(distances == null)
            throw new IllegalArgumentException("Distances array cannot be null");
        this.distances = distances.clone();
    }

    public void addDistance(double distance) {
        double[] newDistances = new double[distances.length + 1];
        for (int i = 0; i < distances.length; i++) {
            newDistances[i] = distances[i];
        }
        newDistances[distances.length] = distance;
        distances = newDistances;
    }

    public void removeDistance(int index) {
        if (index < 0 || index >= distances.length)
            throw new IllegalArgumentException("Index out of bounds");
        double[] newDistances = new double[distances.length - 1];
        for (int i = 0; i < distances.length; i++) {
            if (i < index) {
                newDistances[i] = distances[i];
            } else if (i > index) {
                newDistances[i - 1] = distances[i];
            }
        }
        distances = newDistances;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+": " + cost + ", "+ destination + ", "+ Arrays.toString(distances)+".";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Trip trip = (Trip) o;
        return Double.compare(cost, trip.cost) == 0 && Objects.equals(destination, trip.destination) && Arrays.equals(distances, trip.distances);
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(cost);
        result = 31 * result + Objects.hashCode(destination);
        result = 31 * result + Arrays.hashCode(distances);
        return result;
    }
}
