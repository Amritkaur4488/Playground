import java.util.Scanner;
class Main
{
    public static void main(String args[])    
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
    
      System.out.print(sum(arr,n));
    }
    
  public static int sum(int arr[],int n)
  {
    int running_sum,max_sum,i;
    running_sum=arr[0];
    max_sum=arr[0];
    for( i=1;i<n;i++)
    {
      if(arr[i]>arr[i-1])
      {
        running_sum=running_sum+arr[i];
      }
      else
      {
        running_sum=arr[i];
      }
      if(running_sum>max_sum)
      {
        max_sum=running_sum;
      }
    }
       return max_sum;
    
   
  }
}