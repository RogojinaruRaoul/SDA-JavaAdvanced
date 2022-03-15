package ro.sda.raoul.exceptionHandling.ex3;

public class SalaryTooBigException extends Exception{

    public SalaryTooBigException(String message) {
        super(message);
    }
}
