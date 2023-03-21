package abc;
import java.util.*;
import java.util.Scanner;

public class LeaderArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr=new Scanner(System.in);
		int n=sr.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sr.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			int flag=0;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					flag=1;
				}
			}
			if(flag==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.print(arr[n-1]);

	}

}
