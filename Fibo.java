import java.util.Scanner;
public class Fibo{
      public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
           int i=1;
           int a=10;
           int b=11;
           while(i<=n){
             System.out.print(a);
              int c=a+b;
              a=b;
               b=c;
                i++;
           }

      }
}
    

