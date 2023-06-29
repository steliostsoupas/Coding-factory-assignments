package gr.aueb.cf.ch19.maps;

import gr.aueb.cf.ch19.sorting.Product;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>() {{
            put("GR", "Greece");
            put("FR", "France");
            put("USA", "United States of America");
        }};

        Map<String, String> countries2 = Map.of("GR", "Greece", "FR", "France");  // JDK9

        Map<Integer, Product> products = new HashMap<>() {{
            put(1, new Product("Apples", 6, 5));
            put(2, new Product("Oranges", 8.5, 15));
            put(3, new Product("Milk", 5.5, 10));
            put(4, new Product("Apples", 25, 20));
        }};

        Map<String, Object> criteria = new HashMap<>() {{
            put("description", "Oranges");
            put("price", 8.5);
        }};

        String choice = products.values().stream()
                .filter(product -> product.getDescription().equals(criteria.get("description"))
                && (Double.compare(product.getPrice(),(double) criteria.get("price"))) >= 0 )
                .map(Product::toString)
                .collect(Collectors.joining());

        System.out.println();
        System.out.println(choice);
        System.out.println();




        String strProducts = products.entrySet().stream()
                .filter(entry -> entry.getValue().getDescription().equals("Apples"))
                .map(Object::toString)
                .collect(Collectors.joining(", "));

        System.out.println();
        System.out.println(strProducts);
        System.out.println();



        /* countries.put("GR", "Greece");
        countries.put("FR", "France");
        countries.put("USA", "United States of America"); */

        Iterator<Map.Entry<String, String >> it = countries.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<String, String> entry  = it.next();
            if (entry.getValue().equals("Greece")) {
//                it.remove();
            }
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        countries.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
