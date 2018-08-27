import java.util.*;
public class Reverse{
public static void main(String[] x){
int num,rem,sum=0;
System.out.println("enter a number");
Scanner sc = new Scanner(System.in);
num= sc.nextInt();
while(num!=0){
rem=num%10;
sum=sum*10+rem;
num=num/10;
}
System.out.println("reversed number is ;"+sum);
}
}