import java.util.Scanner;
public class ReverseAnArray{
     public static void main(String[]args){
          Scanner sc=new Scanner(System.in);
           int size=sc.nextInt();
            int [] A=new int[size]; 
              for(int i=0;i<size;i++){
                 A[i]=sc.nextInt();
              }
               reverseArra(A);
     }
      public static void reverseArra(int [] a){
           int s=0;
            int l=a.length-1;
             while(s<=l){
                 int temp=a[s];
                a[s]=a[l];
                 a[l]=temp;
                  s++;
                  l--;

             }
              for(int i:a){
                 System.out.print(i);
              }

      }
    
}
