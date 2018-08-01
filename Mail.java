
public class Mail {


	public static void main (String args[])
	{
		String mail ="abcd@gma.co";
	if(mail.indexOf('@')>=4 && mail.indexOf('.')>=8 && (mail.charAt(mail.length()-4)=='.'|| (mail.charAt(mail.length()-3)=='.')))
			{
		System.out.println("valid");
	}
	}
}
