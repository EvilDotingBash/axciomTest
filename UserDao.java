package org.axciom.dao;

import org.axciom.model.User;
import org.axciom.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class UserDao {
	public User getUserById(String userid) {
		Session session = null;
		User user = null;
		try {
			session = HibernateUtil.getSession();
			if (session != null) {
				user = session.load(User.class, userid);
				if (user != null) {
					System.out.println(user);
					return user;

				}
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} /*
			 * finally {
			 * 
			 * HibernateUtil.closeSession(session); HibernateUtil.closeSessionFactory(); }
			 */
		System.out.println(user);
		return user;
	}
}
