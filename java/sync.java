class Customer {
    int amount = 10000;

    synchronized void withdraw(int x) {
        if (x > amount) {
            System.out.println("Less balance, please deposit.");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Withdrawing");
            this.amount -= x;
            System.out.println("Withdrawal complete\nRemaining amount: " + amount);
        }
    }
     synchronized void deposit(int x) {
        System.out.println("Depositing");
        this.amount += x;
        System.out.println("Deposit complete\nTotal amount: " + amount);
        notify();
    }
}


}
class mythread extends Thread
{
  Customer t;
  
  public mythread(t)
  {
   this.Customer=t;  
  }
   void run()
   {
	   withdraw(5000);
   }
   
}
class mythread1
{

}
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        MyThread a1 = new MyThread(customer);
        MyThread  a2 = new MyThread(customer);

        a1.start();
        a2.start();
    }
}
