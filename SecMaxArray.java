package abc;
import java.util.*;
public class SecMaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr=new Scanner(System.in);
		int n=sr.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sr.nextInt();
		}
		int max=arr[0];
		for(int i=1;i<n;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		int max2=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=max && arr[i]>max2)
			{
				max2=arr[i];
			}
		}
		System.out.print(max2);

	}

}
