package comcalculator1;

import java.util.*;
public  class personnalCalculator {
	static int FinalNetworth=0;
	static int amount=0,income=0,profit=0,HomeExp=0
			,totalAdd=0,sadd=0,badd=0,BusExp=0,NetAmountIncome=0;
	static Scanner in=new Scanner(System.in);
	public static int Networth(int a) {
		FinalNetworth=FinalNetworth+a;
		return FinalNetworth ;
	}
	public static int NetWorth(int x,int y) {
		int c=x-y;
		return Math.abs(c);
	}
 
 static void comeHere(){	 
	boolean entLoop=true;
	while(entLoop) {
	System.out.println("1.Income Details");
	System.out.println("2.Expense Details");
	System.out.println("3.Networth Details");
	System.out.println("4.Exit");
	int expoper=in.nextInt();
	
	

switch(expoper) 
{
case 1:System.out.println("1->Salary Income");
	   System.out.println("2->Business Income");
	   System.out.println("3->Only Total Salary Earnings");
	   System.out.println("4->Only Total Business Earnings");
	   System.out.println("5->Both Total Earnings");
	   int incoper=in.nextInt();
if(incoper==1) 
{
System.out.println("Enter Salary");
income=in.nextInt();
sadd=income+sadd;
totalAdd=sadd+badd;
System.out.println("Net Earning="+income);
}
else if(incoper==2) 
{
System.out.println("Enter Profit");
profit=in.nextInt();				     			
badd=profit+badd;
totalAdd=sadd+badd;
System.out.println("Business Earning= "+profit);

}
else if(incoper==3) 
{
System.out.println("Only Total Salary Earnings= "+sadd);
}

else if(incoper==4) 
{
System.out.println("Only Total Business Earnings= "+badd);
}
else if(incoper==5) 
{
System.out.println("Both Total Earnings= "+totalAdd);
}
else System.out.println("Invalid Input");
  break;
case 2: System.out.println("1->Home Expense");
		System.out.println("2->Business Expense");
		System.out.println("3->Total Home Expense");
		System.out.println("4->Total Business Expense");
		System.out.println("5->Both Expense");
		int exoper=in.nextInt();
		if(exoper==1)
		{
			boolean ExLoop=true;
			while(ExLoop) {
			System.out.println("1.Rent Expense");
			System.out.println("2.Food Expense");
			System.out.println("3.Medical Expense");
			System.out.println("4.Travel Expense");
			System.out.println("5.Exit");
			
		int homoper=in.nextInt();
		 switch(homoper) {
			case 1:
			 System.out.println("Enter Rent Amount= ");
		     amount=in.nextInt();
		     HomeExp+=amount;
		     System.out.println("Home Rent Expense Done"+amount);
		     break;
			case 2:
				System.out.println("Enter Food Amount= ");
			    amount=in.nextInt();
			    System.out.println("Food Expense Done"+amount);
			    HomeExp+=amount;
			    break;
			case 3:
				System.out.println("Enter Medical Amount= ");
			    amount=in.nextInt();
			    System.out.println("Medical Expense Done"+amount);
			    HomeExp+=amount;
			    break;
			case 4:
				System.out.println("Enter Travel Amount= ");
			    amount=in.nextInt();
			    System.out.println("Travel Expense Done"+amount);
			    HomeExp+=amount;
			    break; 
			case 5:
				ExLoop=false;
				break;
				default :System.out.println("Invalid Input");
				break;
			}
		}
			NetAmountIncome=personnalCalculator.NetWorth(totalAdd, HomeExp);
			System.out.println(NetAmountIncome);
		}
		else if(exoper==2) 
		{
			boolean ExLoop=true;
			while(ExLoop) {
			System.out.println("1.Rent Expense");
			System.out.println("2.Labour Salary");
			System.out.println("3.Travel Expense");
			System.out.println("4.Exit");
			
		int homoper=in.nextInt();
		 switch(homoper) {
			case 1:
			 System.out.println("Enter Rent Amount= ");
		     amount=in.nextInt();
		     BusExp+=amount;
		     System.out.println("Shop Rent Expense Done"+amount);
		     break;
			case 2:
				System.out.println("Enter Labour Salary");
			    amount=in.nextInt();
			    System.out.println("Labour Salary Given"+amount);
			    BusExp+=amount;
			    break;
			case 3:
				System.out.println("Enter Travel Expense");
			    amount=in.nextInt();
			    System.out.println("Travel Expense Done"+amount);
			    BusExp+=amount;
			    break; 
			case 4:
				ExLoop=false;
				break;
				default :System.out.println("Invalid Input");
				break;
			}
		}
			NetAmountIncome=personnalCalculator.NetWorth(totalAdd,BusExp);
			System.out.println(NetAmountIncome);
		}
		else if(exoper==3) {
			System.out.println("Total Home Expenses="+HomeExp);
		}
		else if(exoper==4) {
			System.out.println("Total Business Expenses="+BusExp);
		}
		else if(exoper==5) {
			System.out.println("Both Expenses="+(HomeExp+BusExp));
		}
		else System.out.println("Invalid Input");
		
		break;
case 3:System.out.println("Networth="+personnalCalculator.NetWorth(totalAdd,(HomeExp+BusExp)));
	   break;
		
		
case 4:calciRunner.main(null);
		entLoop=false;
		break;

default: System.out.println("Wrong Input");
	 break;
}
}
}
}


