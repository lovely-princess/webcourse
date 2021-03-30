import classes.*;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import DAO.scheduleDAO;

import org.testng.annotations.Test;
import org.testng.Assert;

public class scheduleTests {
    @Test
    public void getTripsByDateFoundTest()  throws SQLException{
        scheduleDAO schedule_dao = new scheduleDAO();
        Timestamp date_time = new Timestamp(121, 3, 21, 21, 27, 0, 0);
        List<schedule> date_trips = schedule_dao.getTripsByDate(date_time);
        for (schedule trip : date_trips) {
            Assert.assertEquals(trip.getTrip_id(), 1);
        }
    }

    @Test
    public void getTripsByDateNotFoundTest()  throws SQLException{
        scheduleDAO schedule_dao = new scheduleDAO();
        Timestamp date_time = new Timestamp(120, 3, 21, 21, 27, 0, 0);
        List<schedule> date_trips = schedule_dao.getTripsByDate(date_time);
        Assert.assertEquals(date_trips.size(), 0);
    }

    @Test
    public void getTripsByStationsFoundTest() throws SQLException{
        scheduleDAO schedule_dao = new scheduleDAO();

        stations to_station = new stations();
        stations from_station = new stations();
        routes route = new routes();
        route.setRoute_id(1);
        to_station.setRoute_id(route);
        from_station.setRoute_id(route);
        List<schedule> trips = schedule_dao.getTripsByStations(to_station, from_station);
        Assert.assertNotEquals(trips.size(), 0);

    }

    @Test
    public void getTripsByStationsNotFoundTest() throws SQLException{
        scheduleDAO schedule_dao = new scheduleDAO();

        stations to_station = new stations();
        stations from_station = new stations();

        routes f_route = new routes();
        f_route.setRoute_id(1);
        routes s_route = new routes();
        s_route.setRoute_id(2);
        to_station.setRoute_id(f_route);
        from_station.setRoute_id(s_route);
        List<schedule> trips = schedule_dao.getTripsByStations(to_station, from_station);
        Assert.assertEquals(trips.size(), 0);

    }
}
