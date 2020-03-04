import java.util.Scanner;
class ChessMaxBishop{
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Board size : ");
		int g=sc.nextInt();
		System.out.println("The Maximum number of Bishops Filled : "+(g+(g-2)));
	}
}