import java.util.*;
public class Petroleum 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Please Enter 1.LPG 2.Unleaded 3.Diesel 4.Premium Unleaded");
		int n=s.nextInt();
		if(n==1) 
		{
			System.out.println("give the litres below 50");
			System.out.println("Please Enter the Amount of Litres to buy the LPG");
			int a=s.nextInt();
			
			if(a>50) 
			{
				System.out.println("Please Enter Minimum Amount of Litres");
			}
			else 
			{
			int b=a*40;
			System.out.println("Amount to be paid : "+b);
			System.out.println("Notes Of Value : Enter denomiations of=5rs  ,  Enter denominations of=10rs  &  Enter denominations of=20rs");
			int c=s.nextInt();
			int d=s.nextInt();
			int e=s.nextInt();
			int total=(c*5) + (d*10) + (e*20);
			if(b==total) {
				System.out.println("Transaction Completed");
			}else if(b<total) {
				int f=total-b;
				System.out.println("Balance Amount to be paid to the customer : "+f);
			}else {
				int g=b-total;
				System.out.println("Balance Amount you have to pay : "+g);
			}
		}
	}
	if(n==2) {
		System.out.println("Please Enter the Amount of Litres to buy the Unleaded");
		int a=s.nextInt();
		if(a>50) {
			System.out.println("Please Enter Minimum Amount of Litres");
		}else {
			int b=a*70;
			System.out.println("Amount to be paid : "+b);
			System.out.println("Notes Of Value : Enter 1 for=5rs  ,  Enter 2 for=10rs  &  Enter 3 for=20rs");
			int c=s.nextInt();
			int d=s.nextInt();
			int e=s.nextInt();
			int total=(c*5) + (d*10) + (e*20);
			if(b==total) {
				System.out.println("Transaction Completed");
			}else if(b<total) {
				int f=total-b;
				System.out.println("Balance Amount you have to pay : "+f);
			}else {
				int g=b-total;
				System.out.println("Balance Amount to be paid to the customer: "+g);
			}
			
		}
	}
	if(n==3) {
		System.out.println("Please Enter the Amount of Litres to buy the Diesel");
		int a=s.nextInt();
		if(a>50) {
			System.out.println("Please Enter Minimum Amount of Litres");
		}else {
			int b=a*80;
			System.out.println("Amount to be paid : "+b);
			System.out.println("Notes Of Value : Enter 1 for=5rs  ,  Enter 2 for=10rs  &  Enter 3 for=20rs");
			int c=s.nextInt();
			int d=s.nextInt();
			int e=s.nextInt();
			int total=(c*5) + (d*10) + (e*20);
			if(b==total) {
				System.out.println("Transaction Completed");
			}else if(b<total) {
				int f=total-b;
				System.out.println("Balance Amount you have to pay : "+f);
			}else {
				int g=b-total;
				System.out.println("Balance Amount to be paid to the customer: "+g);
			}
			
		}
	}
	if(n==4) {
		System.out.println("Please Enter the Amount of Litres to buy the Premium Unleaded");
		int a=s.nextInt();
		if(a>50) {
			System.out.println("Please Enter Minimum Amount of Litres");
		}else {
			int b=a*90;
			System.out.println("Amount to be paid : "+b);
			System.out.println("Notes Of Value : Enter 1 for=5rs  ,  Enter 2 for=10rs  &  Enter 3 for=20rs");
			int c=s.nextInt();
			int d=s.nextInt();
			int e=s.nextInt();
			int total=(c*5) + (d*10) + (e*20);
			if(b==total) {
				System.out.println("Transaction Completed");
			}else if(b<total) {
				int f=total-b;
				System.out.println("Balance Amount you have to pay : "+f);
			}else {
				int g=b-total;
				System.out.println("Balance Amount to be paid to the customer: "+g);
			}
		}
	}
}
}