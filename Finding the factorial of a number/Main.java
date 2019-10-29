import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		Scanner in = new Scanner(System.in);
        int num = in.nextInt();
      int val=sum(num);
      	System.out.println(val);
    }
    public static int sum(int num)
    {
      if(num == 0)
      return 1;
      else
      return num*sum(num-1);
    }
}