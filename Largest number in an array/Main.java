import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
      int len=sc.nextInt();
      int arr[]=new int[len];
      int max;
      if(arr[0]>arr[1])
      {
        max=arr[0];
      }
      else
        max=arr[1];
      for(int i=0;i<=len-1;i++)
      {
        arr[i]=sc.nextInt();
      }
      for(int i=0;i<=len-1;i++)
      {
      if(arr[i]>max)
        {
          max=arr[i];
        }
      }
      System.out.print(max);
    }
}