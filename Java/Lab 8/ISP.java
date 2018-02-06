import java.lang.*;

interface ITransaction extends Depositable, Withdrawable, Transferable {}

interface IDepositable {
    public double requestDepositAmount();
}

interface IWithdrawable {
    public double requestWithdrawlAmount();
    public boolean informInsufficientFunds();
}

interface ITransferable {
    public double requestTransferAmount ();
}

class ATM implements IDepositable, IWithdrawable {
    public double requestDepositAmount() {
        // ....requesting deposit
        return 0.0;
    }

    public double requestWithdrawlAmount() {
        // ...requesting withdrawl amount
        return 0.0;
    }

    public boolean informInsufficientFunds() {
        // ...informing insufficient funds
        return true;
    }
}

class Bank implements IDepositable, IWithdrawable, ITransferable {
    public double requestDepositAmount() {
        return 0.0;
    }

    public double requestWithdrawlAmount() {
        return 0.0;
    }

    public boolean informInsufficientFunds() {
        return true;
    }

    public double requestTransferAmount() {
        return 0.0;
    }
}

class Money {
    Depositable deposit;

    public void setDeposit(Depositable d) {
        deposit = d;
    }

    public void makeDeposit() {
        deposit.requestDepositAmount();
    }
}