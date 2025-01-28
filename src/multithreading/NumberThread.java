package multithreading;

public class NumberThread implements Runnable{

    private Printer printer;

    public NumberThread(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.printNumber();
    }
}
