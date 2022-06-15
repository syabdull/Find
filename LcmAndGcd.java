import java.util.Scanner; 
 public class LcmAndGcd{
     public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
          int n1=sc.nextInt();
           int n2=sc.nextInt();
             while(n1%n2!=0){
                int rem=n1%n2;
                 rem=n2;
                 n2=n1;
             }
         
             System.out.println("lcm is"+n2);
         }

 }