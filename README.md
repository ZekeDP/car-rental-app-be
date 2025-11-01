# 🚗 Car Booking Monitor

A simple and effective system to monitor and manage car bookings across company-owned and subcontractor-owned vehicles. Designed to provide calendar-based visibility of rental status, booking details, and payment tracking.

---

## 📌 Features

- View all company and subcontractor cars in a dashboard
- See booking status via calendar interface (Google Calendar style)
- Track who booked each car, when, and how much was paid
- Add, edit, or extend bookings
- Auto-sync with calendar
- Role support (car owner, subcontractor, admin) – *planned in future milestone*

---

## 🛠️ Tech Stack

**Backend**:
- Java + Spring Boot
- Spring Web, Spring Data JPA
- H2 (for local dev), PostgreSQL (planned)

**Frontend** *(Optional for MVP)*:
- React (or plain HTML/JS templates)
- FullCalendar.io for calendar integration

---

# 🗄️ H2 Database Dev Configuration

This project uses **H2** as the in-memory database for local development and testing.

---

## ⚙️ Configuration Details

- **Database URL**:  
  `jdbc:h2:mem:carbookingdb`

  This creates a non-persistent in-memory database named `carbookingdb`.

- **H2 Console Access**:  
  Open in your browser:  
  [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

  **JDBC URL to use in console**:  
  `jdbc:h2:mem:carbookingdb`

---

## 🧱 Project Structure

