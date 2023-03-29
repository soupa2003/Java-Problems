package strings;
import java.util.*;
public class pangram 
{
	public boolean checkIfPangram(String sentence){
	        int l=sentence.length();
	        if(l<26){
	            return false;
	        }
	        else {
	            int fr[]=new int[26];
	            for(int i=0;i<26;i++){
	                fr[i]=0;
	            }
	            for(int i=0;i<l;i++){
	                fr[sentence.charAt(i)-'a']++;
	            }
	            for(int i=0;i<26;i++){
	                if(fr[i]==0)
	                {
	                    return false;
	                }
	            }
	        }
	        return true;        
}
	  public static void main(String args[]){
	  Scanner sr=new Scanner(System.in);
	  String s=sr.next();
	  pangram obj=new pangram();
	  boolean x=obj.checkIfPangram(s);
	  if(x==true){
	      System.out.print("Pangram");
	  }
	  else{
	      System.out.print("Not Pangram");
	  }
}
}

		  
