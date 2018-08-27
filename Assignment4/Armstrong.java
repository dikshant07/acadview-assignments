import java.util.*;
public class Armstrong{

	public static void main(String[] x){
		int num,rem,sum=0,tempNum;

		System.out.println("Enter a number");

		Scanner sc= new Scanner(System.in);

		num=sc.nextInt();

		tempNum=num;
		

		while(tempNum!=0){
			rem=tempNum%10;

			
			sum=sum+(int)Math.pow(rem,3);
			

			tempNum=tempNum/10;
			
		}
		
		
		if(sum==num){
			System.out.println(num+": is Armstrong");
		}
		else{
			System.out.println(num+": is not Armstrong");
		}
	}
}