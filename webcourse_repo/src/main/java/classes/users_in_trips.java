package classes;


import javax.persistence.*;

public class users_in_trips {
    private int number_of_tickets;
    private stations from_station_id;
    private stations to_station_id;
    private int user_in_trip_id;

    private schedule trip_id;
    private users user_id;

    public users_in_trips(){
    }

    public users_in_trips(schedule trip_id, int number_of_tickets, stations from_station_id, stations to_station_id, int user_in_trip_id, users user_id) {
        this.trip_id = trip_id;
        this.number_of_tickets = number_of_tickets;
        this.from_station_id = from_station_id;
        this.to_station_id = to_station_id;
        this.user_in_trip_id = user_in_trip_id;
        this.user_id = user_id;
    }


    @Column(name = "number_of_tickets")
    public int getNumber_of_tickets() {
        return number_of_tickets;
    }

    public void setNumber_of_tickets(int number_of_tickets) {
        this.number_of_tickets = number_of_tickets;
    }

    @ManyToOne(targetEntity = stations.class)
    @JoinColumn(name = "station_id")
    public stations getFrom_station_id() {
        return from_station_id;
    }

    public void setFrom_station_id(stations from_station_id) {
        this.from_station_id = from_station_id;
    }

    @ManyToOne(targetEntity = stations.class)
    @JoinColumn(name = "station_id")
    public stations getTo_station_id() {
        return to_station_id;
    }

    public void setTo_station_id(stations to_station_id) {
        this.to_station_id = to_station_id;
    }

    @Id
    @Column(name = "user_in_trip_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getUser_in_trip_id() {
        return user_in_trip_id;
    }

    public void setUser_in_trip_id(int user_in_trip_id) {
        this.user_in_trip_id = user_in_trip_id;
    }

    @ManyToOne(targetEntity = users.class)
    @JoinColumn(name = "user_id")
    public users getUser() {
        return user_id;
    }

    public void setUser(users user_id) {
        this.user_id = user_id;
    }


    @ManyToOne(targetEntity = schedule.class)
    @JoinColumn(name = "trip_id")
    public schedule getTrip() {
        return trip_id;
    }

    public void setTrip(schedule trip_id) {
        this.trip_id = trip_id;
    }
}
