package commerce;

public class Shop implements Comparable<Shop>{

    private double revenue;
    private String name;
    private int employeeCount;

    public Shop(double revenue, String name, int employeeCount) {
        this.revenue = revenue;
        this.name = name;
        this.employeeCount = employeeCount;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "revenue=" + revenue +
                ", name='" + name + '\'' +
                ", employeeCount=" + employeeCount +
                '}';
    }

    @Override
    public int compareTo(Shop obj) {
        int base = Integer.compare(obj.employeeCount, this.employeeCount);
        if (base != 0)
            return base;
        return Double.compare(obj.revenue, this.revenue);
    }
}
