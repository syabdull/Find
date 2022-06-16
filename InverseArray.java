import java.util.Scanner;
public class InverseArray {
     public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
          int size=sc.nextInt();
           int [] A=new int[size];
           for(int i=0;i<size;i++){
             A[i]=sc.nextInt();
           }
            inVerse(A);
        


     }
      public static void inVerse(int []a){
           int pos=0;
            int [] B=new int[a.length];
            for(int i=0;i<a.length;i++){
                 int val=a[i];
                  B[val]=pos;
                  pos++;
            }

                for(int i:B){
                    System.out.print(i);
                }


      }
       
    
}
