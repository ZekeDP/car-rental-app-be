-- Car
INSERT INTO car (id, plate_number, model, car_type, year_model, color, car_status) VALUES
  ('CAR001','ABC1234','Toyota Vios 1.3E AT','Sedan',2022,'Silver','ACTIVE'),
  ('CAR002','XYZ5678','Mitsubishi Montero GLS','SUV',2021,'White','MAINTENANCE');

-- Bookings
-- INSERT INTO bookings (id, car_id, start_date, end_date, renter_name, payment_status, amount_paid) VALUES
--   (1, 1, '2025-07-10 09:00:00', '2025-07-12 17:00:00', 'Alice Johnson', 'PAID', 150.0),
--   (2, 2, '2025-07-11 10:00:00', '2025-07-13 14:00:00', 'Bob Smith', 'PARTIAL', 75.0),
--   (3, 3, '2025-07-15 08:00:00', '2025-07-16 18:00:00', 'Carlos Vega', 'UNPAID', 0.0);