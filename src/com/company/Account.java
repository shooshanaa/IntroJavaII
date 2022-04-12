package com.company;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit (int amount) {
        if (amount<=balance) {
            return balance - amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int debit (int amount) {
        return amount + balance;

        }

        public int transferTo (int amount, String account) {
            if (amount <= balance)
          return  transferTo(amount, Account);

        else {
        System.out.println("Amount exceeded balance");
    }
        return balance;
        }

}
