import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int list[] = new int[n];
    for(int i = 0; i < n; i++)
    {
    list[i] = sc.nextInt();
    }
    perfect(list,n);
  }
  public static void perfect(int list[],int n)
  {
    boolean is_perfect=true;
    int batch_sum=list[0]+list[1]+list[2];
    for(int i=3;i<=(n-1);i=i+3)
    {
      int current_sum=list[i]+list[i+1]+list[i+2];
      if(current_sum!=batch_sum)
      {
        is_perfect=false;
      }
    }
    if(is_perfect==true)
    {
      System.out.print("Perfect Batch");
    }
    else
       System.out.print("Not a Perfect Batch");
  }
}