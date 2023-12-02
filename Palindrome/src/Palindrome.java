
public class Palindrome {
	public  boolean isPalindrome(int n) {
		
		if(n<1000 || n>9999)return false;
		
		int temp=n;
		int sum=0;
		while(n>0) {
			sum=sum*10+n%10;
			n=n/10;
		}
		if(sum==temp)return true;
		else return false;
	}
}
