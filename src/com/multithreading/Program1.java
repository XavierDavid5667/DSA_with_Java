package com.multithreading;

public class Program1 {
    private int buffer;

    private Object lock = new Object();

    public void produce() {
        synchronized (lock) {
            while (buffer >= 1) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            buffer++;
            System.out.println("Produced: " + buffer);
            lock.notify();
        }
    }

    public void consume() {
        synchronized (lock) {
            while (buffer == 0) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            buffer--;  // Consume an item
            System.out.println("Consumed: " + buffer);
            lock.notify();  // Notify the producer
        }
    }
        public static void main (String[]args){
        Program1 program1=new Program1();
         Thread thread1=new Thread(()->{
                 for(int i=0;i<5;i++){
                     program1.produce();
                 }
        });

        Thread thread2=new Thread(()->{
            for(int i=0;i<5;i++){
                program1.consume();
            }
        });
        thread1.start();
        thread2.start();
        }

    }
