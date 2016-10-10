package fr.paris10.td3.Products;

/**
 * Created by wilpiron on 10/10/2016.
 */
public class ProductB implements Product{
    public void doIt(){
        System.out.println("I'm a productB, doing it");
    }

    public Product createProduct(){
        Product p = new ProductB();
        return p;
    }
}
