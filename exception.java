import java.util.*;
public class Main
    {
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         try {
           System.out.println("Enter the no of elements:");
           int n= sc.nextInt();
           int[] a =new int[n];
           System.out.println("Enter the array elements:");
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
             System.out.println("The array elements:");
            for(int i=0;i<n;i++)
            {
                System.out.print(a[i]+ " ");
         }
         System.out.println("Enter the position of the numbers to find the remaider:");
         int b=sc.nextInt();
         int c = sc.nextInt();
         int r= a[b]%a[c];
          System.out.println("Remainder of" +a[b]+"/"+a[c]+"is" +r);
     }
     catch(ArrayIndexOutOfBoundsException e)
     {
         System.out.println("Exception occured.Array Index out of bound exception ");
     }
     catch(ArithmeticException e)
     {
         System.out.println("Exception occured.division by zerro is not possible");
     }
    }
    }

