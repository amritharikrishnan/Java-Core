import java.util.Scanner;
class BetweenAtoB{
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int count=0;
		double val=0.0,result=0.0;
		System.out.println("Enter the starting and end limits :");
		int s=sc.nextInt();
		count=s;
		int e=sc.nextInt();
		int l=e-s;
		System.out.println("The Numbers are : ");
		System.out.print(s+" ");
		for(int i=0;i<l;i++){
			count=count+1;
			if(count<=e)
			System.out.print(count+" ");
		}
	}
}