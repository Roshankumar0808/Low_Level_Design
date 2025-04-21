package Threads;

public class MainThread {
    public  static void run(){
        CharThread charThread=new CharThread();
        NumberThread numberThread=new NumberThread();
        charThread.run();
        numberThread.run();
    }

}
