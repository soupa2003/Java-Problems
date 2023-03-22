package abc;
import java.util.*;

import java.util.Scanner;

public class UniqueElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr=new Scanner(System.in);
		int n=sr.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sr.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int temp=0;
			for(int j=0;j<n;j++)
			{
				if(arr[i]==arr[j] && i!=j)
				{
					temp=1;
					break;
				}
				
			}
			if(temp==0)
			{
				System.out.print(arr[i]+" ");
			}
		}

	}

}
