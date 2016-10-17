package fr.paris10.td3.Products;

/**
 * Created by wilpiron on 10/10/2016.
 */
public class ProductA implements Product{
    @Override
    public void perform(){
        System.out.println("I'm a ProductA !");
    }

    ProductA(){}
}
