import java.util.*;
class Search{
	public static void main(String[] x){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to search:");
		int n=s.nextInt();
		int[] a={1,4,6,7,8,9,10};
		int i,f=0;
for(i=0;i<7;i++){
	 if(n==a[i]){
		f=1;
		break;
		}
	}
if(f==0){
	System.out.println("Given number not found in the array");
	}
else{
	System.out.println("Given number found in the array");
	}
	}
}