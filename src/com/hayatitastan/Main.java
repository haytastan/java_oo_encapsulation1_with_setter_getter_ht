package com.hayatitastan;

/**
 * Created by Dr. Hayati TASTAN on $DATE
 **/
public class Main {
    public static void main(String[] args) {

        // attributes (properties)

        // main program for the class Person:
        Person myObj = new Person();
        myObj.setName("John"); // Set the value of the name variable to "John"
        System.out.println(myObj.getName());


        // main program for the class Product:
        Product product = new Product();

        product.setId(1001);
        product.setName("Laptop");
        product.setModel("MacBook Air");
        product.setPrice(15000);
        product.setStockAmount(3);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println("Ürün Modeli : " + product.getModel() );
        System.out.println("Ürün Kodu   : " + product.getProductCode() );
        System.out.println("Ürün Fiyatı : " + product.getPrice() + " TL" );
    }
}
