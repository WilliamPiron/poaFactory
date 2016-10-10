package fr.paris10.td3.Products;

/**
 * Created by wilpiron on 10/10/2016.
 */
public class ProductC implements Product{
    public void perform(){
        System.out.println("I'm a fr.paris10.td3.Products.ProductC, performing");
    }

    public Product createProduct(){
        Product p = new ProductC();
        return p;
    }
}
