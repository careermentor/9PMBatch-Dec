package pkg2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileHandling 
{
	
	public static void readprop() throws Exception
	{
		FileReader fr = new FileReader("./TestData/file.properties");
		
		Properties prop = new Properties();
		
		prop.load(fr);   //load the entire data into memory
		
		System.out.println(prop.get("tool"));
		System.out.println(prop.get("url"));
		
	}
		
		
		
	
	public static void writedata() throws Exception
	{
		File f = new File("./TestData/xyz.txt");
		
		FileWriter fw = new FileWriter(f,true);
		fw.write("\nthis is forth line");
		fw.flush();
		fw.close();
		
	}
	

	public static void readdata() throws Exception
	{
		//File f = new File("C:\\Users\\Santosh\\Desktop\\file.txt");   //file connection
		
		File f = new File("./TestData/abc.txt");  //file connection
		
		FileReader fr = new FileReader(f);
		
		int r = fr.read();   //16
		
		
		
		while(r!=-1)  //16!=-1,104!=-1, -1!=-1
		{
			System.out.print((char)r);
			r = fr.read();  //104
		}
		
		
		//BufferedReader br = new BufferedReader(fr);
		//br.readLine();
		
	}
	
	public static void main(String[] args) throws Exception {
		
		FileHandling.readprop();;
		FileHandling.writedata();
	}
	
}
