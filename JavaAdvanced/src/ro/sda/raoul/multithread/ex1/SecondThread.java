package ro.sda.raoul.multithread.ex1;

public class SecondThread extends Thread{
    @Override
    public void run() {
        System.gc();
        System.out.println("Message from second thread.");
    }
}
