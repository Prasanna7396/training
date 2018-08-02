//public interface i1
//{
//	public int count=1;
//}
public class Books  {
	public  String bname;
	public Books(){
		
	}
	public Books(String bname) {
	   this.bname=bname;
	}
    //int count=0;
	static int count=1;
	private String name;
	public void issueBook(Member m1) {
		if (count==0)
		{
			System.out.println("book unavailable");
			
		}
		else
		{
			
			System.out.println("issuing book to"+m1.Mname);
			count--;
			
		}
			
	}
	public void return_book(String name)
	{
		this.name=name;
		count++;
		System.out.println("book returned by"+this.name);
	}
	public void getMember(Member m2)
	{
	    	if(count==0)
	    	{
	    		System.out.println("book taken by:"+m2.Mname);
	    		
	    	}
	    	else
	    	{
	    		System.out.println("book not issued");
	    	}
	}
}
