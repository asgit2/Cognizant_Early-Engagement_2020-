/*
You are given a complex list of n products, each with a name, price, and weight. Find out how many duplicate products are present within the list. Duplicate products contain identical parameters for all fields in the list (i.e. name, price, and weight).
*/

import java.util.*;

public class ProductDuplicates {
    public static int numDuplicates(List<String> name, List<Integer> price, List<Integer> weight) {
        Map<String, Integer> productCount = new HashMap<>();
        int duplicates = 0;

        for (int i = 0; i < name.size(); i++) {
            String productKey = name.get(i) + "-" + price.get(i) + "-" + weight.get(i);
            productCount.put(productKey, productCount.getOrDefault(productKey, 0) + 1);
        }

        for (int count : productCount.values()) {
            if (count > 1) {
                duplicates += (count - 1);
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {
        List<String> name = Arrays.asList("ball", "bat", "glove", "glove", "glove");
        List<Integer> price = Arrays.asList(2, 3, 1, 2, 1);
        List<Integer> weight = Arrays.asList(2, 5, 1, 1, 1);

        System.out.println(numDuplicates(name, price, weight)); // Output: 1
    }
}
