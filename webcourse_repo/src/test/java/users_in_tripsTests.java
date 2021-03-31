import DAO.usersDAO;
import DAO.users_in_tripsDAO;
import classes.*;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import DAO.scheduleDAO;

import org.testng.annotations.Test;
import org.testng.Assert;

public class users_in_tripsTests {
    @Test
    public void getOrdersCountByTripIdFound() throws SQLException{
        users_in_tripsDAO usrt = new users_in_tripsDAO();
        scheduleDAO sch = new scheduleDAO();
        schedule trip = sch.getTripById(1);
        int result = usrt.getOrdersCountByTripId(trip);
        Assert.assertEquals(result, 2);
    }

    @Test
    public void getOrdersCountByTripIdNotFound() throws SQLException{
        users_in_tripsDAO usrt = new users_in_tripsDAO();
        scheduleDAO sch = new scheduleDAO();
        schedule trip = sch.getTripById(2);
        int result = usrt.getOrdersCountByTripId(trip);
        Assert.assertEquals(result, 0);
    }

    @Test
    public void getOrdersByTripIdFound() throws SQLException{
        users_in_tripsDAO usrt = new users_in_tripsDAO();
        scheduleDAO sch = new scheduleDAO();
        schedule trip = sch.getTripById(1);
        List<users_in_trips> result = usrt.getOrdersByTripId(trip);
        Assert.assertEquals(result.size(), 2);
    }

    @Test
    public void getOrdersByTripIdNotFound() throws SQLException{
        users_in_tripsDAO usrt = new users_in_tripsDAO();
        scheduleDAO sch = new scheduleDAO();
        schedule trip = sch.getTripById(2);
        List<users_in_trips> result = usrt.getOrdersByTripId(trip);
        Assert.assertEquals(result.size(), 0);
    }


    @Test
    public void getOrdersByUserIdFound() throws SQLException{
        users_in_tripsDAO usrt = new users_in_tripsDAO();
        usersDAO user_dao = new usersDAO();
        users user = user_dao.getUserById(1);
        List<users_in_trips> result = usrt.getOrdersByUserId(user);
        Assert.assertEquals(result.size(), 1);
    }

    @Test
    public void getOrdersByUserIdNotFound() throws SQLException{
        users_in_tripsDAO usrt = new users_in_tripsDAO();
        usersDAO user_dao = new usersDAO();
        users user = user_dao.getUserById(3);
        List<users_in_trips> result = usrt.getOrdersByUserId(user);
        Assert.assertEquals(result.size(), 0);
    }

}
