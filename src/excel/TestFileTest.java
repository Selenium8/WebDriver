package excel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileTest {

	public static void main(String[] args) throws IOException
	{
		
String textFile="D:\\Ranga1234567.txt";
/*File Fc=new File(textFile);
Fc.createNewFile();
FileWriter fw=new FileWriter(textFile);
BufferedWriter bw=new BufferedWriter(fw);
bw.write("Vasu");
bw.newLine();
bw.write("Selenium");
bw.close();*/

FileReader fr=new FileReader(textFile);
BufferedReader br=new BufferedReader(fr);

String content="";
while ((content=br.readLine())!=null)
{
	String [] dataSplit=content.split("#");
	String Username=dataSplit[0];
	String Password=dataSplit[1];
	System.out.println(Username+"----"+Password);
	
}
	
	}
}
