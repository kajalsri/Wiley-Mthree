package com.wiley;
import com.wiley.student;
public class standard {

	student sd[]=new student[8];
	String name[]= {"raj","simran","xyz","rsw","shhgsh","shjgchjs","ghcsh","aman"};
	int engg[]= {12,34,33,65,22,1,45,76};
	int math[]={13,13,34,65,23,100,45,76};
	int sci[]={55,32,43,35,12,1,5,46};
	int j=1,index1,index2;
	public void array()
	{
		for(int i=0;i<8;i++)
		{
			sd[i]=new student(j,name[i],engg[i],math[i],sci[i]);
			j++;
		}
	}



	public void Ascendingorder()
	{
		System.out.println("elements in Ascending order");
		for(int i=0;i<8;i++)
		{
			
			System.out.println("RollNo: "+sd[i].getRollno()+" Name: "+sd[i].getStudname());
			
		}
		System.out.println("================================================");
	}
	public void Highpercentage()
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<8;i++)
		{
			int temp=sd[i].getMarksineng()+sd[i].getMarksinmaths()+sd[i].getMarksinscience();
			if(temp>max)
			{
				max=temp;
				index1=i;
			}
		}
		System.out.println("Highest Percentage--> RollNo:"+sd[index1].getRollno()+" Name:"+sd[index1].getStudname());
	}
	public void highMath()
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<8;i++)
		{
			int temp=sd[i].getMarksinmaths();
			if(temp>max)
			{
				max=temp;
				index2=i;
			}
		}
		System.out.println("Highest Marks in maths--> RollNo:"+sd[index2].getRollno());
		System.out.println(" Name:"+sd[index2].getStudname());
	}
	}

	


