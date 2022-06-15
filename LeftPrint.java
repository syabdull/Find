import java.util.Scanner;
public class LeftPrint {
     public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
           int temp=n;
           int count=1;
            while(temp>9){
                 temp=temp/10;
                 count=count*10;
                  
            }
            while(count!=0){
                 int digit=n/count;
                 System.out.println(digit);
                 n=n%count;
                 count=count/10;
            }
         
     }
    
}
