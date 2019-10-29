import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
        int arr_size = sc.nextInt();
        int arr[] = new int[arr_size];
        for(int idx = 0; idx <= arr_size - 1; idx++)
        {
            arr[idx] = sc.nextInt();
        }
      int mis_val=0;
      for(int i=1;i<=arr_size;i++)
      {
        boolean found=false;
        for(int j=0;j<=arr_size-1;j++)
        {
          if(arr[j]==i)
          {
            found=true;
            break;
          }
        }
        if(found==false)
        {
          mis_val=i;
          break;
        }
      }
      System.out.print(mis_val);
      
      
      
    }
}