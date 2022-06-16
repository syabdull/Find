import java.util.Scanner;
public class Span {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
         int size=sc.nextInt(); 
        int [] A=new int[size];
         for(int i=0;i<size;i++){
             A[i]=sc.nextInt();
              
             }
               spanOfAnArray(A);

         }
          public static void spanOfAnArray(int [] a){
               int max=Integer.MIN_VALUE;
               int min=Integer.MAX_VALUE;


                for(int i=0;i<a.length;i++){
                    if(a[i]>max){
                         max=a[i];
                    }else if(a[i]<min){
                         min=a[i];
                    }
                }
                 System.out.println(max);
                 System.out.println(min);

                int val=max-min;

                System.out.println("The span of an array"+val);

          }
    
    
}
