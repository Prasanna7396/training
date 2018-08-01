public class Email {


	public static void main (String args[])
	{
		String email ="abcd@gma.c";
	if(email.indexOf('@')>=4 && email.indexOf('.')>=8 && (email.length()-(email.indexOf('.')+1)>2) )
			{
		System.out.println("valid");
	}
	}
}
