package fr.paris10.td3.Products;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wilpiron on 10/10/2016.
 */
public class ProdFactory {

    private static Map<String, Product> registry = new HashMap<String, Product>();

    public static void registerProduct(String name, Product p){
        registry.put(name,p);
    }

    public Product createProduct(String name){
        return registry.get(name).createProduct();
    }
}
