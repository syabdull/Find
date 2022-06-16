//java program to find the element in an array
  import java.util.Scanner; 
   public class  FindElement{
      public static void main(String[]args){
           Scanner sc=new Scanner(System.in); 
           int size=sc.nextInt();
            int [] A=new int[size];
             for(int i=0;i<size;i++){
                 A[i]=sc.nextInt();

             }
             int fun=sc.nextInt();
      
    System.out.println("The index of the array at which the element is present is"+findE(A,fun));
      }
       public static int findE(int [] a,int element){
         for(int i=0;i<a.length;i++){
             if(a[i]==element){
                   return i;
             }
         }


           return -1;

       }
   
   }