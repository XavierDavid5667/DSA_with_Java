package com.multithreading;

public class Program2 {
    private int buffer;

    private boolean produced=false;

    private final Object lock=new Object();
    public void produce() {
        synchronized (lock) {
            while(produced) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            buffer++;
            produced=true;
            System.out.println("Produced: " + buffer);
            lock.notify();
        }
    }

    public void consume() {
        synchronized (lock) {
            while(!produced) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            produced=false;
            System.out.println("Consumed: " + buffer);
            lock.notify();
        }
    }
    public static void main(String[] args) {
        Program2 program2=new Program2();

        Thread thread =new Thread(()-> {
            for (int i = 0; i < 11; i++)
                program2.produce();

        },"Producer");
        Thread thread1=new Thread(()->{
            for(int j=0;j<11;j++){
                program2.consume();
            }
        },"Consumer");
        thread.start();
        thread1.start();
    }
}
