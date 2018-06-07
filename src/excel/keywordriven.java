package excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class keywordriven 
{
	static String xlpath="C:\\Users\\FP\\Downloads\\Keywords.xlsx";
	static int tccount,tscount;
	static String tcexe,tcid,tstcid,keyword,res;
	static boolean flag;
	@Test
	public void keywordprg() throws IOException
	{
		orangehrmmaster login=new orangehrmmaster();
		
		FileInputStream fi=new FileInputStream(xlpath);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws1=wb.getSheet("TestCases");
		XSSFSheet ws2=wb.getSheet("TestSteps");
		tccount=ws1.getLastRowNum();
		tscount=ws2.getLastRowNum();
					
		for (int i = 1; i <=tccount; i++)
		{
			tcexe=ws1.getRow(i).getCell(2).getStringCellValue();
			if(tcexe.equalsIgnoreCase("y"))
			{
				
				tcid=ws1.getRow(i).getCell(0).getStringCellValue();
				for (int j = 1; j <=tscount; j++)
				{
					tstcid=ws2.getRow(j).getCell(0).getStringCellValue();
					if (tstcid.equalsIgnoreCase(tcid))
					{
						keyword=ws2.getRow(j).getCell(4).getStringCellValue();
						
						
						switch (keyword) 
						{
						case "LaunchApp":
							
							
							res=login.LaunchApp("Http://opensource.demo.orangehrmlive.com/");
							break;
						case "Login":
							res=login.login();
							break;
						
						case "EmpReg":
							
							res=login.empreg();
							break;
						case "Logout":
							res=login.Logout();
							break;
						

						}
						
						//result updation  in teststeps sheet
						
						ws2.getRow(j).createCell(3).setCellValue(res);
						
						//result updation in testcase sheet
						if (!ws2.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("fail"))
						{
							ws1.getRow(i).createCell(3).setCellValue(res);
						}
						else
						{
							ws1.getRow(i).createCell(3).setCellValue("fail");
						}
						
					}
					
					
				}
			}
				
				else 
				{
					ws1.getRow(i).createCell(3).setCellValue("Blocked");
				}
				
			
			
		}
		FileOutputStream fo=new FileOutputStream(xlpath);
		wb.write(fo);
		
		wb.close();
		
		
	}

}
