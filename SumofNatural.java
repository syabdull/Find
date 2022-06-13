import java.util.Scanner; 
 public class SumofNatural{
     public static void main(String[]args){
         Scanner sc=new Scanner(System.in); 
         int n=sc.nextInt();
          int sum=0;
        // not an improved version
         for(int i=1;i<=100;i++){
             sum=sum+i;
         }
          System.out.println(sum);

     }

 }