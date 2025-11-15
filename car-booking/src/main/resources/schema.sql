DROP TABLE IF EXISTS bookings;
DROP TABLE IF EXISTS car;

CREATE TYPE car_status_enum AS ENUM ('ACTIVE', 'MAINTENANCE', 'UNAVAILABLE');

CREATE TABLE car (
  id       VARCHAR(10) PRIMARY KEY,
  plate_number VARCHAR(10) UNIQUE NOT NULL,
  model    VARCHAR(255) NOT NULL,
  car_type     VARCHAR(20) NOT NULL,
  color    VARCHAR(20) NOT NULL, 
  year_model    SMALLINT,
  car_status   car_status_enum NOT NULL DEFAULT 'ACTIVE'
);

-- CREATE TABLE bookings (
--     id BIGINT PRIMARY KEY AUTO_INCREMENT,
--     car_id BIGINT NOT NULL,
--     start_date TIMESTAMP NOT NULL,
--     end_date TIMESTAMP NOT NULL,
--     renter_name VARCHAR(100) NOT NULL,
--     payment_status VARCHAR(20),
--     amount_paid DOUBLE,
--     CONSTRAINT fk_car FOREIGN KEY (car_id) REFERENCES cars(id)
-- );