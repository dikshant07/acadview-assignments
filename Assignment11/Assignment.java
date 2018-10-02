import java.io.*;
public class Assignment{
	public static void main(String[] args){
		File f=new File("C:/Users/dikshant/Desktop/exception handeling/Test1.txt");
		File f2=new File("C:/Users/dikshant/Desktop/exception handeling/Test2.txt");
try{
	FileInputStream fin=new FileInputStream(f);
	FileOutputStream fout=new FileOutputStream(f2);
	int i;
	i=fin.read();
	while(i!=-1){
		fout.write((char)i);
		i=fin.read();
		}
	fin.close();
	fout.close();
	}
		catch(IOException e){
		System.out.println(e);
	}
	try{	
		FileInputStream fin2=new FileInputStream(f2);
		int i;
		i=fin2.read();
		while(i!=-1){
			System.out.print((char)i);
			i=fin2.read();
			}
	fin2.close();
	}
		catch(IOException ee){
		System.out.println(ee);
		}
	}
}


		
	
	
