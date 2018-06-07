package com.practies;

public class ReuseTestCases
{

	public static void main(String[] args) 
	{
		String url="http://opensource.demo.orangehrmlive.com";
		FunLibrary v=new FunLibrary();
		String results=v.appLaunch(url);
System.out.println(results);
	}

}
