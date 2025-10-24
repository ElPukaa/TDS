package com.example.debug;

public class BankTransfer {
    public static class Account {
        public String name;
        public int balance;

        public Account(String name, int balance) {
            this.name = name;
            this.balance = balance;
        }
    }

    public static void transfer(Account from, Account to, int amount) {
        if (from.balance >= amount) {
            // Simulamos retardo para aumentar la probabilidad de race condition
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            from.balance -= amount;
            to.balance += amount;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Account a = new Account("A", 1000);
        Account b = new Account("B", 1000);

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) transfer(a, b, 10);
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) transfer(b, a, 10);
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Balances finales: A=" + a.balance + " B=" + b.balance);
    }
}
