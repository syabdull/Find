  import java.util.Scanner;
 public class Expe2 {
     public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
          int no1=sc.nextInt();
        int no2=sc.nextInt();
         if(no1==no2){
             System.out.println("both the nos are equal");
         }else if(no1>no2){
             System.out.println("no1 is greater than no2");
         }else{
             System.out.println("no2 is greater");
         }

     }
    
}
