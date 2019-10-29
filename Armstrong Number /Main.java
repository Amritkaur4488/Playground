import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i;
      int s=n;
      int sum=0;
      while(n!=0)
      {
        int num=n%10;
         sum=sum+num*num*num;
        n=n/10;
      }
      if(sum==s)
      {
        System.out.println("Armstrong Number");
      }
      else
        System.out.println("Not a Armstrong Number");
	}
}