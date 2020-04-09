package dao;

import javax.inject.Inject;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import model.Login;

public class LoginDAO {

    @Inject private Session session;

	public Login loadByRa(Integer ra) {
		Criteria criteria = session.createCriteria(Login.class, "login");

        criteria.add(Restrictions.eq("login.ra", ra));
		return (Login) criteria.uniqueResult();
	}
}