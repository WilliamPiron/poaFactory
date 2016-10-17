package fr.paris10.td3.Products;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wilpiron on 10/10/2016.
 */
public class ProdFactory {

    private static ProdFactory instance;

    public ProdFactory(){}

    public static synchronized ProdFactory getInstance(){
        if (instance == null){
            instance = new ProdFactory();
        }
        return instance;
    }

    public Product createProduct(){ return new ProductA(); }

    public Product createProduct(String ProductName){
        if (ProductName.equals("ProductA")){
            return new ProductA();
        }
        if (ProductName.equals("ProductB")){
            return new ProductB();
        }
        if (ProductName.equals("ProductC")){
            return new ProductC();
        }
        return null;
    }
}
