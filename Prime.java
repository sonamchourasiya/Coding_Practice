import java.util.Scanner;
public class Prime {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number");
         int n=sc.nextInt();
         for(int i=0;i<n;i++);
         int i;
         if(n==1)
         {
             System.out.println("not a prime number");
         }
         for(i=2;i<n;i++)
         {
             if(n%i==0)
             System.out.println("not a prime");
             break;
         }
         if(n==i)
         System.out.println("prime");
   }

}
