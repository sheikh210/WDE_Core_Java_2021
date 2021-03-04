package oops.abstraction.learnInterfaces;

public class BankAccount {

    long accountNumber;
    String typeOfAccount;
    String accountHolderName;
    long accountBalance;

    public BankAccount(String typeOfAccount, String accountHolderName, long accountBalance) {
        this.typeOfAccount = typeOfAccount;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;

        this.accountNumber = 55939545793553L;
    }

    public long getAccountBalance() {
        return accountBalance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

}
