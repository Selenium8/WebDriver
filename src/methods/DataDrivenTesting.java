package methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTesting
{
	public static void main(String[] args) throws Exception 
	{
		FunLibrary v=new FunLibrary();
		v.appLaunch("http://opensource.demo.orangehrmlive.com/");
		v.appLogin("Admin", "admin");
		
		File src=new File("C:\\Users\\qedge\\Desktop\\TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		int rowCnt=ws.getLastRowNum();
		System.out.println(rowCnt);
		
		for (int i = 1; i <=rowCnt; i++)
		{
			String fName=ws.getRow(i).getCell(0).getStringCellValue();
			String lName=ws.getRow(i).getCell(1).getStringCellValue();
			//System.out.println(data1+"---"+data2);
			String results=v.empAdd(fName, lName);
			ws.getRow(i).createCell(2).setCellValue(results);
			FileOutputStream fos=new FileOutputStream(src);
			
			wb.write(fos);
					
		}
		
wb.close();


	}

}
