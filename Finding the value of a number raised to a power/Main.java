import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
      int e=sc.nextInt();
      int res=1;
      while(e!=0)
      {
        res*=b;
        --e;
      }
      System.out.print(res);
    }
}