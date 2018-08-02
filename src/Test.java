
public class Test {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Books ab=new Books("the ad");
		Member m1=new Member("polo");
		ab.issueBook(m1);
		ab.getMember(m1);
		ab.return_book("polo");
		ab.issueBook(m1);
		
	}

}
