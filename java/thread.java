class A1 extends Thread {
    public void run() {
        System.out.println("A start running");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("A completed");
    }
}

class B1 extends Thread {
    private Thread threadA1;

    B1(Thread a1) {
        this.threadA1 = a1;
    }

    public void run() {
        try {
            threadA1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("B is working now");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("B is completed");
    }
}

class C1 extends Thread {
    private Thread threadB1;

    C1(Thread b1) {
        this.threadB1 = b1;
    }

    public void run() {
        try {
            threadB1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("C is working now");
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("C is completed");
    }
}

class Main {
    public static void main(String[] args) {
        A1 a1 = new A1();
        B1 b1 = new B1(a1);
        C1 c1 = new C1(b1);

        a1.start();
        b1.start();
        c1.start(); 
    }
}

