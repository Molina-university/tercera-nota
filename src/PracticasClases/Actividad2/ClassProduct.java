package PracticasClases.Actividad2;

public class ClassProduct {
    // Atributos
        String name;
        double price;
        int quantity;

        // Constructor
        public ClassProduct(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        // Metodos
        void sell(int quantity) {
            if (quantity <= this.quantity) {
                this.quantity -= quantity;
                System.out.println("---------------------------  SELL ---------------------------------------------");
                System.out.println(
                        "Has comprado " + quantity + " de " + this.name + "\n   Cantidad restante: " + this.quantity);
                System.out.println("--------------------------------------------------------------------------------");

            } else {
                System.out.println("---------------------------  ERROR  ---------------------------------------------");
                System.out.println("El stock disponible es limitado " + quantity + " unidades");
                System.out.println("--------------------------------------------------------------------------------");

            }
        }

        void restock(int quantity) {
            this.quantity += quantity;
            System.out.println("------------------------------ RESTOCK --------------------------------------------");
            System.out.println("Se ha abastecido " + quantity + " unidades del producto " + this.name + ",\nAhora hay "
                    + this.quantity + " de este producto");
            System.out.println("-----------------------------------------------------------------------------------");
        }

        void showProduct() {
            System.out.println("----------------------------- SHOW PRODUCT ----------------------------------------");
            System.out.println("Nombre del producto: " + this.name + ";\nPrecio del producto: " + this.price
                    + ";\nCantidad actual del producto: " + this.quantity);
            System.out.println("----------------------------------------------------------------------------------");

        }
}
