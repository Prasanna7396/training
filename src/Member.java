
public class Member {
	
	public static String Mname;

	public Member(){
	
	}
	public Member(String Mname) {
		this.Mname=Mname;
	}

	public static void getbooks()
	{
		//Books b=new Books();
		Books.count--;
		if(Books.count==0)
		{
			System.out.println("book taken");
		}
		else
		{
			System.out.println("book available");
		}
	}

}
