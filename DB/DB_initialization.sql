INSERT INTO users (is_admin, user_name, user_contact_info) VALUES
    (TRUE, 'Анатолий Семёнович Павлов', '{"phone": "+7(123)456-78-90"}');

INSERT INTO routes(route_id, route_name, route_price) VALUES
    (1, 'буква к', 123),
    (2, 'нутельная гангстерша', 228),
    (3, 'ах Нинель-Нинель', 69);

INSERT INTO stations(route_id, station_name, number_in_route) VALUES
    (1, 'край мира', 1),
    (1, 'камень познания', 2),
    (1, 'картофельная грядка', 3),
    (1, 'коловорот', 4),
    (1, 'кривая дорожка', 5),
    (1, 'карман Иисуса', 6),
    
    (2, 'брадикардия', 1),
    (2, 'невосполнимая потеря', 2),
    (2, 'костер инквизиции', 3),
    (2, 'улица Ленина', 4),
    (2, 'проклятое место', 5),
    (2, 'предательство лучшего друга', 6),
    
    (3, 'последний рубеж', 1),
    (3, 'самец гепарда', 2),
    (3, 'поле заблудшей души', 3),
    (3, 'начало конца', 4),
    (3, 'ананасовый сироп', 5),
    (3, 'магический амулет', 6),
    (3, 'смысл жизни', 7)
;

INSERT INTO schedule(route_id, date_time, seats)
VALUES  (1, '2021-4-21 21:27:00', 40)
        ,(3, '2021-4-28 22:28:00', 21)
        ,(2, '2021-8-2 12:12:12', 12)
        ,(3, '2021-5-6 12:34:56', 33)
        ,(2, '2098-01-01 7:30:00', 1)
;

SELECT *
FROM stations JOIN routes r ON r.route_id = stations.route_id;

SELECT *
FROM schedule
WHERE date_time = '2021-04-21 21:27:00.000000';

SELECT count(user_in_trip_id)
FROM users_in_trips
WHERE trip_id = 1
;