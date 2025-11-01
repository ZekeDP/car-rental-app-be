-- Cars
INSERT INTO cars (id, name, model, image_url, owner_name) VALUES
  (1, 'Toyota Corolla', '2020', 'https://example.com/images/toyota.jpg', 'Main Garage'),
  (2, 'Honda Civic', '2021', 'https://example.com/images/honda.jpg', 'Alpha Rentals'),
  (3, 'Ford Explorer', '2019', 'https://example.com/images/ford.jpg', 'Beta Motors');

-- Bookings
INSERT INTO bookings (id, car_id, start_date, end_date, renter_name, payment_status, amount_paid) VALUES
  (1, 1, '2025-07-10 09:00:00', '2025-07-12 17:00:00', 'Alice Johnson', 'PAID', 150.0),
  (2, 2, '2025-07-11 10:00:00', '2025-07-13 14:00:00', 'Bob Smith', 'PARTIAL', 75.0),
  (3, 3, '2025-07-15 08:00:00', '2025-07-16 18:00:00', 'Carlos Vega', 'UNPAID', 0.0);