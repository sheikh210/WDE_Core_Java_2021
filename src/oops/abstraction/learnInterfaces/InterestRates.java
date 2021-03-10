package oops.abstraction.learnInterfaces;

public interface InterestRates {

    /*
    INTERFACES ARE 100% ABSTRACT BY NATURE
        We cannot create objects of (instantiate) interfaces (just like we can't instantiate abstract classes)
        All methods within an interface MUST be abstract
        All variables within an interface are implicitly FINAL (constant)
            We must always initialize the variables within an interface, as they are constant and cannot be re-assigned elsewhere
     */

    double SAVING_ACCOUNT_INTEREST_RATE = 0.79;
    double CHECKING_ACCOUNT_INTEREST_RATE = 0.29;
    double MORTGAGE_INTEREST_RATE = 3.5;

    void doSomething();
    void doSomething2();

}
