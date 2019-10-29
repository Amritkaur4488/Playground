import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
        int arr_size = sc.nextInt();
        int arr[] = new int[arr_size];
        for(int index = 0; index < arr_size; index++)
        {
            arr[index] = sc.nextInt();
        }
        int sum_arr[] = new int[3 * arr_size];
        increasing_sub_array(arr_size, arr, sum_arr);
  }
  public static void increasing_sub_array(int arr_size,int arr[],int sum_arr[])
  {
    for(int i=0;i<arr_size;i++)
    {
      int key=arr[i];
      for(int j=i+1;j<=arr_size-1;j++)
      {
        if(arr[j]>key)
        {
          System.out.println(key+","+arr[j]+" ");
        }
      }
    }
  }
}