import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.pojo.Person;
import lti.util.HibernateUtil;

public class TestPerson {

	@Test
	public void testSaveBook() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		Person p = new Person(new Person.Id("Pakistan", 123465), "Polo", 21);
		session.save(p);
		tx.commit();
		
	}
}
