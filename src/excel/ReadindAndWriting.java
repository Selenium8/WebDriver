package excel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadindAndWriting
{

	public static void main(String[] args) throws IOException 
	{
		String textFile="D:\\sunilData.txt";
		File Fc=new File(textFile);
		Fc.createNewFile();
		
		FileWriter fw=new FileWriter(textFile);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Hi");
		bw.newLine();
		bw.write("Selenium");
		FileReader fr=new FileReader(textFile);
		BufferedReader br= new BufferedReader(fr);
		String x="";
		while ((x=br.readLine())!=null)
		{
		System.out.println(x +"\n");
		}
		
		

	}

}
