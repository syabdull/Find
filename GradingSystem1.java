import java.util.Scanner;
 public class GradingSystem1 {
     public static void  main(String[]args){
         Scanner sc=new Scanner(System.in); 
          System.out.println("pleae enter  the no.s");
           int a=sc.nextInt();
           int b=sc.nextInt();
            int c=sc.nextInt();
            if(a>b&& a>c){
                 System.out.println(a+" "+"is the greatest element");
            }else if(b>a&&b>c){
                 System.out.println(b+" "+"is the greatest element");
            }else{
                 System.out.println(c+" "+"is the greatest element");
            }
        
     }
    
}
