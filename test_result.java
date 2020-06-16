import java.util.Arrays;
import java.util.Comparator;

public class test_result {
    public static void main(String[] args){
       
        result[] arr=new result[20];
        for(int i=0;i<20;i++){
            arr[i]=new result(i+1,(int)(Math.random()*1000%100)+1,(int)(Math.random()*1000%100)+1);
        } 
        result[] cop=Arrays.copyOf(arr,arr.length); 

        Arrays.sort(arr,result.proc);
        System.out.println("pro:");
        for(int i=0;i<20;i++){
            System.out.println(arr[i].id+":"+arr[i].pro.a);
        }

        Arrays.sort(arr,result.chc);
        System.out.println("ch:");
        for(int i=0;i<20;i++){
            System.out.println(arr[i].id+":"+arr[i].ch.a);
        }

        System.out.println("result");
        for(int i=0;i<20;i++){
            System.out.println(cop[i].id+":"+cop[i].pro.a+"  "+cop[i].ch.a);
        }
    }
   
}
class result{
    int id;
    score pro;
    score ch;
    result(int a,int b,int c){
        this.id=a;
        this.pro=new score(b);
        this.ch=new score(c);
    }
    static Comparator<result> proc=new Comparator<result>() {
        public int compare(result o1, result o2) {
            return o1.pro.compareTo(o2.pro);
        }
    }; 
    static Comparator<result> chc=new Comparator<result>() {
        public int compare(result o1, result o2) {
            return o1.ch.compareTo(o2.ch);
        }
    }; 
    static Comparator<result> resc=new Comparator<result>() {
        public int compare(result o1, result o2) {
            return o1.pro.compareTo(o2.pro);
        }
    }; 
}
class score implements Comparable<score>{
    int a;
    score(int a){
        this.a=a;
    }

    @Override
    public int compareTo(score o) {
        
        return o.a-this.a;
    }
}
