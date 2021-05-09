package DAO;

import classes.schedule;
import classes.users;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.HibernateSessionFactoryUtil;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

public class usersDAO {


    public void addUser(users user) throws SQLException{
        Session session = null;
        session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        if (session != null && session.isOpen()) {
            session.close();
        }
    }

    public void updateUser(users user) throws SQLException{
        Session session = null;
        session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(user);
        session.getTransaction().commit();
        if (session != null && session.isOpen()) {
            session.close();
        }
    }

    public void deleteUser(users user) throws SQLException{
        Session session = null;
        session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(user);
        session.getTransaction().commit();
        if (session != null && session.isOpen()) {
            session.close();
        }
    }

    public users getUserById(int user_id) throws SQLException {
        Session session = null;
        users user = null;
        session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        user = (users) session.load(users.class, user_id);
        if (session != null && session.isOpen()) {
            session.close();
        }
        return user;
    }

    public List<users> loadAll() throws SQLException{
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<users> criteria = builder.createQuery(users.class);
        criteria.from(users.class);
        List<users> response = session.createQuery(criteria).getResultList();
        session.close();
        return response;
    }


}
