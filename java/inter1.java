class MyThread implements Runnable {
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println("child thread");
        }
    }
}

class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread(); 
        Thread t1 = new Thread(myThread); 
        t1.start();
        for (int i = 0; i < 15; i++) {
            System.out.println("main thread");
        }
    }
}
