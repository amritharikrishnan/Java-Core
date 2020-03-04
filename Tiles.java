import java.util.Scanner;
class Tiles{
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and width of Room :");
		int l=sc.nextInt();
		int b=sc.nextInt();
		int rem=0,full=0;
		if((l%8)==0&&(b%8)!=0){
			rem= l/8;
		}
		else if((l%8)!=0&&(b%8)==0){
			rem=b/8;
		}
		else if((l%8)==0&&(b%8)==0){
			rem=0;
		}
		else{
			rem=(l/8)+(l/8)+1;			
		}
		full=(l/8)*(b/8);
		System.out.println("");
		System.out.println("Full = "+full);
		System.out.println("Remaining = +"rem);
	}
}