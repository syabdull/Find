import java.util.Scanner;
public class MultiTable {
     // java progra  to print  the multiplication table 
     public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
          System.out.println("please enter the no");
          int n=sc.nextInt();
           for(int i=1;i<=10;i++){
            System.out.println(n+" "+"*"+" "+i+" "+"="+" "+n*i);
           }

     }
    
}
