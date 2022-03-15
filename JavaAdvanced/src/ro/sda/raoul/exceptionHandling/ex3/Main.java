package ro.sda.raoul.exceptionHandling.ex3;

public class Main {
    public static void main(String[] args) {
        int salary = 4500;

        Employee employee1 = new Employee("Andrei", "Call center");
        try {
            employee1.setSalary(salary);
        } catch (SalaryTooSmallException s) {
            System.out.println("Please increase salary.");
        } catch (SalaryTooBigException s1) {
            System.out.println("Please decrease salary.");
        }
    }
}
