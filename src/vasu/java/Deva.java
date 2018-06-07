package vasu.java;

public class Deva extends Vasu
{
	public void add(int i,int j)
	{
		int sum=i-j;
		System.out.println(sum);
	}
	
	public static void main(String[] args) 
	{
		Deva v=new Deva();
		
		v.add(40, 20);

	}

}
