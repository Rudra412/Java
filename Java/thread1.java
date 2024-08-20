public class thread1 {
  public void run(){
        system.out.println("thread is running...");

   }
  public static void main(String[] args) {
      thread1 t1 = new thread1();
      t1.start();
  }
}
