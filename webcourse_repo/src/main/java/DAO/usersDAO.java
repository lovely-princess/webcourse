package DAO;

import classes.users;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.HibernateSessionFactoryUtil;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public class usersDAO {


    public List<users> loadAll(){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<users> criteria = builder.createQuery(users.class);
        criteria.from(users.class);
        List<users> response = session.createQuery(criteria).getResultList();
        session.close();
        return response;
    }
}
