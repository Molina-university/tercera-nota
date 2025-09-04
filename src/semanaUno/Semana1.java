package semanaUno;
public class Semana1 {

    public static class BankAccount  {
        // Atributos
        String accountNumber ;
        String owner;
        double balance;

        //metodos
        void deposit(double amount) {
            balance += amount;
            System.out.println("Deposito: " + amount + "| nuevo balance: " + balance);
        }

        void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Retiro: " + amount + "| nuevo balance: " + balance);
            } else {
                System.out.println("Fondos insuficientes para retirar: " + amount);
            }
        }
        
        void showBalance () {
            System.out.println(owner + ", su balance actual: " + balance);
        }
    }
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.accountNumber = "123456789";
        account1.balance = 1000;
        account1.owner = "molina";

        System.out.println("Account Number: " + account1.accountNumber);
        System.out.println("Owner: " + account1.owner);
        System.out.println("Balance: " + account1.balance);

        account1.deposit(500);
        account1.withdraw(200); 
        account1.showBalance();
    }
}       