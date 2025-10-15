package semanaSeis.utils;

import java.util.ArrayList;
import java.util.HashMap;

// Import the Product class (adjust the package if necessary)
public class Inventory {
    private ArrayList<Product> products;
    private HashMap<String, Product> catalog;

    public Inventory() {
        this.products = new ArrayList<>();
        this.catalog = new HashMap<>();
    }

    public void addProduct(Product p) {
        products.add(p);
        catalog.put(p.getCode(), p);
    }

    public void showProducts() {
        for (Product p : products) {
            System.out.println(p.toString());
        }
    }

    public Product searchProduct(String code) {
        return catalog.get(code);
    }
}
