package oops.abstraction.learnInterfaces;

public class SavingsAccount extends BankAccount implements InterestRates {

    String accountHolderName;
    long accountBalance;
    double interestRate;

    public SavingsAccount(String accountHolderName, long accountBalance) {
        super("Savings", accountHolderName, accountBalance);
        this.interestRate = SAVING_ACCOUNT_INTEREST_RATE;
    }

    @Override
    public long getAccountBalance() {
        return super.getAccountBalance();
    }

    @Override
    public long getAccountNumber() {
        return super.getAccountNumber();
    }

    @Override
    public void doSomething() {
        System.out.println("Doing something from SavingsAccount Class");
    }

    @Override
    public void doSomething2() {

    }
}
