import java.util.Scanner;
public class Expe3 {
     //all about && operator
      public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
          System.out.println("please enter  the no");
          int no=sc.nextInt();
           if(no>1&&no<=10){
             System.out.println("The given no is the valid no");
           }else{
             System.out.println("The given no is invalid no");
           }
          
      }
    
}
