import java.util.Scanner;
class Main
{
  public static int square(int m)
  {
     int Square=m*m;
    return Square;
  }
	public static void main (String[] args)
    {
	 Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int result=square(n);
      System.out.print(result);
	} 
}