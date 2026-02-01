package commerce;

import java.util.ArrayList;

public class TestShop {

    static void main(String[] args) {
        ArrayList<Shop> shops = new ArrayList<>();
        shops.add(new Shop(1000, "Shop 1", 10));
        shops.add(new Shop(2000, "Shop 2", 5));
        shops.add(new Shop(3000, "Shop 3", 15));
        shops.add(new Shop(4000, "Shop 4", 20));
        shops.add(new Shop(5000, "Shop 5", 5));
        for (var elem : shops){
            System.out.println(elem);
        }
        shops.sort(null);
        System.out.println("After sorting:");
        for (var elem : shops){
            System.out.println(elem);
        }
    }
}
