package org.example.ders49;

class Product {
    public int ID;
    public String name;
    public double price;

    public Product(int ID, String name, double price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product[ID=" + ID + ", name=" + name + ", price=" + price + "]";
    }
}
