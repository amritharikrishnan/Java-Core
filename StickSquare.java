import java.util.Scanner;
class StickSquare{
	public static void main(String[]args){
		int sum=0,q=0,s=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of Sticks :");
		int in = sc.nextInt();
		q=in/4;
		s=q*2;
		System.out.println("Area of Largest Square made = "+s*s);
	}
}