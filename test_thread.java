import java.util.ArrayList;
import java.util.List;

class Horse extends Thread {

    List<Horse> rank;

    public Horse(List<Horse> rank){
        this.rank=rank;
    }
    // 覆寫Thread方法run()
    public void run() {
            try {
                sleep(1000);
                System.out.println(getName()+"finished");
                rank.add(this);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                System.out.println(getName()+"error");
            }
    }
  }
public class test_thread{
    public static void main(String[] args){
       List<Horse> rank=new ArrayList<>();
        //產生Horse物件並啟動執行緒
        Horse h1 = new Horse(rank);
        Horse h2 = new Horse(rank);
        Horse h3 = new Horse(rank);
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
        System.out.println(rank);
        System.out.println("all finished");
    }
}