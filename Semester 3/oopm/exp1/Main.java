import java.util.Scanner;
class Main {
	static Scanner sc =new Scanner(System.in);
	public static void main (String[] args){
	System.out.print("Enter the number: ");
	int n = sc.nextInt();
	System.out.print("Enter the no. of bits to shift to the right: ");
	int m = sc.nextInt();
	int ans = n>>m;
	System.out.println("Ans is: "+ans);
}	}