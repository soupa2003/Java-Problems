package abc;
import java.util.*;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr=new Scanner(System.in);
		int n=sr.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n-1;i++)
		{
			arr[i]=sr.nextInt();
		}
		int sum=(n*(n+1))/2;
		for(int i=0;i<n-1;i++)
		{
			sum-=arr[i];
		}
		System.out.print(sum);

	}

}
