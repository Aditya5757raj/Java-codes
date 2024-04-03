class Thread1 extends Thread {
    public void run() {
        System.out.println("run thread");
    }
}

class Main {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();
        for (int i = 0; i < 200; i++) {
            System.out.println("main thread");
        }
    }
}
