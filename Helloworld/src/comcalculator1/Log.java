package comcalculator1;

public class Log {
	private String UserName;
	private String passWord;
	Log(String UserName,String passWord)
	{
	 this.UserName=UserName;
	 this.passWord=passWord;
   }
 


    public String getUserName() {
		return this.UserName+this.passWord;
	}
@Override
public String toString() {
	return  this.UserName+this.passWord ;
}
	
	
}
