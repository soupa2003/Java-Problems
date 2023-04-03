package subarray;
import java.util.*;
public class MaxSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr=new Scanner(System.in);
		int n=sr.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sr.nextInt();
		}
		int mch=0;
		int msf=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			mch+=arr[i];
			if(mch<arr[i])
			{
				mch=arr[i];
			}
			msf=Math.max(msf,mch);
		}
		System.out.println(msf);

	}

}
