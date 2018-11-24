package assignment10;

public class Q4Thread {
    public static void main(String[] args) {
        // run object of thread 1
        new Thread1().start();
        // run thread 2
        new Thread(new Thread2()).start();
        for (int k = 0; k <= 10; k++) {
            System.out.println("Main thread, k = " + k);
        }
    }
}

class Thread1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Thread1, i = " + i);
        }
    }

}

class Thread2 implements Runnable {

    @Override
    public void run() {
        for (int j = 0; j <= 10; j++) {
            System.out.println("Thread2, j = " + j);
        }
    }

}