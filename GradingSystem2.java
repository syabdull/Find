import java.util.Scanner;
public class GradingSystem2 {
     public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         System.out.println("please enter the no");
          int a=sc.nextInt();
           int b=sc.nextInt();
            int c=sc.nextInt();
             if(a>=b){
                 if(a>=c){
                     System.out.println(a+" "+"is the greatest element");
                 }else{
                     System.out.println(c+" "+"is the greatest element");
                 }

             }else{
                if(b>=c){
                     System.out.println(b+"b is the greatest element");
                }else{
                     System.out.println(c+" "+"is the greatest element");
                }

             }

     }
    
}
