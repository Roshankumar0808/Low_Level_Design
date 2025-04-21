package Threads;

public class CharThread {
    public void run(){
        for(char i='A';i<'Z';i++){
            try {
                Thread.sleep(500);
                System.out.println(i);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
