package b;
abstract class animals {
	String breed,colour,name;
	abstract void eat();
	void speak() {
		System.out.println("Love Speaking.");
	}
}
class dog extends animals{
	dog(String breed,String colour,String name){
	this.breed=breed;
	this.colour=colour;
	this.name=name;
	}
	void me() {
		System.out.println("Name is: "+name);
		System.out.println("Breed is: "+breed);
		System.out.println("Colour is: "+colour);
	}

	void eat(){
		System.out.println("I eat pedigree.");
			}

}
public class main {

	public static void main(String[] args) {

     animals an=new dog("Retriever","Brown","Bruno");
	dog d=new dog("Retriever","Brown","Bruno");
     d.me();
    an.eat();
	an.speak();
	}

}