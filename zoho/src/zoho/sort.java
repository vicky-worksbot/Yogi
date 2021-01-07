package zoho;
import java.util.*;
public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt(),n2=sc.nextInt(),k=2;
		int a[]=new int[n1];
		int b[]=new int[n2];
		for(int i=0;i<n1;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n2;i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i=0;i<n1;i++)
		{
			for(int j=i+1;j<n1;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<n2;i++)
		{
			for(int j=i+1;j<n2;j++)
			{
				if(b[i]>b[j])
				{
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
			    if(a[i]<b[j])
			    {
			        int temp=a[i];
			        a[i]=b[j];
			        b[j]=temp;
			    }
				if(b[j]<a[i])
				{
					int temp=b[j];
					b[j]=a[i];
					a[i]=temp;
							
				}
			}
		}
		for(int i=0;i<n2;i++)
		{
			for(int j=i+1;j<n2;j++)
			{
				if(b[i]>b[j])
				{
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		System.out.println("");
		for(int i=0;i<n1;i++){
		    System.out.print(a[i]+" ");
		}
		for(int i=0;i<n2;i++){
		    System.out.print(b[i]+" ");
		}
		System.out.println("");
		int l=k-n1;
		if(l>0)
			System.out.print("kth value is"+b[l-1]);
		else if(l<=0)
		{
		        if(l!=0)
					System.out.print("kth value is"+a[k-1]);
				else if(l==0)
				    System.out.print("kth value is"+a[a.length-1]);
		}
	}
}
