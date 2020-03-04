import java.util.Scanner;
class Series{
	public static void main(String[]args){
		int count=0,p=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Limit");
		int l=sc.nextInt();
		System.out.println("The Numbers are :");
		for(int i=2;i<=l;i++){
			count=0;
			for(int j=i;j>=1;j--){
				if(i%j==0){
					count=count+1;
				}
			}
			if(count==2){
				p=p+1;
				if(p%2!=0){
					System.out.print(i+" ");
				}
			}
		}
	}
}