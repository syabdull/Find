import java.util.Scanner; 
public class RevNo{
    public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         int revNo=0;
          int n=sc.nextInt();
           while(n!=0){
               int rem=n%10;
                revNo=revNo*10+rem;
                n=n/10;
        
           }
           System.out.println(revNo);
           

    }
}