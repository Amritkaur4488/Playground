import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       int len = in.nextInt();
       int arr[] = new int[len];
       for(int index = 0; index <= len - 1; index++)
       {
           arr[index] = in.nextInt();
       }
    
      int value=in.nextInt();
      sum (len,arr,value);
    }
  
      public static void sum(int len,int arr[], int val)
      {
        int sum=0;
         for(int index1 = 0; index1 <len; index1++)
        {
            for(int index2 = index1 + 1; index2 <len ; index2++)
            {
               sum=arr[index1]+arr[index2];
            
              if(sum==val)
              {
                
                System.out.println(arr[index1]+","+" "+arr[index2]);
                
              }
            }
         }
      }
    
}