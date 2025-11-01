DROP TABLE IF EXISTS bookings;
DROP TABLE IF EXISTS cars;

CREATE TABLE cars (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    model VARCHAR(50),
    image_url VARCHAR(255),
    owner_name VARCHAR(100)
);

CREATE TABLE bookings (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    car_id BIGINT NOT NULL,
    start_date TIMESTAMP NOT NULL,
    end_date TIMESTAMP NOT NULL,
    renter_name VARCHAR(100) NOT NULL,
    payment_status VARCHAR(20),
    amount_paid DOUBLE,
    CONSTRAINT fk_car FOREIGN KEY (car_id) REFERENCES cars(id)
);