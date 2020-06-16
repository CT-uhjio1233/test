
public class test_Ranable {
    public static void main(String[] args) {
        run h1 = new run();
        horse th1 ;
        horse th2 ;
        horse th3 ;

        th1 = new horse();
        th2 = new horse();
        th3 = new horse();
        th1.setName("h1");
        th2.setName("h2");
        th3.setName("h3");
        th1.start();
        th2.start();
        th3.start();
        try {
            th1.join();
            th2.join();
            th3.join();
        } catch (InterruptedException e) {
            System.out.println("main error");
        }
        System.out.println("all finished");
    }
}

class horse extends Thread {
    int f = 0;
    run r;
    public void run() {
        System.out.println(getName()+"  "+"still runing");
        try {
            sleep(1000);
            r=new run(getName());
            r.run();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
    }
}
class run implements Runnable{
    String name;
    run(){
    }   
    run(String name){
        this.name=name;
    }   
    public void run() {
        System.out.println(name+"  "+"finished");

    }
}