public class Session2Assignment3{
	public static void main (String[] args){

		int i=1;
		int j;
		int k =0;
		
		while (i>0 && i < 6) 
		{
		for (j=1 ; j <=i; j++)
		{
			System.out.print(j);
		}
		System.out.print("\n");
		if (i  < 5 && k==0){
		i++;}
		else { i--;
		k=1;
		}
		
		}
	
		}
}