package multithreading;

public class LetterThread implements Runnable {

    private Printer printer;
    public LetterThread(Printer printer) {
        this.printer = printer;
    }
    @Override
    public void run() {
        printer.printLetter();
    }
}
