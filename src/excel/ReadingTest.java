package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingTest {

	public static void main(String[] args) throws Exception 
	{
File src=new File("C:\\Users\\admin\\Desktop\\Selenium.xlsx");
FileInputStream fis=new FileInputStream(src);
XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheetAt(0);
		
		int rowCnt=ws.getLastRowNum();
/*String data1=ws.getRow(0).getCell(0).getStringCellValue();
String data2=ws.getRow(0).getCell(1).getStringCellValue();
System.out.println(data1+"---"+data2);*/
for (int i = 0; i <=rowCnt ; i++) 
{
	String data1=ws.getRow(i).getCell(0).getStringCellValue();
	String data2=ws.getRow(i).getCell(1).getStringCellValue();
	System.out.println(data1+"---"+data2);	
		}

	}
}
