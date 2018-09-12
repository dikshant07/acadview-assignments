package o;
import java.util.Scanner;
public class Occurence {
Scanner s=new Scanner(System.in);
	String s1=s.nextLine();

String s2=s.nextLine();
void run() {
	 if(s1.contains(s2)==true) {
		  System.out.println("String2 contains in String1");
	 }else {
		  System.out.println("String2 doesn't contain in String1");
	 }
}
	public static void main(String[] args) {

	Occurence o=new Occurence();
	o.run();
	}
}