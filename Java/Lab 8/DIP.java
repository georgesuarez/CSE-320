import java.lang.*;

interface ITransaction {
    public void transact();
}

class ATM implements ITransaction {
    public void transact() {
        // ... transact 
    }
}

class Bank implements ITransaction {
    public void transact() {
        // ... transact some more
    }
}

class Money {
    ITransaction transaction;

    public void setTransaction(ITransaction t) {
        transaction = t;
    }

    public void addMoney() {
        transaction.transact();
    }
}