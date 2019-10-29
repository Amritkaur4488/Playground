import java.util.Scanner;
class Main
{
   public static int sum(int m)
  {
     int sum=0;
    for(int i=1;i<=m;i++)
    {
      sum =sum+i;
    }
    return sum;
  }
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int result=sum(n);
      System.out.print(result);
	}
}