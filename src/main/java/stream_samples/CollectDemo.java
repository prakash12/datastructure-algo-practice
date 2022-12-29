package stream_samples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectDemo {
    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
                new Product(13, "lemon"),
                new Product(20, "chilli"),
                new Product(25, "sugar"),
                new Product(30, "bread"));

        //Reducing to collection
        List<String> collectorCollection = productList.stream().map(Product::getName).collect(Collectors.toList());
        //Reducing to String
        String listOfString = productList.stream().map(Product::getName).collect(Collectors.joining(", ","[",  "]"));

        System.out.println(collectorCollection);
        System.out.println(listOfString);
    }
}
