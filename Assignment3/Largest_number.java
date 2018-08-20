class Largest_number{
	public static greatest(int a, int b, int c){
		return (a > b) ? (a> c ? a : c) : (b > c ? b : c);
	}
	public static void main(String args[]){
		int a=1, b=2, c=3, largest;
		largest = greatest(a, b, c);
		System.out.println("Largest number is: "+largest);
	}
}