package classes;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "stations_in_routes")
public class stations_in_routes {
    private stations station_id;
    private routes route_id;
    private int number_in_route;
    private int station_in_route_id;

    public stations_in_routes() {
    }

    public stations_in_routes(stations station_id, routes route_id, int number_in_route, int station_in_route_id) {
        this.station_id = station_id;
        this.route_id = route_id;
        this.number_in_route = number_in_route;
        this.station_in_route_id = station_in_route_id;
    }

    @ManyToOne(targetEntity = stations.class)
    @JoinColumn(name="station_id")
    public stations getStation_id() {
        return station_id;
    }

    public void setStation_id(stations station_id) {
        this.station_id = station_id;
    }

    @ManyToOne(targetEntity = routes.class)
    @JoinColumn(name="route_id")
    public routes getRoute_id() {
        return route_id;
    }

    public void setRoute_id(routes route_id) {
        this.route_id = route_id;
    }

    @Column(name="number_in_route")
    public int getNumber_in_route() {
        return number_in_route;
    }

    public void setNumber_in_route(int number_in_route) {
        this.number_in_route = number_in_route;
    }

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getStation_in_route_id() {
        return station_in_route_id;
    }

    public void setStation_in_route_id(int station_in_route_id) {
        this.station_in_route_id = station_in_route_id;
    }


}
