package Threads;

public class NumberThread extends Thread {

    public void run(){
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(500);
                System.out.println(i);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
