package ro.sda.raoul.abstractclass.ex1;

/**
 * Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited in banks A, B and C respectively.
 * 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'.
 * Call this method by creating an object of each of the three classes.
 */
public class Main {
    public static void main(String[] args) {

        Bank bankA = new BankA();
        Bank bankB = new BankB();
        Bank bankC = new BankC();

        System.out.println(bankA.getBalance());
        System.out.println("Value after tax is: "+bankA.getBalanceAfterTax());
        System.out.println(bankB.getBalance());
        System.out.println("Value after tax is: "+bankB.getBalanceAfterTax());
        System.out.println(bankC.getBalance());
        System.out.println("Value after tax is: "+bankC.getBalanceAfterTax());

    }
}
