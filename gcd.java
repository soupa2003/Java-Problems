package demo;
import java.util.*;
public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr=new Scanner(System.in);
		int n=sr.nextInt();
		int m=sr.nextInt();
		int gcd=1;
		for(int i=1;i<=n && i<=m;i++)
		{
			if(n%i==0 && m%i==0)
			{
				gcd=i;
			}
		}
		System.out.print(gcd);
			
		

	}

}
