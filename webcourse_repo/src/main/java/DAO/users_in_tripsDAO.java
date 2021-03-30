package DAO;

import classes.schedule;
import classes.users_in_trips;
import classes.users;
import org.hibernate.Session;
import util.HibernateSessionFactoryUtil;
import org.hibernate.query.Query;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class users_in_tripsDAO {
    public List<users_in_trips> getOrdersByUserId (users user) throws SQLException{
        Session session = null;
        List<users_in_trips> trips = new ArrayList<users_in_trips>();
        session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query<users_in_trips> query = session.createQuery("from users_in_trips WHERE user_id = :user_id", users_in_trips.class);
        query.setParameter("user_id", user);
        trips = (List<users_in_trips>)query.list();
        session.getTransaction().commit();
        if (session != null && session.isOpen()) {
            session.close();
        }
        return trips;
    }

    public void addTicketsOrder (users_in_trips order) throws SQLException{
        Session session = null;
        session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(order);
        session.getTransaction().commit();
        if (session != null && session.isOpen()) {
            session.close();
        }
    }


    public List<users_in_trips> getOrdersByTripId (schedule trip) throws SQLException{
        Session session = null;
        List<users_in_trips> trips = new ArrayList<users_in_trips>();
        session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query<users_in_trips> query = session.createQuery("from users_in_trips WHERE trip_id = :trip_id", users_in_trips.class);
        query.setParameter("trip_id", trip);
        trips = (List<users_in_trips>)query.list();
        session.getTransaction().commit();
        if (session != null && session.isOpen()) {
            session.close();
        }
        return trips;
    }

    public int getOrdersCountByTripId (schedule trip) throws SQLException {
        Session session = null;
        int trips_cnt = 0;
        session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query<users_in_trips> query = session.createQuery("from users_in_trips WHERE trip_id = :trip_id", users_in_trips.class);
        query.setParameter("trip_id", trip);
        trips_cnt = query.list().size();
        session.getTransaction().commit();
        if (session != null && session.isOpen()) {
            session.close();
        }
        return trips_cnt;
    }
}
