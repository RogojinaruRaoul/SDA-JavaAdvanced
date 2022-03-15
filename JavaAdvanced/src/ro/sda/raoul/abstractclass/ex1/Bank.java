package ro.sda.raoul.abstractclass.ex1;

public abstract class Bank {

    // Constantele vor fi STATIC FINAL
    private static final double TAX_VALUE = 0.15;

    public abstract double getBalance();

    public double getBalanceAfterTax() {
        double tax = getBalance() * TAX_VALUE;
        return getBalance() - tax;
    }

}
