import java.util.Scanner;
public class CheckPrime {
     public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
           System.out.println(isPrime(n));
           

     }
      public static boolean isPrime(int A){
         for(int i=2;i*i<=A;i++){
             if(A<=1){
                 return false;
             }
             if(A%i==0){
                 return false;
             }
         }




         return true;

      }
    
}
