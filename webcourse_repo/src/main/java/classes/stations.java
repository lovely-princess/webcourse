package classes;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "stations")
public class stations {

    private int station_id;
    private String station_name;
    private routes route_id;
    private int number_in_route;

    public stations (){
    }

    public stations (int station_id, String station_name, routes route_id, int number_in_route){
        this.station_id = station_id;
        this.station_name = station_name;
        this.route_id = route_id;
        this.number_in_route = number_in_route;
    }

    @Id
    @Column(name = "station_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getStation_id(){
        return this.station_id;
    }
    public void setStation_id(int station_id) {
        this.station_id = station_id;
    }

    @Column(name = "station_name")
    public String getStation_name(){
        return this.station_name;
    }
    public void setStation_name(String station_name){
        this.station_name = station_name;
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

}
