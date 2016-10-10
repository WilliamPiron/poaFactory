package fr.paris10.td3.Client;

import fr.paris10.td3.Products.ProductA;
import fr.paris10.td3.Products.ProductB;
import fr.paris10.td3.Products.ProductC;

/**
 * Created by wilpiron on 10/10/2016.
 */
public class Client {
    ProductA prodA;
    ProductB prodB;

    public Client(){
        prodA = new ProductA();
    }

    public void foo(){
        prodA.doYourStuff();
        ProductB myProdB = new ProductB();
        myProdB.doIt();
        ProductC myProdC = new ProductC();
        myProdC.perform();
    }

}
