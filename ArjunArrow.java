import java.util.Scanner;
class ArjunArrow{
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Goal Score:");
		int g=sc.nextInt();
		int turn=0,sum=0;
		while(sum<g){
			int n=sc.nextInt();
			sum=sum+n;
			turn=turn+1;
		}
		System.out.println("The number of turns is "+turn);
	}
}