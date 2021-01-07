package zoho;
import java.util.*;
public class reve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		String a="I am Indian";
		String a1[]=a.split("\\s");
		for(int i=a1.length-1;i>=0;i--)
		{
			if(i!=0)
			System.out.print(a1[i]+" ");
			else System.out.print(a1[i]);
		}
		
	}

}
