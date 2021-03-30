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
    public void getOrdersCountByTripFoundId() throws SQLException{
        users_in_tripsDAO usrt = new users_in_tripsDAO();
        scheduleDAO sch = new scheduleDAO();
        schedule trip = sch.getTripById(1);
        List<users_in_trips> result = usrt.getOrdersByTripId(trip);
        Assert.assertEquals(result.size(), 2);
    }

    @Test
    public void getOrdersCountByTripNotFoundId() throws SQLException{
        users_in_tripsDAO usrt = new users_in_tripsDAO();
        scheduleDAO sch = new scheduleDAO();
        schedule trip = sch.getTripById(2);
        List<users_in_trips> result = usrt.getOrdersByTripId(trip);
        Assert.assertEquals(result.size(), 0);
    }
}
