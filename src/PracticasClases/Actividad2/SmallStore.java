package PracticasClases.Actividad2;

public class SmallStore {

    // 1. Create a class called Product with the following attributes: name, price,
    // quantity.
    // 2. Implement the following methods:
    // a) sell(int amount)` → decreases quantity if enough stock is available.
    // b) restock(int amount)` → increases quantity.
    // c) showProduct()` → prints product info.
    // 3. Create two objects of type Product with different values.
    // 4. Test all the methods
    // 5. Add a condition in sell() to print a message when the stock is not enough.

    public static void main(String[] args) {
        ClassProduct product1 = new ClassProduct("jabon", 25.50, 15);
        ClassProduct product2 = new ClassProduct("cepillos", 5.50, 10);

        product1.showProduct();
        product1.sell(20);
        product1.sell(5);
        product1.restock(20);

        product2.showProduct();
        product2.sell(8);
        product2.sell(25);
        product2.restock(50);

    }

}
