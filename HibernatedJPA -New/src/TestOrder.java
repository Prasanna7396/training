import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.util.HibernateUtil;

public class TestOrder {
	@Test
	public void testCase5() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		Order od = new Order();
		od.setOrderDate(new Date());
		od.setAmount(1000);
		od.setPromoCode("ABC123");
		
		session.save(od);
		tx.commit();
	
		
		
	
	
	}
}
