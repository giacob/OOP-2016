import java.util.Scanner;

public class Twist {
   public static int Sumnr(int number)
   {
	   int i,sum=0;
	   for(i=1;i<number;i++)
		   if(i%3==0 || i%5==0)
			   sum += i;
	   return sum;
   }
   
   
   public static void main(String[] args)
   {
	   Scanner in=new Scanner(System.in);
	   int number=in.nextInt();
	   System.out.printf("Suma multiplilor de 3 si 5 a numarului %d este: %d",number,Sumnr(number));
	   
			   
   }
}

// Pentru numaru asta nu merge 2147483647
