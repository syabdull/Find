import java.util.Scanner;
public class InverseAgain {
     public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
           int sum=0;
           int pos=1;
        while(n!=0){
               int rem=n%10;
                int val=pos*(int)Math.pow(10,rem-1);
                sum=sum+val;
                pos++;
                 n=n/10;
            
        }
        System.out.println(sum);

     }
    
}
