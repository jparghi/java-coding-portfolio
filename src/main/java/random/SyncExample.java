package random;

class SharedResource {
  void method() {
    synchronized (this) {  // Lock on the current object
      System.out.println(Thread.currentThread().getName() + " is executing");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName() + " has finished");
    }
  }
}

public class SyncExample {
  public static void main(String[] args) {
    SharedResource obj = new SharedResource();

    Thread t1 = new Thread(() -> obj.method(), "Thread 1");
    Thread t2 = new Thread(() -> obj.method(), "Thread 2");

    t1.start();
    t2.start();
  }
}
