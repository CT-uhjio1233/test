
public class test_thread{
    public static void main(String[] args){
        Thread thr = Thread.currentThread();
        System.out.println("目前執行緒名稱:"+thr.getName());
        thr.setName("DEMO");
        System.out.println("更改後的名稱:"+thr.getName());
    }
}