package DAO;

import classes.routes;
import org.hibernate.Session;
import util.HibernateSessionFactoryUtil;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.sql.SQLException;
import java.util.List;

public class routesDAO {


    public List<routes> loadAll() throws SQLException{
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<routes> criteria = builder.createQuery(routes.class);
        criteria.from(routes.class);
        List<routes> response = session.createQuery(criteria).getResultList();
        session.close();
        return response;
    }


}
