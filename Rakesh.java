public class Rakesh {

	public static void main(String[] args) {
		
		int flage=0;
		int n;
		
		for( n=2;n<=20;n++)
		{ flage=0;
		for( int i=2;i<=n/2;i++)
		
		{
			if(n%i==0)
			{
			flage=1;
			break;}}
		 if(flage==0)
		   System.out.println(n);}}
	}
