import java.util.*;
import java.util.Arrays;
import java.lang.String;
class NewChannel
{
	 String New_Program_Name;
	 String Anchor; 
	 int Month_of_Broadcasting;
	 double TRP_Rating; 
	 int Business;
	 public NewChannel(String New_Program_Name,String Anchor,int Month_of_Broadcasting,double TRP_Rating,int Business) 
	 { 
		this.New_Program_Name=New_Program_Name; 
		this.Anchor=Anchor; 
		this.Month_of_Broadcasting=Month_of_Broadcasting; 
		this.TRP_Rating=TRP_Rating; this.Business=Business; 
	}
	public void display() 
	{
		System.out.println("\nThe program name is"+New_Program_Name+"\nThe Anchor name is\n"+Anchor+"\nThe Month is"+Month_of_Broadcasting+"\nTRP ratings is"+TRP_Rating+"\nThe amount of profit is"+"in million is"+Business);
	} 
} 
public class TRP_Ratings
{ 
	public static void main(String ar[])
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of inputs:");
		int n=sc.nextInt();
		NewChannel[] o=new NewChannel[n];
		for(int i=0;i<n;i++) 
		{
			System.out.println("\n----------Enter details----------- "); 
			System.out.println("\nEnter the program name : "); 
			String a=sc.next();
			System.out.println("\nEnter the Anchor name : ");
			String b=sc.next(); 
			System.out.println("\nEnter the month : "); 
			int c=sc.nextInt();
			System.out.println("\nEnter the TRP_Rating : ");
			double d=sc.nextDouble(); 
			System.out.println("\nEnter the Business profit (in millions) :");
			int t=sc.nextInt(); 
			o[i]=new NewChannel(a,b,c,d,t);
		} 
		System.out.println("*********************************************");
		String[] strArray=new String[n];
		for(int j =0; j < n; j++) 
		{ 
			strArray[j]=o[j].Anchor;
		}
		int max= 0;
	        String res = "";
	        int count=1;
	        for (int i = 0; i < n; i++) 
		{
	        	for (int j = i + 1; j < n; j++)
	        	{
	          		if (strArray[j].equals(strArray[i])) 
	          		{
	            			count++;
	          		}
		        }
			if (count > max) 
	     		{
	          		res = strArray[i];
	          		max = count;
	       		}
	        }
		if(count==1)
		{
			System.out.println("There is no busy anchor");
		}
		else
		{
	      		System.out.println(res +"  is the busy anchor");
	      		System.out.println("No of repeated times: " + max);
		}	
		int big=o[0].Business; 
		NewChannel output = o[0]; 
		for(int j =0; j < o.length; j++) 
		{
			 if(big<o[j].Business) 
			 { 
				big=o[j].Business; output = o[j];
			 } 
		} 
		System.out.println("The biggest profit"+"\n"+"Program name : "+output.New_Program_Name+"\n"+"The profit amount : "+output.Business);
	} 
}
/*
OUTPUT 1:-

F:\Java>javac MiniProject1.java

F:\Java>java MiniProject1
Enter number of inputs:
4

----------Enter details-----------

Enter the program name :
startmusic

Enter the Anchor name :
priyanka

Enter the month :
6

Enter the TRP_Rating :
8

Enter the Business profit (in millions) :
6

----------Enter details-----------

Enter the program name :
biggboss

Enter the Anchor name :
kamal

Enter the month :
4

Enter the TRP_Rating :
9

Enter the Business profit (in millions) :
8

----------Enter details-----------

Enter the program name :
supersinger

Enter the Anchor name :
makapa

Enter the month :
7

Enter the TRP_Rating :
8

Enter the Business profit (in millions) :
7

----------Enter details-----------

Enter the program name :
mirchi

Enter the Anchor name :
chaaru

Enter the month :
4

Enter the TRP_Rating :
8

Enter the Business profit (in millions) :
10
*********************************************
There is no busy anchor
The biggest profit
Program name : mirchi
The profit amount : 10


OUTPUT 2:-
F:\Java>javac MiniProject1.java

F:\Java>java MiniProject1
Enter number of inputs:
4

----------Enter details-----------

Enter the program name :
neeya_naana

Enter the Anchor name :
gopinath

Enter the month :
4

Enter the TRP_Rating :
8.7

Enter the Business profit (in millions) :
4

----------Enter details-----------

Enter the program name :
super_singer

Enter the Anchor name :
priyanka

Enter the month :
5

Enter the TRP_Rating :
9.7

Enter the Business profit (in millions) :
6

----------Enter details-----------

Enter the program name :
start_music

Enter the Anchor name :
priyanka

Enter the month :
8

Enter the TRP_Rating :
8.8

Enter the Business profit (in millions) :
5

----------Enter details-----------

Enter the program name :
biggboss

Enter the Anchor name :
kamal

Enter the month :
9

Enter the TRP_Rating :
8.9

Enter the Business profit (in millions) :
7
priyanka  is the busy anchor
No of repeated times: 2
The biggest profit
Program name : biggboss
The profit amount : 7

*/