import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class test_comparator {
    public static void main(String[] args){
        Scanner cin=new Scanner(System.in);
        int num=cin.nextInt();
        int mod=cin.nextInt();
        clum[] arr=new clum[num];
        for(int i=0;i<num;i++){
            arr[i]=new clum(cin.nextInt(),mod);
        }
        cin.nextInt();cin.nextInt();
        Arrays.sort(arr,clum.clum_comparator);
        System.out.println(num+" "+mod);
        for(int i=0;i<num;i++){
            System.out.println(arr[i].a);
        }
        System.out.println("0 0");
        cin.close();
    }
}
class clum{
    int a;
    int mod;
    clum(int a,int b){
        this.a=a;
        this.mod=b;
    }
    public static  Comparator<clum>  clum_comparator=new Comparator<clum>(){
        public int compare(clum a,clum b){
            if(a.a%a.mod>b.a%b.mod){
                return 1;
            }
            else if(a.a%a.mod==b.a%b.mod){
                if(a.a%2==0 && b.a%2!=0){
                    return 1;
                }
                else if(b.a%2==0 && a.a%2!=0){
                    return -1;
                }
                else if(a.a%2==0){
                    if(a.a>b.a){
                        return 1;
                    }else{
                        return -1;
                    }
                }
                else{
                    if(a.a>b.a){
                        return -1;
                    }else{
                        return 1;
                    }
                }
            }
            else{
                return -1;
            }
        }
    };
}