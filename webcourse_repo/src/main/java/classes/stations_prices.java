package classes;


import javax.persistence.*;

@Entity
@Table(name = "stations_prices")
public class stations_prices {
    private stations from_station_id;
    private stations to_station_id;
    private double price;
    private int stations_price_id;

    public stations_prices(){
    }

    public stations_prices(stations from_station_id, stations to_station_id, double price, int stations_price_id) {
        this.from_station_id = from_station_id;
        this.to_station_id = to_station_id;
        this.price = price;
        this.stations_price_id = stations_price_id;
    }

    @ManyToOne(targetEntity = stations.class)
    @JoinColumn(name = "from_station_id", referencedColumnName = "station_id")
    public stations getFrom_station_id() {
        return from_station_id;
    }

    public void setFrom_station_id(stations from_station_id) {
        this.from_station_id = from_station_id;
    }

    @ManyToOne(targetEntity = stations.class)
    @JoinColumn(name = "to_station_id", referencedColumnName = "station_id")
    public stations getTo_station_id() {
        return to_station_id;
    }

    public void setTo_station_id(stations to_station_id) {
        this.to_station_id = to_station_id;
    }

    @Column(name = "price")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Id
    @Column(name = "stations_price_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getStations_price_id() {
        return stations_price_id;
    }

    public void setStations_price_id(int stations_price_id) {
        this.stations_price_id = stations_price_id;
    }
}
