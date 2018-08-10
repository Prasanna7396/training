package lti.pojo.bank;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import lti.util.HibernateUtil;

public class TestBank {

	@Test
	public void createaccount() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		Account acc = new Account();
		acc.setAccountId(101);
		acc.setHolder("Kaushal");
		acc.setBalance(5000);

		session.save(acc);
		tx.commit();
	}

}
