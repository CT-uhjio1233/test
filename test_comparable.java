import java.util.Arrays;
import java.util.Scanner;

public class test_comparable {
    public static void main(String[] args){
        Scanner cin=new Scanner(System.in);
        int num=cin.nextInt();
        int mod=cin.nextInt();
        compareto[] arr=new compareto[num];
        for(int i=0;i<num;i++){
            arr[i]=new compareto(cin.nextInt(),mod);
        }
        Arrays.sort(arr);
        System.out.println(num+"  "+mod);
        for(int i=0;i<num;i++){
            System.out.println(arr[i].a);
        }
        System.out.println(0+"  "+0);
    }
  
}
class compareto implements Comparable<compareto>{
    int a;
    int mod;
    compareto(int a,int b){
        this.a=a;
        this.mod=b;
    }
    @Override
    public int compareTo(compareto o) {
        if(a%mod>o.a%mod){
            return 1;
        }
        else if(a%mod==o.a%mod){
            if(this.a%2!=0&&o.a%2==0){
            	return -1;
            
            }
            else if(this.a%2==0&&o.a%2!=0){
            	return 1;
            }
            else if(this.a%2==0){
            	if(this.a>o.a){
            		return 1;
            	}
            	else{
            		return -1;
            	}
            
            }
            else{
            	if(this.a>o.a){
            	    return -1;
            	}
            	else{
            	    return 1;
            	}
            	
            }
        }
        else{
            return -1;
        }
       
    }

}