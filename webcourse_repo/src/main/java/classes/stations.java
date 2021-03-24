package classes;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "stations")
public class stations {

    private int station_id;
    private String station_name;

    public stations (){
    }

    public stations (int station_id, String station_name){
        this.station_id = station_id;
        this.station_name = station_name;
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
}
