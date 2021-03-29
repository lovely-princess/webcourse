package DAO;

import classes.schedule;
import classes.stations;
import classes.users;
import classes.users_in_trips;
import org.hibernate.Session;
import org.hibernate.query.Query;
import util.HibernateSessionFactoryUtil;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class scheduleDAO {

    public void addTrip(schedule trip){
        Session session = null;
        session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(trip);
        session.getTransaction().commit();
        if (session != null && session.isOpen()) {
            session.close();
        }
    }

    public void updateTrip(schedule trip){
        Session session = null;
        session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(trip);
        session.getTransaction().commit();
        if (session != null && session.isOpen()) {
            session.close();
        }
    }

    public void deleteTrip(schedule trip){
        Session session = null;
        session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(trip);
        session.getTransaction().commit();
        if (session != null && session.isOpen()) {
            session.close();
        }
    }


    public List<schedule> getAllTrips (){
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<schedule> criteria = builder.createQuery(schedule.class);
        criteria.from(schedule.class);
        List<schedule> response = session.createQuery(criteria).getResultList();
        session.close();
        return response;
    }

    public List<schedule> getTripsByStations (stations from_station, stations to_station){
        List<schedule> trips = new ArrayList<schedule>();
        if (from_station.getRoute_id() != to_station.getRoute_id()){
            return trips;
        }
        Session session = null;
        session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query<schedule> query = session.createQuery("from schedule WHERE route_id = :route_id", schedule.class);
        query.setParameter("route_id", to_station);
        trips = (List<schedule>)query.list();
        session.getTransaction().commit();
        if (session != null && session.isOpen()) {
            session.close();
        }
        return trips;
    }

    public schedule getTripById(int trip_id) {
        Session session = null;
        schedule trip = null;
        session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        trip = (schedule) session.load(schedule.class, trip_id);
        if (session != null && session.isOpen()) {
            session.close();
        }
        return trip;
    }

    public List<schedule> getTripsByDate (Timestamp date_time){
        Session session = null;
        System.out.println("\n" + date_time + "\n");
        List<schedule> trips = new ArrayList<schedule>();
        session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query<schedule> query = session.createQuery("from schedule WHERE date_time = :date_time", schedule.class);
        query.setParameter("date_time", date_time);
        trips = (List<schedule>)query.list();
        session.getTransaction().commit();
        if (session != null && session.isOpen()) {
            session.close();
        }
        return trips;
    }


}
