package abc;
import java.util.*;
public class MaxCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr=new Scanner(System.in);
		int n=sr.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sr.nextInt();
		}
		int x=sr.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==x)
			{
				count++;
			}
		}
		System.out.print(count);

	}

}
