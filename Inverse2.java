import java.util.Scanner;
public class Inverse2 {
     public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int pos=1;
         int sum=0;
           while(n!=0){
              int digit=n%10;
              n=n/10;
               int val=pos*(int)Math.pow(10,digit-1);
              pos++;

           }
        }
    
}
