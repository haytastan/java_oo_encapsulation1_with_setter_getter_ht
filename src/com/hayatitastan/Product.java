package com.hayatitastan;

/**
 * Created by Dr. Hayati TASTAN on 4.10.2022
 **/


public class Product {
  // default public olup, bu özelliğe her yerden erişilebilir. C# da default java tersine private olur
  // private tipindeki değişkenler ise sadece tanımlandığı blok (yani {} içinde geçerli olur.
  // Örneğin if bloğu içinde bir private değişken tanımlanırsa, bu değişkene sadece if bloğu içinden erişilebilir.
  private int     id;
  private String  name; // alt çizgi ile başlayanlar private olduğu anlaşılır.
  private String  model;
  private double  price;
  private int     stockAmount;
  private String  productCode;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getStockAmount() {
    return stockAmount;
  }

  public void setStockAmount(int stockAmount) {
    this.stockAmount = stockAmount;
  }

  public String getProductCode() { //ürün koduna dışarıdan değer verilemez, çünkü setter yok
    return this.name.substring(0,1) + "-" + this.id;
  }

}
