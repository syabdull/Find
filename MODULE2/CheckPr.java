package MODULE2;
import java.util.Scanner;
public class CheckPr{
     public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
          isPr(a);

         
     }
      public static void  isPr(int n){

         for(int i=0;i*i<=n;i++){
             if(n<=1){
                System.out.println("not a prime");
             }else if(n%i==0){
                 System.out.println("not a prime");
             }else{
                System.out.println("Prime");
             }
         }
      }
    
}
