import java.util.Scanner;
public class MainExpe {
     public static void  main(String[]args){
         Scanner sc=new Scanner(System.in);
          System.out.println("please enter  your no"); 
            int n=sc.nextInt();
             if(n>90){
                 System.out.println("Excellent");
             }else if(n>80&&n<=90){
                 System.out.println("good");
             }else if(n>70&&n<=80){
                System.out.println("fair");
             }else if(n>60&&n<=70){
                 System.out.println("meet expections");
             }else{
                System.out.println("below par");
             }

     }
    
}
