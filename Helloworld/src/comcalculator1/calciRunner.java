package comcalculator1;

import java.util.Scanner;

public class calciRunner extends Calculator {
	static Log logp;
	static Log logp1;
    static void checkPass(Object a1,Object a2) {
	String a=a1.toString();
	String b=a2.toString();
	if(a.equals(b)) {
		personnalCalculator.comeHere();
	}
	else System.out.println("Invalid Input");
}
public static void main(String[] args) {	
	boolean floop=true;
	Scanner in=new Scanner(System.in);
	while(floop) {
	System.out.println("press 1 for Normal Calculator");
	System.out.println("press 2 for Gst Calculator");
	System.out.println("press 3 for Personnal Calculator");
	System.out.println("Press 4 for Exit");
	
	int operation=in.nextInt();
	switch(operation)
	{
		case 1:
			System.out.print("Give two Numbers");
			double num1=in.nextDouble();
			double num2=in.nextDouble();
			System.out.println("1.+");
			System.out.println("2.-");
			System.out.println("3.*");
			System.out.println("4./");
			System.out.println("5.%");
			int c=in.nextInt();
			Normalcalculator(num1,num2,c);
			break;
		case 2:
			System.out.println("Enter Value");
			double value=in.nextDouble();
			System.out.println("Enter percentage");
			double per=in.nextDouble();
			System.out.println("1->+\n2->-");
			int gstoper=in.nextInt();
			switch(gstoper)
			{	
				case 1: System.out.println(GstCalculator.add(value,per));
				break;
				case 2: System.out.println(GstCalculator.sub(value,per));
				break;	
				default :System.out.println("Wrong Input");
			}
			break;
			
	case 3:boolean log=true;
			while(log) {
			System.out.println("1.Login\n2.Register\n3.Exit");
			int logoper=in.nextInt();
			if(logoper==1) {
				System.out.println("Enter UserName");
				String checkuser=in.next();
				System.out.println("Enter Password");
				String checkPassWord=in.next();
				 logp1=new Log(checkuser,checkPassWord);
				calciRunner.checkPass(logp1,logp);
				//System.out.println(logp1);
			}
			else if(logoper==2) {
				boolean b=true;
				while(b) {
				System.out.println("Enter UserName");
				String logUser=in.next();
				System.out.println("Enter Password");
				String passWord=in.next();
				 logp=new Log(logUser,passWord);
				//System.out.println(logp);
				b=false;
				}
			}
			else if(logoper==3) {
				main(null);
				log=false;
			}
			else System.out.println("Invalid Input");
				}
	case 4:floop=false;
			break;
			default:System.out.println("invalid Input");
					break;
   }
  }
	in.close();
 }
}

