import java.util.*;
public class Prime{
public static void main(String[] x) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number:");
	int a=s.nextInt();
	int i,c;
for(int k=1;k<a;k++){
	c=0;
		for(i=1;i<=a;i++){ 
 		 if(k%i==0){
   			c++;
   			}
		 }
if(c==2){    
	System.out.print(k+" ");
	 }
	}
   }
}