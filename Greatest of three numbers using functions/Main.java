import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    
	    Scanner in = new Scanner(System.in);
	    int n1 = in.nextInt();
	    int n2 = in.nextInt();
	    int n3 = in.nextInt();
	    int result = large(n1, n2);// Function call
	    System.out.print(large(n1, n2));// Function call
	}
  public static int large(int n,int m)
  {
    int max;
    if(n<m)
    {
      max=m;
    }
    else
    {
      max=n;
    }
    return max;
  }
}