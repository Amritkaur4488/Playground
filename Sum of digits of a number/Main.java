import java.util.Scanner;
class Main {
	public static void main (String[] args){
	Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
       int n1=n/10000;  //8
      int n2=n/1000;    //87
      int n3=n2%10;   // 7
      int n4=n/100;  // 876
      int n5=n4%10; // 6
      int n6=n/10; // 8764
      int n7=n6%10; // 4
      int n8=n%10; // 3
      int sum=n1+n3+n5+n7+n8;
      System.out.print(sum);
	}
}