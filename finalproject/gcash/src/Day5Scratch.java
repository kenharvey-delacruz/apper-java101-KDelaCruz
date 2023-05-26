package gcash.src;

import java.util.Map;
import java.util.HashMap;

public class Day5Scratch {
    public static void main(String[] args) {
        Map<String, String> cars = new HashMap<>();
        cars.put("c1", "Innova");
        cars.put("c2", "FJ Cruiser");
        cars.put("c3", "Expander");
        cars.put("c4", "Vios");
        cars.put("c5", "Honda");
        cars.put("c6", "Tesla");

        System.out.println(cars.get("c4"));
        System.out.println(cars.size());
        System.out.println(cars.keySet());
        System.out.println(cars.get("c7"));
        System.out.println(cars.containsValue("FJ Cruiser"));
    }
}
