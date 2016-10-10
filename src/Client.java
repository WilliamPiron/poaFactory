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
