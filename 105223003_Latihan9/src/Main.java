class PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Memproses pembayaran sebesar " + amount + " dengan metode default dan mata uang default");
    }

    public void processPayment(double amount, String currency) {
        System.out.println("Memproses pembayaran sebesar " + amount + " " + currency + " dengan metode default");
    }
}

class CreditCard extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Memproses pembayaran kartu kredit sebesar " + amount + " dengan mata uang default");
    }

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("Memproses pembayaran kartu kredit sebesar " + amount + " dalam mata uang " + currency);
    }
}

class EWallet extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Memproses pembayaran e-wallet sebesar " + amount + " dengan mata uang default");
    }

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("Memproses pembayaran e-wallet sebesar " + amount + " dalam mata uang " + currency);
    }
}

class BankTransfer extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Memproses pembayaran melalui transfer bank sebesar " + amount + " dengan mata uang default");
    }

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("Memproses pembayaran melalui transfer bank sebesar " + amount + " dalam mata uang " + currency);
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentMethod[] pembayaran = {
            new CreditCard(),
            new EWallet(),
            new BankTransfer()
        };

        for (PaymentMethod p : pembayaran) {
            p.processPayment(1400000);
            p.processPayment(1500000, "IDR");
            System.out.println();
        }
    }
}