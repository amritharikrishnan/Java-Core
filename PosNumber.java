import java.util.Scanner;
class PosNumber{
	public static void main(String[]args){
		int count=0,p=0,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Limit");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			System.out.print("Enter the Number : ");
			System.out.println();
			p=sc.nextInt();
			if(p>0){
				count=count+1;
				sum=sum+p;
			}
		}
		if(count!=0&&sum!=0){
			System.out.println("The Count of Positive :"+count);
			System.out.println("The Sum : "+sum);
		}
	}
}