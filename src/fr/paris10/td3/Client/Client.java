package fr.paris10.td3.Client;

import fr.paris10.td3.Products.ProductA;
import fr.paris10.td3.Products.ProductB;
import fr.paris10.td3.Products.ProductC;
import fr.paris10.td3.Products.Product;
import fr.paris10.td3.Products.ProdFactory;

/**
 * Created by wilpiron on 10/10/2016.
 */
public class Client {
    Product prod1;
    ProdFactory factory;

    public Client(){
        factory = ProdFactory.getInstance();
        prod1 = factory.createProduct("ProductA");
    }

    public void foo(){
        Product myProd1, myProd2;
        prod1.perform();
        myProd1 = factory.createProduct("ProductB");
        myProd1.perform();
        myProd2 = factory.createProduct("ProductC");
        myProd2.perform();
    }


}
