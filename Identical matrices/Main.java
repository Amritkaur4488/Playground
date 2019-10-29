import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int i, j;
      int flag=0;
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        for(i = 0; i < r; i++)
        {
            for(j = 0; j < c; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
      int[][] matrix1 = new int[r][c];
        for(i = 0; i < r; i++)
        {
            for(j = 0; j < c; j++)
            {
                matrix1[i][j] = sc.nextInt();
            }
        }
      for(i = 0; i < r; i++)
        {
            for(j = 0; j < c; j++)
            {
               if(matrix[i][j]!=matrix1[i][j])
               {
                 flag=1;
                 break;
               }
            }
        }
      if(flag==0)
      {
        System.out.print("Yes");
      }
      else
      {
        System.out.print("No");
      }
    }
}