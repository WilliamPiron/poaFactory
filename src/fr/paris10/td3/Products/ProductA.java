package fr.paris10.td3.Products;

/**
 * Created by wilpiron on 10/10/2016.
 */
public class ProductA implements Product{

    static {
        ProdFactory.registerProduct("ProductA", new ProductA());
    }

    public void doYourStuff(){
        System.out.println("I'm a fr.paris10.td3.Products.ProductA, doing my stuff");
    }

    public Product createProduct(){
        Product p = new ProductA();
        return p;
    }
}
