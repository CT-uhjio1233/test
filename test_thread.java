class Horse extends Thread {
    // 覆寫Thread方法run()
    public void run() {
            try {
                sleep(1000);
                System.out.println(getName()+"finished");
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                System.out.println(getName()+"error");
            }
    }
  }
public class test_thread{
    public static void main(String[] args){
       
        //產生Horse物件並啟動執行緒
        Horse h1 = new Horse();
        Horse h2 = new Horse();
        Horse h3 = new Horse();
        h1.setName("1");
        h2.setName("2");
        h3.setName("3");
        h1.start();
        h2.start();
        h3.start();
        try{
            h1.join();
            h2.join();
            h3.join();
        }catch(InterruptedException e){
            System.out.println("main error");
        }
        System.out.println("all finished");
        
    }
}