package com.priyanka.datta;

public class ThreadExample implements Runnable{

    public static void main(String[] args) {
        ThreadExample threadExample = new ThreadExample();
        Thread thread = new Thread(threadExample);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("thread is running");
    }
}
