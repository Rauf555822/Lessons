package org.example.ders64;

public class Product {
    public int id;
    public String name;
    public double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public int getId() {return id;}
    public String getName() {return name;}
    public double getPrice() {return price;}
    @Override
    public String toString() {return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";}
}
