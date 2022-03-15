package ro.sda.raoul.exceptionHandling.ex2;

import java.time.Instant;

public class Main {
    public static void main(String[] args) {

        try {
            Person person=new Person(" ","Mihaila", Instant.now().minusSeconds(100));

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
