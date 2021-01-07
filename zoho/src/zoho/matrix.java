package zoho;
import java.util.*;
public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		int b[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				
				if(i==0 || i==m-1 ||j==0 || j==n-1)
						b[i][j]=a[i][j]*2;
	
				else 
					b[i][j]=a[i][j]/2;
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j!=n-1)
					System.out.print(b[i][j]+" ");
				else System.out.print(b[i][j]);
			}
			System.out.println();
		}
	}
}
