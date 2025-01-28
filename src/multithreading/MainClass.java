package multithreading;

public class MainClass {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread thread1=new Thread(new LetterThread(printer),"Number Thread");
        Thread thread2=new Thread(new NumberThread(printer),"Letter Thread");
        thread1.start();
        thread2.start();
       try {
           thread1.join();
           thread2.join();
       } catch (InterruptedException e) {
           e.printStackTrace();
       }

    }
}
