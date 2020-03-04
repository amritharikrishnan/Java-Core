import java.util.Scanner;
class Amoeba{
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int count=0,innercount=0;
		int f=0,num1=0,num2=1;
		System.out.println("Enter the no. of Months :");
		int s=sc.nextInt();
		System.out.println("The Amoeba size is ");
		while(count<=s){
			if(innercount==(s-1)){
				System.out.print(num1+" ");
				break;
			}
			int old = num1 + num2;
            num1 = num2;
            num2 = old;
			count++;
			innercount++;
		}	
	}
}