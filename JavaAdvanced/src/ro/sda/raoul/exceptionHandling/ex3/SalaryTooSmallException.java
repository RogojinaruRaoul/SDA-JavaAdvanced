package ro.sda.raoul.exceptionHandling.ex3;

public class SalaryTooSmallException extends Exception{

    public SalaryTooSmallException(String message) {
        super(message);
    }
}
