CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

-- удаление таблиц если они существуют

DROP TABLE IF EXISTS stations_prices;
DROP TABLE IF EXISTS stations_in_routes;
DROP TABLE IF EXISTS users_in_trips;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS schedule;
DROP TABLE IF EXISTS routes;
DROP TABLE IF EXISTS stations;

-- теперь создадим таблицы

CREATE TABLE IF NOT EXISTS users
(
    user_id           serial PRIMARY KEY,
    is_admin          bool,
    user_name         text NOT NULL,
    user_contact_info text
);



CREATE TABLE IF NOT EXISTS routes(
    route_id    serial PRIMARY KEY
    ,route_name text
);

CREATE TABLE IF NOT EXISTS stations(
    station_name    text
    ,station_id     serial PRIMARY KEY
);

CREATE TABLE IF NOT EXISTS stations_prices(
    from_station_id     int REFERENCES stations (station_id)
    ,to_station_id      int REFERENCES stations (station_id)
    ,price              numeric
    ,stations_price_id  serial PRIMARY KEY
);

CREATE TABLE IF NOT EXISTS stations_in_routes(
    station_id           int REFERENCES stations (station_id)
    ,route_id            int REFERENCES routes (route_id)
    ,number_in_route     int
    ,station_in_route_id serial PRIMARY KEY
)
;

CREATE TABLE IF NOT EXISTS schedule(
    trip_id     serial PRIMARY KEY
    ,route_id   int REFERENCES routes (route_id)
    ,date_time  timestamp
    ,seats      int
)
;

CREATE TABLE IF NOT EXISTS users_in_trips(
    user_id           int REFERENCES users (user_id),
    trip_id           int REFERENCES schedule (trip_id),
    number_of_tickets int,
    from_station_id   int REFERENCES stations (station_id),
    to_station_id     int REFERENCES stations (station_id),
    user_in_trip_id   serial PRIMARY KEY
);
