import java.io.*;
public class Createfile{
	public static void main(String[] args){
File f= new File("C:/Users/Dikshant/Desktop/exception handeling/Create.java");
if(!f.exists()){
try{
f.createNewFile();
System.out.println("New File Created");
}
catch(IOException e){
System.out.println(e);
}
}
}
}

