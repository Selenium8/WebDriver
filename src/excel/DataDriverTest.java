package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriverTest {

	public static void main(String[] args) throws Exception
	{
		UrlTest launch=new UrlTest();
		File src=new File("C:\\Users\\admin\\Desktop\\Selenium.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
				XSSFSheet ws=wb.getSheetAt(0);
				int rowCnt=ws.getLastRowNum();
				for (int i = 1; i< rowCnt; i++) 
				{
				String Url=ws.getRow(i).getCell(0).getStringCellValue();
				System.out.println(Url);
				launch.urlTest1(Url);
				}
				

	}

}
