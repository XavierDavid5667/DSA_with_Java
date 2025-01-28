package multithreading;

public class Printer {
    private final Object lock = new Object();
    private volatile boolean numberTurn = false;

    public void printNumber()  {
        for (int i = 1; i <= 26; i++) {
            synchronized (lock) {
                try {
                    while (!numberTurn) {
                        lock.wait();
                    }
                    System.out.println(i);
                    numberTurn = false;
                    lock.notifyAll();
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.err.println("Number thread interrupted" + e.getMessage());
                }
            }
        }
    }

    public void printLetter() {
        for (char c = 'A'; c <= 'Z'; c++) {
            synchronized (lock) {
                try {
                    while (numberTurn) {
                        lock.wait();
                    }
                    System.out.println(c);
                    numberTurn = true;
                    lock.notifyAll();
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.err.println("Number thread interrupted" + e.getMessage());
                }
            }
        }
    }
}
