
public class Twist1 {
	public static boolean Pal(int number)
	  {
		    int copy,inv=0;
		    copy=number;
		    while (number!=0){
		        inv=inv*10+number%10;
		        number=number/10;
		    }
		    if (inv==copy)
		    	return true;
		    else 
		    	return false;
		    			
	  }
	  
	  public static void main(String[] args)
	  {
		  int i,j;
		  int p=1;
		  for(i=9999;i>0;i--)
		  { for(j=9999;j>0;j--)
			  {  p= i*j;
			  if(Pal(p))
				  {System.out.printf("Cel mai mare palindrom este %d si este produsul dintre %d si %d\n",p,i,j);
	               break;
				  }  
	          }
		  break;
		  }
		  
	  }
	}
