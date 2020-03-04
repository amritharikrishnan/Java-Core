import java.util.Scanner;
class AliceBird{
	public static void main(String[]args){
		int sum=0,r=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Bird Says :");
		int n=sc.nextInt();
		int len=Integer.toString(n).length();
		for(int i=0;i<len;i++){
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println("Patrick and Johnny must go in path - "+sum+" to find Alice");
	}
}